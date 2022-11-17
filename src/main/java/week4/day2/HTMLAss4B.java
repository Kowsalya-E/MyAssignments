package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLAss4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//table//caption[text()='The Three Most Popular JavaScript Libraries']//following::tbody[1]//tr"));
		int rowcount=rows.size();
		System.out.println("Rows count is " +rowcount);
		List<WebElement> columns=driver.findElements(By.xpath("//table//caption[text()='The Three Most Popular JavaScript Libraries']//following::tbody[1]//tr[1]//td"));
		int columncount=columns.size();
		System.out.println("Columns count is " +columncount);
		driver.close();
	}

}

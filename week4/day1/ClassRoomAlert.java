package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		WebElement prompt=driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("CompanyName");
		String txt=driver.switchTo().alert().getText();
		System.out.println("Alert message is " +txt);
		driver.switchTo().alert().accept();
		
		

	}

}

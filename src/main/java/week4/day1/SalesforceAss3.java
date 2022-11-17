package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAss3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("ramkumar.ramaiah@testleaf.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password#123");
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));	
		login.click();
		Thread.sleep(3000);
		WebElement learnmore=driver.findElement(By.xpath("//span[text()='Learn More']//.."));	
		learnmore.click();
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String acttitle=driver.getTitle();
		System.out.println("The title is " +acttitle);
		driver.close();
		driver.switchTo().window(list.get(0));
		//driver.close();
		
		

	}

}

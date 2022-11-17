package marathon1;

import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		System.out.println("App launcher clicked");
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("task");
		driver.findElement(By.xpath("//mark[text()='Task']")).click();
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//label[text()='Subject']//following::input[1]")).sendKeys("Bootcamp");
		System.out.println("Entered Bootcamp");
		driver.findElement(By.xpath("(//span[text()='Status'])[2]//following::a")).click();
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		String txt=driver.findElement(By.xpath("//span[text()='Task']")).getText();
		System.out.println("Text message is :" +txt);
		if(txt.contains("was created."))
		{
			System.out.println("Task created successfully");
		}
		else
		{
			System.out.println("Task is not created");
		}
			
		//driver.close();
		
		

	}

}

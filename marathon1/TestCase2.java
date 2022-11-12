package marathon1;

import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
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
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement acc=driver.findElement(By.xpath("//span[text()='Opportunities']"));	
		driver.executeScript("arguments[0].click();", acc);
		driver.findElement(By.xpath("//div[text()='New']")).click(); 
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Kowsalya");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("10/19/2022");		
		WebElement dd=driver.findElement(By.xpath("//label[text()='Stage']//following::lightning-icon"));	
		driver.executeScript("arguments[0].click();", dd);
		driver.findElement(By.xpath("//label[text()='Stage']//following::span[text()='Needs Analysis']")).click();	
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String txt=driver.findElement(By.xpath("//span[text()='Opportunity']")).getText();
		System.out.println("Text message is :" +txt);
		if(txt.contains("was created."))
		{
			System.out.println("Opportunity created successfully");
		}
		else
		{
			System.out.println("Opportunity is not created");
		}
		
		//driver.close();
		
		

	}

}

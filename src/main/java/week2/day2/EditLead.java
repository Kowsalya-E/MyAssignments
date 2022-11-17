package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));	
		submit.click();
		WebElement link=driver.findElement(By.xpath("//a//img"));	
		link.click();
		WebElement leadslink=driver.findElement(By.linkText("Leads"));	
		leadslink.click();
		WebElement findlead=driver.findElement(By.xpath("//a[text()='Find Leads']"));	
		findlead.click(); 		
		WebElement firstname=driver.findElement(By.xpath("//span[text()='Name and ID']//following::label[text()='First name:']//following::input[@name='firstName']"));	
		firstname.sendKeys("Kowsalya");		
		WebElement findleadsbtn=driver.findElement(By.xpath("//button[text()='Find Leads']"));	
		findleadsbtn.click();		
		Thread.sleep(1000);
		WebElement firstrow=driver.findElement(By.xpath("(//div[text()='First name']//following::tr//div//a)[1]"));	
		firstrow.click();
		String title=driver.getTitle();
		String actualtitle="View Lead | opentaps CRM";
		if(title.equals(actualtitle))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
		}
		WebElement editbtn=driver.findElement(By.xpath("//a[text()='Edit']"));	
		editbtn.click();
		WebElement companyname=driver.findElement(By.id("updateLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("UpdatedTestLeaf");
		WebElement updatebtn=driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']"));	
		updatebtn.click();
		WebElement updatedcompname=driver.findElement(By.id("viewLead_companyName_sp"));
		String actstr="UpdatedTestLeaf";
		String expstr=updatedcompname.getText();
				if(expstr.contains(actstr))
				{
					System.out.println("Updated company name is verified");
				}
				else
				{
					System.out.println("Updated company name is not verified");
				}
		//driver.close();
		
		
	}
}

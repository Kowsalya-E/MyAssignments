package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment1 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
		WebElement createleadlink=driver.findElement(By.linkText("Create Lead"));	
		createleadlink.click();			  
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Testleaf");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Kowsalyan");
		WebElement lastname=driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Elangovan");		     
		WebElement localfirstname=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localfirstname.sendKeys("Kowsalyan");
		WebElement departmentname=driver.findElement(By.xpath("//input[@name='departmentName']"));
		departmentname.sendKeys("Testing");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Software automation testing");
		WebElement mail=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		mail.sendKeys("kowsal@gmail.com");
		WebElement createlead=driver.findElement(By.xpath("//input[@name='submitButton']"));	
		createlead.click();
		String title=driver.getTitle();
		System.out.println("Title is " +title);		
		//	WebElement logout=driver.findElement(By.xpath("//input[@value='Logout']"));	
	//	logout.click();
		//driver.close();
		
	}

}

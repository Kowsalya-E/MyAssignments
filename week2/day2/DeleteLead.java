package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
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
		WebElement createleadlink=driver.findElement(By.linkText("Create Lead"));	
		createleadlink.click();	
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Testleaf");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Kowsalyan");
		WebElement lastname=driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Elangovan");		   
		WebElement ctrycode=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']"));
		 ctrycode.clear();
		 ctrycode.sendKeys("91");
		WebElement prmphno=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']"));
		prmphno.sendKeys("7200648758");
		WebElement areacd=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']"));
		areacd.sendKeys("0");		
		WebElement mail=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		mail.sendKeys("kowsal@gmail.com");
		WebElement createlead=driver.findElement(By.xpath("//input[@name='submitButton']"));	
		createlead.click();
		WebElement findlead=driver.findElement(By.xpath("//a[text()='Find Leads']"));	
		findlead.click();
		WebElement phone=driver.findElement(By.xpath("//span[text()='Phone']"));	
		phone.click(); 
		WebElement coutrycode=driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		coutrycode.clear();
		coutrycode.sendKeys("91");
		WebElement areacode=driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		areacode.sendKeys("0");
		WebElement phonenumber=driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phonenumber.sendKeys("7200648758");
		WebElement findleadsbtn=driver.findElement(By.xpath("//button[text()='Find Leads']"));	
		findleadsbtn.click();	
		Thread.sleep(1000);
		WebElement firstrow=driver.findElement(By.xpath("(//div[text()='First name']//following::tr//div//a)[1]"));
		String captureLeadID=firstrow.getText();
		System.out.println("Capture id is " + '\n' +captureLeadID);
		Thread.sleep(1000);
		firstrow.click();
		WebElement deletebtn=driver.findElement(By.xpath("//a[text()='Delete']"));
		deletebtn.click();		
		Thread.sleep(10000);
		WebElement findleadupdated;
		WebDriverWait wait=new WebDriverWait(driver,30);
		findleadupdated=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Find Leads']")));		
		findleadupdated.click();
		WebElement leadid=driver.findElement(By.xpath("//input[@name='id']"));
		leadid.sendKeys(captureLeadID);
		WebElement findleadsbtnupdated;
		WebDriverWait waitbtn=new WebDriverWait(driver,30);
		findleadsbtnupdated=waitbtn.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Find Leads']")));		
		findleadsbtnupdated.click();
		WebElement acterrdisplay=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String Actualerrormes=acterrdisplay.getText();
		System.out.println("The text is " +Actualerrormes);
		String errormes="No records to display";
		if(errormes.equals(Actualerrormes))
		{
			System.out.println("Error message is verified succesffuly");
		}
		else
		{
			System.out.println("Error message is not verified");
		}
		  
		
			//driver.close();
		
		
	}
}

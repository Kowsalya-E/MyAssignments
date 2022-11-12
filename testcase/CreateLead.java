package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData()
	{
		excelfilename="tc001";
	}
	
   @Test(dataProvider="testData")
	public  void create(String usname,String pasword,String comname,String firname,String lasname)
   {
		driver.findElement(By.id("username")).sendKeys(usname);
		driver.findElement(By.id("password")).sendKeys(pasword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lasname);
		driver.findElement(By.name("submitButton")).click();
		
}
   
  
   
}







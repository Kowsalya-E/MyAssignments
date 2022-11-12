package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleofCreateLead extends ProjectSpecificMethods{
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
   
   @DataProvider(name="testData")
   	   public String[][] testdata()
	   {
		   String data[][]=new String[2][5];
		   data[0][0]="DemoSalesManager";
		   data[0][1]="crmsfa";
		   data[0][2]="TestLeaf";
		   data[0][3]="Hari";
		   data[0][4]="R";
		   
		   data[1][0]="DemoSalesManager";
		   data[1][1]="crmsfa";
		   data[1][2]="SecondTestLeaf";
		   data[1][3]="SecondHari";
		   data[1][4]="SecondR";
				   
		   return data;
		   
	   }
   
}







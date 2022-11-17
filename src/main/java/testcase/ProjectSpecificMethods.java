package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecificMethods {
	public String excelfilename;
	RemoteWebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
	public  void beforespecificmethods(String url,String browser) {
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    }
		else if(browser.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	   }
		else if(browser.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    		}
		else
		{
			System.out.println("Please select applicable driver");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
		
		@AfterMethod
		public  void afterspecificmethods() {
			driver.close();
		
	}
	
		 @DataProvider(name="testData")
	   	   public String[][] sendData() throws IOException
	   	   		   {
			 String data[][]=ReadExcelData.getData(excelfilename);
			return data;  
		   }
	   
}

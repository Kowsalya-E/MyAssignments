package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSample {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\TestLeaf\\SoftwaresTestLeaf\\drive-download-20220925T062233Z-001\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");//Username/Password: Demosalesmanager/crmsfa
		 driver.close();
		 }


}

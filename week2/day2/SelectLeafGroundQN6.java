package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLeafGroundQN6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
	    //-----------------------Which is your favorite UI Automation tool?-------------------------
		WebElement uitool=driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']//following::select"));
	   	Select uidd=new Select(uitool);	
	   	uidd.selectByVisibleText("Cypress");
	    //-----------------------Choose your preferred country.-------------------------
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
	    //-----------------------Confirm Cities belongs to Country is loaded-------------------------
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Select City']")).click();
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//-----------------------Choose the Course------------------------
        driver.findElement(By.xpath("//h5[text()='Choose the Course']//following::button[1]")).click();
        driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	    //-----------------------Choose language randomly------------------------
        driver.findElement(By.xpath("//label[text()='Select Language']")).click();
        driver.findElement(By.xpath("//li[text()='English']")).click();
	    //-----------------------Select 'Two' irrespective of the language chosen------------------------
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Select Values']")).click();
        driver.findElement(By.xpath("//li[text()='Two']")).click();        
   		//driver.close();
		
		
	}

}

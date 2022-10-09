package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomDay2DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));    
      createnew.click();       
      WebElement firstname=driver.findElement(By.name("firstname"));    
      firstname.sendKeys("Kowsalya");
      WebElement lastname=driver.findElement(By.name("lastname"));    
      lastname.sendKeys("Elangovan");
      WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));    
      Select dateselect=new Select(date);
      dateselect.selectByVisibleText("23");
      WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));    
      Select monthselect=new Select(month);
      monthselect.selectByValue("5");
      WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));    
      Select yearselect=new Select(year);
      yearselect.selectByIndex(8);
     // driver.close();      
	}

}

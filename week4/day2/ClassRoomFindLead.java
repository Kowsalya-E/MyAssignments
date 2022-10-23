package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomFindLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));	
		link.click();
		WebElement leadslink=driver.findElement(By.linkText("Leads"));	
		leadslink.click();
		WebElement findlead=driver.findElement(By.xpath("//a[text()='Find Leads']"));	
		findlead.click(); 
		WebElement firstelement=driver.findElement(By.xpath("(//div[text()='Lead ID']//following::table//tr//td//div//a)[1]"));	
		firstelement.click();
		//driver.close();
		
	}

}

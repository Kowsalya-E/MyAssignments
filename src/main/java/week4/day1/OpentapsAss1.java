package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpentapsAss1 {

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
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'From Contact')]//following::a)[1]")).click();		
		Set<String> from=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(from);
		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//tbody//tr//td//div//a)[1]")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//span[contains(text(),'To Contact')]//following::a)[1]")).click();
		Set<String> to=driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(to);
		driver.switchTo().window(list1.get(1));
		driver.manage().window().maximize();
		WebElement contactrow=driver.findElement(By.xpath("(//tbody//tr//td//div//a)[5]"));
		driver.executeScript("arguments[0].click();", contactrow);
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		String actualtitle=driver.getTitle();
		System.out.println("Actual title is :" +actualtitle);
		String expectedtitle="View Contact | opentaps CRM";
		if(actualtitle.equals(expectedtitle))
		{
		
			System.out.println(actualtitle +" Title is verified");
		}
		else
		{
			System.out.println(actualtitle +" Title is not verified");
		}
		driver.close();
		
		

	}

}

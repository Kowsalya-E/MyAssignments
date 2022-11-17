package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev141516.service-now.com/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='user_name']"));	
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("India@123");
		WebElement filter=driver.findElement(By.xpath("//label[text()='Filter navigator']//following::input[@id='filter']"));
		filter.sendKeys("Incidents");
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		driver.close();
			}

}

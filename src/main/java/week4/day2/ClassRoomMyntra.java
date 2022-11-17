package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement men=driver.findElement(By.xpath("//a[text()='Men']"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[text()='Jeans']")).click();
		driver.findElement(By.xpath("//label[text()='Flying Machine']")).click();	
		System.out.println("Checked flying machine");
		//driver.close();
		
		
		

	}

}

package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
        driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> flightwindow=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(flightwindow);
		String flightwindowtitle=driver.switchTo().window(list.get(1)).getTitle();
		System.out.println("Title of flight window" +flightwindowtitle);
		driver.close();
		String trainwindowtitle=driver.switchTo().window(list.get(0)).getTitle();
		System.out.println("Title of train window" +trainwindowtitle);
		driver.close();
		
		
		

	}

}

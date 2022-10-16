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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioLeafGroundQN4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		//-----------------------------Your most favorite browser------------------
	    WebElement favbrowser=driver.findElement(By.xpath("//h5[text()='Your most favorite browser']//following::div//table//tr//td//div//input//following::span[1]"));
	    favbrowser.click();
	    //-----------------------------UnSelectable------------------	  
	    WebElement unselectable=driver.findElement(By.xpath("//label[text()='Bengaluru']"));
	    unselectable.click();
	    //-----------------------------Find the default select radio button------------------
	    WebElement defaultradio=driver.findElement(By.xpath("//h5[text()='Find the default select radio button']//following::input[@checked='checked']//following::label"));
	    String defaultlabel=defaultradio.getText();
	    System.out.println("Default selected radio button is " +defaultlabel);
	    //-----------------------------Select the age group (only if not selected)------------------
	    boolean selected = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).isSelected();
        //if this element is not selected we are going to select it
	    System.out.println("Selected Status: " +selected);
        if (!selected) {
        	driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).click();
		}
	}
	
		
			//driver.close();
		
		
	}



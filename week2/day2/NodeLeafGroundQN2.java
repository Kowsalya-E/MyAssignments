package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

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

public class NodeLeafGroundQN2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		//--------------------Click and Confirm title.----------------------------
	   WebElement clickandgettitle=driver.findElement(By.xpath("//span[text()='Click']"));
		clickandgettitle.click();
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		driver.navigate().back();
		//--------------------Confirm if the button is disabled.----------------------------
		WebElement disablebtn=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']//following::button[1]"));
		String disablestatus=disablebtn.getAttribute("aria-disabled");
		if(disablestatus.equals("true"))
		{
			System.out.println("Button is disabled");
		}
		else
		{
			System.out.println("Button is not disabled");
		}
		//--------------------Find the position of the Submit button.----------------------------
		Point positionsubmitbtn=driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Submit button position is" +positionsubmitbtn);
		//--------------------Click and Confirm title.----------------------------
		WebElement savebtn=driver.findElement(By.xpath("//h5[text()='Find the Save button color']//following::button[1]"));
		String savebtncolour=savebtn.getCssValue("background-color");//grey color
		System.out.println("save button colour is " +savebtncolour);//(96, 125, 139, 1)
		//--------------------Find the height and width of this button----------------------------
		Dimension sizesubmitbtn=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Submit button size is " +sizesubmitbtn);//(85, 32)
		System.out.println("Submit button Height is " +sizesubmitbtn.height);
		System.out.println("Submit button Width is " +sizesubmitbtn.width);
		///////---------------------------Mouse over and confirm the color changed-----------------------------------///////
		WebElement colourchangebtn=driver.findElement(By.xpath("(//span[text()='Success'])[1]"));
		String btncolour1=colourchangebtn.getCssValue("background-color");
		System.out.println("Before Mouse hover colour is " +btncolour1);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(colourchangebtn).perform();
		Thread.sleep(3000);
		String btncolour=colourchangebtn.getCssValue("background-color");
		System.out.println("After Mouse hover colour is " +btncolour);//salmon rgba(250, 128, 114, 1)
		 if (!btncolour1.equals(btncolour)) {
	    	   System.out.println("color changed");
			
		} else {
			System.out.println("color not changed");

		}
		//--------------------Click Image Button and Click on any hidden button----------------------------
		WebElement hiddenbtn=driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']//following::button[1]"));
		action.doubleClick(hiddenbtn).perform();
		System.out.println("Element clicked twice");
		//--------------------How many rounded buttons are there?----------------------------
		List<WebElement> roundedelements= driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']//following::button"));
		System.out.println("Rounded button count is " +roundedelements.size());		
			//driver.close();
		  		
	}

}

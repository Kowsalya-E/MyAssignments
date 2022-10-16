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

public class CheckboxLeafGroundQN5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//---------------------Basic Checkbox--------------------------------------
	    WebElement basiccheckbox=driver.findElement(By.xpath("//span[text()='Basic']"));
	    basiccheckbox.click();
	    System.out.println("Basic checkbox is checked");
	    //---------------------Notification Checkbox--------------------------------------
	    WebElement ajax=driver.findElement(By.xpath("//span[text()='Ajax']"));
	    ajax.click();	    
	    String notifychecked=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println("Ajax check box is " +notifychecked);
		ajax.click();	
		String notifyunchecked=driver.findElement(By.xpath("//span[text()='Unchecked']")).getText();
		System.out.println("Ajax check box is " +notifyunchecked);
		//---------------------Choose your favorite language(s)--------------------------------------
		WebElement favlang1=driver.findElement(By.xpath("//table//tbody//tr//td[3]//div//following::label"));
		favlang1.click();
		WebElement favlang2=driver.findElement(By.xpath("//table//tbody//tr//td[2]//div//following::label"));
		favlang2.click();
		String favlanguage1=favlang1.getText();
		String favlanguage2=favlang2.getText();
		System.out.println("favourtie languages are " +favlanguage1 +'\n' +favlanguage2);
		//---------------------Tri State Checkbox--------------------------------------
		 WebElement tristatecheckbox=driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox']//following::div//span)[1]"));
		 driver.executeScript("arguments[0].click();", tristatecheckbox);
		 String check1=driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		 System.out.println("First Check is " +check1);
		 tristatecheckbox.click();	    
		 String check2=driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
		 System.out.println("Second Check is " +check2);
		 tristatecheckbox.click();	 
		 String check3=driver.findElement(By.xpath("//p[text()='State = 0']")).getText();
		 System.out.println("Remove Check is " +check3);
		 //---------------------Toggle Switch--------------------------------------		 
		 WebElement toggleswitch=driver.findElement(By.xpath("//h5[text()='Toggle Switch']//following::input[1]"));
		 driver.executeScript("arguments[0].click();", toggleswitch);
		 String togglecheck=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		 System.out.println("Toggle Check is " +togglecheck);
		 driver.executeScript("arguments[0].click();", toggleswitch);
		 String toggleuncheck=driver.findElement(By.xpath("//span[text()='Unchecked']")).getText();
		 System.out.println("Toggle UnCheck is " +toggleuncheck);
		 //---------------------Verify if check box is disabled--------------------------------------	 
		 WebElement checkboxdisable=driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']//following::input[1]"));
		 String checkboxstatus=checkboxdisable.getAttribute("aria-disabled");
		 System.out.println("Check box is disabled: " +checkboxstatus);
		 //---------------------Select Multiple-------------------------------------- 
		 WebElement selectmultiple=driver.findElement(By.xpath("//h5[text()='Select Multiple']//following::div[4]//span"));
		 selectmultiple.click();
		 WebElement option1=driver.findElement(By.xpath("//label[text()='London']//preceding-sibling::div"));
		 option1.click();
		 WebElement filterelement=driver.findElement(By.xpath("//h5[text()='Select Multiple']//following::input[@aria-label='Filter Input']"));
		 filterelement.sendKeys("A"); 
		 WebElement option2=driver.findElement(By.xpath("//label[text()='Amsterdam']//preceding-sibling::div"));
		 option2.click();
		 selectmultiple.click();
		List<WebElement> SelectedValues=driver.findElements(By.xpath("//h5[text()='Select Multiple']//following::ul[1]//li[@data-item-value]"));
		Iterator<WebElement> itr=SelectedValues.iterator();
		while(itr.hasNext())
		{
			System.out.println("Selceted city is " +itr.next().getText());
		}
		 
		 //driver.close();
		
		
	}

}

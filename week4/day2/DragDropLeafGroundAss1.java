package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropLeafGroundAss1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		//-------------------------Draggable-------------------------
		//WebElement dragmesrc=driver.findElement(By.xpath("//span[text()='Drag me around']"));
		Actions action = new Actions(driver);
		/*action. dragAndDropBy(dragmesrc, 280,75). build(). perform();
		//-----------------------Draggable Columns---------------------------
		WebElement srcname=driver.findElement(By.xpath("//span[text()='Name']"));
		WebElement trgtquantity=driver.findElement(By.xpath("//span[text()='Quantity']"));
		action.dragAndDrop(srcname,trgtquantity).build().perform();
		WebElement notification=driver.findElement(By.xpath("//span[text()='Columns reordered']"));
		String message=notification.getText();
		System.out.println("Draggable columns: " +message);	
		//---------------------Resize Image-------------------------------------------------------------------
		WebElement reziseelement=driver.findElement(By.xpath("//div[contains(@class,'ui-resizable')]"));
		action.clickAndHold(reziseelement).moveByOffset(73,0).release().build().perform();
		WebElement mes=driver.findElement(By.xpath("//span[text()='Image resized']"));
		String resizemessage=mes.getText();
		System.out.println("Resized status: " +resizemessage);	
	    //---------------------------Droppable-------------------------------------
		/*WebElement droppabletarget=driver.findElement(By.xpath("//p[text()='Drop here']"));
		WebElement dragtarget=driver.findElement(By.xpath("//p[text()='Drag to target']"));
		action.dragAndDrop(dragtarget,droppabletarget).build().perform();
		WebElement result=driver.findElement(By.xpath("//span[text()='Droppable Target']//following::p"));
		String resulttxt=result.getText();
		System.out.println("Result of droppable is " +resulttxt);*/
		//------------------------------Draggable Rows-----------------------------------------------------------------------------------------CHECK
		WebElement srcrow=driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[1]"));
		WebElement trgtrow=driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[2]"));
		action.dragAndDrop(srcrow,trgtrow).build().perform();
		WebElement notificationrow=driver.findElement(By.xpath("//span[text()='Row moved']"));
		String messagerow=notificationrow.getText();
		System.out.println("Draggable Rows: " +messagerow);	
		//----------------------------------Progress Bar--------------------------------------
		/*WebElement startbtn=driver.findElement(By.xpath("//span[text()='Start']//parent::button"));
		startbtn.click();
		Thread.sleep(5000);
		WebElement cancelbtn=driver.findElement(By.xpath("//span[text()='Cancel']//parent::button"));
		WebElement prgressbar=driver.findElement(By.xpath("//div[@role='progressbar']"));
		String value=prgressbar.getAttribute("aria-valuenow");
		cancelbtn.click();
		System.out.println("The progress value is " +value);
		//----------------------------------Range Slider-------------------------------------
		WebElement slider1=driver.findElement(By.xpath("//h4[text()='Range Slider']//following::span[contains(@style,'left')]"));
		action. dragAndDropBy(slider1, 50,0). build(). perform();
		String slidervaluefront=slider1.getAttribute("style");
		System.out.println("The front slider value is " +slidervaluefront);
		WebElement slider2=driver.findElement(By.xpath("//h4[text()='Range Slider']//following::span[contains(@style,'left')][2]"));
		action. dragAndDropBy(slider2, 30,0). build(). perform();
		String slidervalueback=slider2.getAttribute("style");
		System.out.println("The back slider value is " +slidervalueback);
		WebElement sliderrange=driver.findElement(By.xpath("//h4[text()='Range Slider']//following::span[@id='form:displayRange']"));
		String sliderrangetxt=sliderrange.getText();
		System.out.println("The Slider range is " +sliderrangetxt);
		driver.close();*/
		
		
}
}

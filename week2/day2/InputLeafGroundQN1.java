package week2.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputLeafGroundQN1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
	    WebElement name=driver.findElement(By.xpath("//h5[text()='Type your name']//following::input[1]"));
		name.sendKeys("Kowsalya");		
		WebElement appendcountry=driver.findElement(By.xpath("//h5[text()='Append Country to this City.']//following::input[1]"));
		appendcountry.sendKeys("India");
		WebElement textboxdisabled=driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']//following::input[1]"));
		boolean textboxresult=textboxdisabled.isEnabled();
		if(textboxresult)
		{
			System.out.println("It's not disabled");
		}
		else
		{
			System.out.println("It's disabled");
		}
		WebElement cleartext=driver.findElement(By.xpath("//h5[text()='Clear the typed text.']//following::input[1]"));
		cleartext.clear();
		WebElement retrivetext=driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']//following::input[1]"));
		String retrivedtext=retrivetext.getAttribute("value");	
		System.out.println("The retrived text is" +'\n'+ retrivedtext);	
		WebElement typemail=driver.findElement(By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']//following::input[1]"));
		typemail.sendKeys("Kowsalya@gmail.com");
		typemail.sendKeys(Keys.TAB);
	    WebElement yourself=driver.findElement(By.xpath("//h5[text()='Type about yourself']//following::textarea[1]"));
	    String highlightcolour=yourself.getCssValue("border-color");//(135, 187, 228)
		System.out.println("Highlighted colour is " +highlightcolour);
		System.out.println("Tab worked fine");
		yourself.sendKeys("I am Kowsalya Elangovan");
	     WebElement texteditor=driver.findElement(By.xpath("//h5[text()='Text Editor']//following::p[1]"));
	     texteditor.click();
	     texteditor.sendKeys("Text for text editor");
	     texteditor.sendKeys(Keys.CONTROL,"a");
		WebElement boldfont=driver.findElement(By.xpath("//h5[text()='Text Editor']//following::button[@class='ql-bold']"));
		boldfont.click();	
		texteditor.click();
		 String tagname1=driver.findElement(By.xpath("//h5[text()='Text Editor']//following::p[1]//*")).getTagName();
		Assert.assertEquals(tagname1, "strong");
		System.out.println("The font is bold");
		String error="Age is mandatory";
		WebElement errormesenter=driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']//following::input[2]"));
		errormesenter.sendKeys(Keys.ENTER);
		String errormessage=driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		Assert.assertEquals(errormessage, error);
		System.out.println("Verified the error message successfully");
		WebElement labelposition=driver.findElement(By.xpath("//label[text()='Username']"));
		Point locations=labelposition.getLocation();
		System.out.println("Before Location is " +locations);
		WebElement labelfield=driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']//following::input[1]"));
		labelfield.click();
		Point locations2=labelposition.getLocation();
		System.out.println("After Location is " +locations2);
		WebElement typeyourname=driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']//following::input[1]"));
		typeyourname.sendKeys("Kowsalya");
		WebElement clickdownarrow=driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']//following::button[1]"));
		clickdownarrow.click();
		Thread.sleep(3000);
		WebElement thirdoption=driver.findElement(By.xpath("//li[text()='2']"));
		thirdoption.click();
		WebElement selectedoption=driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']//following::span[text()][1]"));
		String selctedname=selectedoption.getText();
		System.out.println("Selected name is " +selctedname);
		WebElement typedob=driver.findElement(By.xpath("//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']//following::input[1]"));
		typedob.sendKeys("05/23/1996");
		typedob.click();
		String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println("Month is " +month);
		String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println("Year is " +year);
		if((month.equals("May"))&&(year.equals("1996")))
				{
			    System.out.println("Date of birth year and month is verfied");
				}
		else
		{
			System.out.println("Date of birth year and month is not verfied");
		}
		String date=driver.findElement(By.xpath("//table//tbody//tr[4]//td[5]")).getText();
		if(date.equals("23"))
		{
		System.out.println("DOB Date is correct");
		}
		typedob.click();
		WebElement typenumber=driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']//following::input[1]"));
		typenumber.sendKeys("34");
		WebElement uparrow=driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']//following::a[1]"));
		uparrow.click();
		String increasednumber=typenumber.getAttribute("aria-valuenow");
		System.out.println("After clicking uparrow number is " +increasednumber);
		Thread.sleep(3000);
		WebElement downarrow=driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']//following::a[2]"));	
		downarrow.click();
		String decreasednumber=typenumber.getAttribute("aria-valuenow");
		System.out.println("After clicking downarrow number is " +decreasednumber);
		WebElement typerandomnumber=driver.findElement(By.xpath("//h5[text()='Type random number (1-100) and confirm slider moves correctly']//following::input[1]"));
		typerandomnumber.sendKeys("66");
		WebElement slider=driver.findElement(By.xpath("//h5[text()='Type random number (1-100) and confirm slider moves correctly']//following::span[1]"));
		Thread.sleep(3000);
		String silderposition=slider.getAttribute("style");
		System.out.println("Slider position is " +silderposition);
		WebElement clickandCheckKeyboard=driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']//following::input[1]"));
		clickandCheckKeyboard.click();		
		Boolean closebtnkeyboard=driver.findElement(By.xpath("//div[@class='keypad-row']//button[text()='Close']")).isDisplayed();
		if(closebtnkeyboard)
		{
		System.out.println("Keyboard is displayed ");
		}
		else
		{
			System.out.println("Keyboard is not displayed ");
		}
		Thread.sleep(3000);
		WebElement closebtn=driver.findElement(By.xpath("//div[@class='keypad-row']//button[text()='Close']"));
		closebtn.click();
		WebElement customtoolbar=driver.findElement(By.xpath("//h5[text()='Custom Toolbar']//following::div//p"));
		customtoolbar.click();
		customtoolbar.sendKeys("Test Leaf");
		customtoolbar.sendKeys(Keys.CONTROL,"a");
		WebElement italicfont=driver.findElement(By.xpath("	//h5[text()='Custom Toolbar']//following::button[@class='ql-italic']"));
		italicfont.click();	
		customtoolbar.click();
		String tagname2=driver.findElement(By.xpath("//h5[text()='Custom Toolbar']//following::p[1]//*")).getTagName();
		Assert.assertEquals(tagname2, "em");
		System.out.println("The font is Italic");
		//driver.close();
				
		
	}

}

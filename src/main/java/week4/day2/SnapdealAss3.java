package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAss3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Top Categories']//following::span[2]")).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		int sizeofshoes=driver.findElements(By.xpath("//p[contains(@title,'Shoes')] | //p[contains(@title,'Sneakers')]")).size();
		System.out.println("Count of shoes/sneakers " +sizeofshoes);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]//following::li[2]")).click();
		//----------sorted correctly--------------------------------------CHECK
		List<WebElement> priceelement=driver.findElements(By.xpath("//span[contains(@class,'product-price')]"));
		int n=priceelement.size();
		System.out.println("Size of total sorted shoes " +n);
		
		List<String> listordered=new LinkedList<String>();
		for (WebElement match : priceelement) {
			listordered.add(match.getText());
	    }
		List<Integer> list2=new LinkedList<Integer>();
		
       for(String str:listordered)
       {
    	   int number=Integer.parseInt(str);
    	   list2.add(number);
       }
       Collections.sort(list2);
       System.out.println("Sorted values ");
       for(int z:list2)
       {
    	  System.out.println(z);
       }
		/*WebElement ip1=driver.findElement(By.xpath("//div[@class='price-text-box']//input[1]"));
		ip1.clear();
		ip1.sendKeys("900");
		WebElement ip2=driver.findElement(By.xpath("(//div[@class='price-text-box']//input)[2]"));
		ip2.clear();
		ip2.sendKeys("1200");
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		//-----------------verify applied filters-----------------------------------
		Boolean filter1=driver.findElement(By.xpath("//div[contains(text(),'Price Low To High')]")).isDisplayed();
		Boolean filter2=driver.findElement(By.xpath("//input[@id='Color_s-Navy' and @checked='checked']")).isEnabled();
		System.out.println("Filter Verification " +filter1 +" "+ filter2);
		WebElement result=driver.findElement(By.xpath("//picture[@class='picture-elem']//img"));//--mousehover
		Actions action=new Actions(driver);
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(result));
		action.moveToElement(result).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		String price=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price is " +price);
		String percentage=driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		System.out.println("Percentage is " +percentage); 
		//----------------Take screenshot-----------------------
		TakesScreenshot ts=((TakesScreenshot)driver);
		 File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File("E:\\test.png");
		 FileUtils.copyFile(SrcFile, DestFile);

		driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
		//driver.close();
		*/
		
		
		

	}

}

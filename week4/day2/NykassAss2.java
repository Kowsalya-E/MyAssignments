package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykassAss2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
        WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
        Actions action=new Actions(driver);
        action.moveToElement(brand).build().perform();
        WebElement searchbox=driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
        searchbox.sendKeys("L'Oreal Paris");
        WebElement searchboxclick=driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]"));
        searchboxclick.click();
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        WebElement sortby=driver.findElement(By.xpath("//span[contains(text(),'popularity')]"));
        sortby.click();
        WebElement customertop=driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]//following::div[1]"));
        customertop.click();
        driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
        driver.findElement(By.xpath("//span[text()='Hair']")).click();
        driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
        driver.findElement(By.xpath("(//span[text()='Shampoo'])//following::div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Hair']")).click();
        driver.findElement(By.xpath("//span[text()='Shop By Concern']")).click();
        driver.findElement(By.xpath("//span[text()='Color Protection']//following::div")).click();
        String actual=driver.findElement(By.xpath("//span[text()='Filters Applied']//following::span")).getText();
        if(actual.contains("Shampoo"))
        {
        	System.out.println("Filter is verified");
        }
        else
        {
        	System.out.println("Filter is not verified");
        }
        driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
        Set<String> set=driver.getWindowHandles();
        List<String> list=new ArrayList<String>(set);
        driver.switchTo().window(list.get(1));
        WebElement selectdd=driver.findElement(By.xpath("//select[@title='SIZE']"));
        Select select=new Select(selectdd);        
        select.selectByVisibleText("175ml");
        String MRP=driver.findElement(By.xpath("//span[text()='MRP:']//following::span")).getText();
        System.out.println("MRP of the product is " +MRP);
        driver.findElement(By.xpath("//span[text()='Add to Bag']//parent::button")).click();
        driver.findElement(By.xpath("//span[text()='Account']//following::*[@fill='none']")).click();
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        String grandtotal=driver.findElement(By.xpath("//span[contains(text(),'259')]")).getText();//----------------------------CHECK
       System.out.println("Grandtotal of the product is " +grandtotal);
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
        String finalgrandtotal=driver.findElement(By.xpath("//div[text()='Grand Total']//following::span")).getText();
        System.out.println("Final Grandtotal of the product is " +finalgrandtotal);
        if(finalgrandtotal.contains(grandtotal))
        {
        	System.out.println("Yes,Both totals are same");
        }
        else
        {
        	System.out.println("No,Both totals are not same");
        }
      
        driver.close();
        driver.switchTo().window(list.get(0));
        driver.close();
      
      
      
      
        
        
      
       
	}

}

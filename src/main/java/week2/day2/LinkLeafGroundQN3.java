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

public class LinkLeafGroundQN3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		//------------------------Take me to dashboard----------------------
	    WebElement dashboard=driver.findElement(By.xpath("(//h5[text()='Take me to dashboard']//following::a[text()='Go to Dashboard'])[1]"));
	    dashboard.click();
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		driver.navigate().back();
		//------------------------Find my destination----------------------
		WebElement findurl=driver.findElement(By.xpath("//h5[text()='Find my destination']//following::a[text()='Find the URL without clicking me.']"));
		String url=findurl.getAttribute("href");
		System.out.println("The destination is " +url);
		//------------------------Am I broken link?----------------------
		WebElement brokenlink=driver.findElement(By.xpath("//a[text()='Broken?']"));
		brokenlink.click();
		WebElement errormes=driver.findElement(By.xpath("//h2[text()='HTTP ERROR 404 /lists.xhtml Not Found in ExternalContext as a Resource']"));
		String brokenerror=errormes.getText();
		if(brokenerror.equals("HTTP ERROR 404 /lists.xhtml Not Found in ExternalContext as a Resource"))
		{
			System.out.println("It's a broken link");
		}
		else
		{
			System.out.println("its not a broken link");
		}
		driver.navigate().back();
		//------------------------Duplicate Link----------------------
		List<WebElement> duplicate=driver.findElements(By.xpath("//a[text()='Go to Dashboard']"));
	    int totallinkcount= duplicate.size();
	    if(totallinkcount>1)
	    {
	    	System.out.println("It's a duplicate link");	
	    }
	    else
	    {
	    	System.out.println("It's not duplicate");
	    }		
	    //------------------------Count Links---------------------
		List<WebElement> countlinks= driver.findElements(By.xpath("//h5[text()='Take me to dashboard']//following::a"));
		System.out.println("Links count is " +countlinks.size());
		//------------------------Count Layout Links----------------------
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		List<WebElement> layoutlinks = driver.findElements(By.tagName("a"));
		System.out.println("Layout links: " +layoutlinks.size());
		driver.navigate().back();
			//driver.close();
		
		
	}

}

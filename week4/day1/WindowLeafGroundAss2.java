package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowLeafGroundAss2 {

	private static final boolean String = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		//------------------Click and Confirm new Window Opens--------------------------
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windows=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windows);
		String title=driver.switchTo().window(list.get(1)).getTitle();
		System.out.println("Title is " +title);
		String exptitle="Dashboard";
		if(title.contains(exptitle))
		{
			System.out.println("Navigated to child window");
		}
		else
		{
			System.out.println("Did not Navigate to child window");
		}
		driver.close();
		driver.switchTo().window(list.get(0));
		//-------------------------------Find the number of opened tabs----------------------
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();		
		Set<String> windows1=driver.getWindowHandles();
		String parentwindow=driver.getWindowHandle();
		int size=windows1.size();
		System.out.println("Number of opened windows " +size);
		for(String win:windows1)
		{
			if(!win.equals(parentwindow))
			{
				driver.switchTo().window(win);
				driver.close();
			}
			
		}
		driver.switchTo().window(parentwindow);
		//--------------------------------Close all windows except Primary--------------------------------------
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();		
		Set<String> windows11=driver.getWindowHandles();
		String parentwindow1=driver.getWindowHandle();
		for(String win1:windows11)
		{
			if(!win1.equals(parentwindow1))
			{
				driver.switchTo().window(win1);
				driver.close();
			}
			
		}
		driver.switchTo().window(parentwindow1);
		//------------------------------Wait for 2 new tabs to open-----------------------------
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();	
		Thread.sleep(3000);
		String parentwindow12=driver.getWindowHandle();
		Set<String> windows111=driver.getWindowHandles();
		int size111=windows111.size();
		System.out.println("Total opended window size is " +size111);
		for(String win12:windows111)
		{
			if(!win12.equals(parentwindow12))
			{
				driver.switchTo().window(win12);
				driver.close();
			}
			
		}
		driver.switchTo().window(parentwindow12);
		driver.close();

	}

}

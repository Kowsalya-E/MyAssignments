package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomUniqueTrainname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("ms");
		from.sendKeys(Keys.TAB);
		WebElement to=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.clear();
		to.sendKeys("mdu");
		to.sendKeys(Keys.TAB);
		Thread.sleep(2000);		
		List<WebElement> list=driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']//ancestor::tr"));
			
		List<String> list1=new ArrayList<String>();
		int listcount=list1.size();
		System.out.println("List count is " +listcount);
		for(int i=2;i<=listcount;i++)
		{
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			list1.add(trainName);
		}
		Set<String> set=new TreeSet<String>();
		for(String eachtrain:list1)
		{
			if(!set.add(eachtrain)) {
				System.out.println(eachtrain);
			}
		}
		int setcount=set.size();
		System.out.println("Set count is " +setcount);
		
        driver.close();
	}

}

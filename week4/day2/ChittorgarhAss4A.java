package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorgarhAss4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click(); 
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> we=driver.findElements(By.xpath("//tbody//tr//td[3]"));
		int size=we.size();
		System.out.println("List size is " +size);
		List<String> snl=new ArrayList<String>();
		for(int i=1;i<=size;i++)
		{
			String securityname=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]")).getText();
			snl.add(securityname);
			
		}
		System.out.println("List is " +snl);
		System.out.println("List size is " +snl.size());
		Set<String> sns=new LinkedHashSet<String>();
		for(String l:snl)
		{
			if(!sns.add(l))
			{
				System.out.println("Duplicate security name is " +l);
			}
		}
		int countset=sns.size();
		System.out.println("Unique security name size is " +countset);
	}

}

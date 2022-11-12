package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationPractice {
		// TODO Auto-generated method stub
	@BeforeMethod
	public void abefmeth1()
	{
		System.out.println("Before Method1");
	}
	@BeforeMethod
	public void bbefmeth2()
	{
		System.out.println("Before Method2");
	}
		@Test
		public void atest()
		{
			System.out.println("Test1");
		}
		@Test
		public void btest()
		{
			System.out.println("Test2");
		}
		@AfterMethod
		public void aaftermethod()
		{
			System.out.println("After method1");
		}
		@AfterMethod
		public void baftermethd()
		{
			System.out.println("After method2");
		}

}

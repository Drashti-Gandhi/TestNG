package testngdemo;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority {
	
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void BF()
	{
		System.out.println("Before Method");
	}

	
	@Test(priority=1,enabled=true)
	public void TC1()
	{
		
		System.out.println("Inside TC1");
	}
	
	@Test(priority=3)
	public void ABC1()
	{
		
		System.out.println("Inside ABC1");
		throw new SkipException("Skipping ABC1");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("After Test");
		throw new SkipException("Skipping ABC1");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("After Method");
	}
	
	
}









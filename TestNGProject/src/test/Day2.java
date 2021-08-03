package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups = "smoke")
	public void ploan() {
		System.out.println("ploan");
	}
	
	@BeforeTest
	public void prequisite()
	{
		System.out.println("I will exeecute First");
	}
	
	@AfterTest
	public void lastTest()
	{
		System.out.println("I will execute Last");
	}
	
	@Parameters({"URL","key"})
	@Test
	public void test(String urls, String key)
	{
		System.out.println(urls);
		System.out.println(key);
	} 

}

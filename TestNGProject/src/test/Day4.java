package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("After Method");
	}
	
	@Test(groups="smoke")
	public void webLoginHomeLoan() {
		System.out.println("web login Home");
		
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobile login Home");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		System.out.println("API login Home");
	}
	
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Before Class");
	}


}

package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite");
	}
	
	@Test(groups={"smoke"})
	public void webLoginCarLoan() {
		System.out.println("web login car");
		
	}
	
	@Test(dataProvider = "getData")
	public void mobileLoginCarLoan(String uname, String pwd) {
		System.out.println("mobile login car");
		System.out.println("Username : "+uname+" password : "+pwd);
	}
	
	@Test
	public void mobileSignInCarLoan() {
		System.out.println("mobile SignIn car");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
	
	@Test(dependsOnMethods = {"mobileSignInCarLoan", "mobileLoginCarLoan"})
	public void mobileSignOutCarLoan() {
		System.out.println("mobile SignOut car");
	}
	
	@Test
	public void APILoginCarLoan() {
		System.out.println("API login car");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		//first set
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		//second set
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		//third set
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	}

}

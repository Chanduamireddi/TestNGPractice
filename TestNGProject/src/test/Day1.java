package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Parameters({"URL"})
	@Test
	public void demo(String url)
	{
		System.out.println("Test NG Demo");
		System.out.println(url);
	}

	@Test
	public void secondTest()
	{
		System.out.println("Test Demo2");
	}
}

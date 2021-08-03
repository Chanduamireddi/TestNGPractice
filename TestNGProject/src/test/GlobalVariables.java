package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		//provide the path of file
		FileInputStream fis = new FileInputStream("D:\\eclipseworkspace\\TestNGProject\\src\\test\\data.properties");
		
		prop.load(fis);
		
		//Read browser and url from properties file
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		//Write properties into properties file
		FileOutputStream fos = new FileOutputStream("D:\\\\eclipseworkspace\\\\TestNGProject\\\\src\\\\test\\\\data.properties");
		prop.store(fos, "Updated browser details");
		

	}

}

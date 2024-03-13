package day43.properties;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class GetDataFromPropertyFile {

	public static void main(String[] args) throws IOException  {
		
		//File name and location - Absolute path
		String filePath1="D:\\SoftwareTesting\\Automation\\Workspace\\JavaProgram\\PropertyFile\\PropertyFiles.properties";
				//or relative path
		String filePath2=".\\TestAppData\\TestData.properties";
				//or
		String filePath3=System.getProperty("user.dir")+"\\TestAppData\\TestData.properties";
		//Create an instance of FileInputStream class by passing file location to its constructor
		FileInputStream fis=new FileInputStream(filePath1);
		//Create an instance of Properties class 
		Properties prop=new Properties();
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
		prop.load(fis);
		//in order to read data from property file use getProperty(String key) of Properties class
		System.out.println("Application URL: "+prop.getProperty("appUrl"));
		System.out.println("Username: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		System.out.println("confirmPassword: "+prop.getProperty("confirmPassword"));
		System.out.println("firstName: "+prop.getProperty("firstName"));
		System.out.println("lastName: "+prop.getProperty("lastName"));
		System.out.println("contactNumber: "+prop.getProperty("contactNumber"));
		System.out.println("emailId: "+prop.getProperty("emailId"));
	}

}
 
package day43.properties;
import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StepsToReadPropertyFile7 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call get(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		FileInputStream fis = new FileInputStream("./PropertyFile/PropertyFiles.properties");
	
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		String pAmount=prop.getProperty("principleAmount");
		System.out.println(pAmount);
		int amount=Integer.parseInt(pAmount);
		int res=amount/10;
		int roi=Integer.parseInt(prop.getProperty("roi"));
		System.out.println("Result: "+res);
		System.out.println("ROI: "+roi);
		//to wrote content into the file use setProperty()
		prop.setProperty("Subject3", "Testng");
		prop.setProperty("Subject4", "Maven");
		//location where you want to save your file using FileOutputStream
		FileOutputStream fos= new FileOutputStream("./PropertyFile/PropertyFiles.properties");
		//saving the file into required location using store()
		prop.store(fos, "Added two new keys");
		//close the connection
		fos.close();	
		System.out.println("Property file updated successfully....");
	}
}

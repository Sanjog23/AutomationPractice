package day11.propertyfile_calanderdropdown;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class SwagLabAssignment {

	public static void main(String[] args) throws IOException{

		FileInputStream file = new FileInputStream(".\\data\\SauceDemo.properties");
		Properties prop = new Properties();
		prop.load(file);
//		WebDriver driver =ReusableFunctions.setUp("Chrome", "https://www.saucedemo.com/");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		driver.get(prop.getProperty("appUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String userNames= driver.findElement(By.id("login_credentials")).getText();
		String[] userNameList=userNames.split("\n");
		
		String password= driver.findElement(By.cssSelector(".login_password")).getText();
		String[] passwordList=password.split("\n");
		
		for(int i=1;i<userNameList.length;i++) {
			System.out.println("******************User used for login: "+userNameList[i]);
			driver.findElement(By.id("user-name")).sendKeys(userNameList[i]);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(passwordList[1]);
			driver.findElement(By.id("login-button")).click();
			if(driver.getCurrentUrl().contains("/inventory.html")) {
				driver.findElement(By.id("react-burger-menu-btn")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
			}else {
				driver.findElement(By.id("user-name")).clear();
				driver.findElement(By.id("password")).clear();
			}
		}
		driver.close();
	}

}
/*
 * open browser read url from property file(https://www.saucedemo.com/) read
 * username from screen(one by one) read password from screen click on login
 * button
 */
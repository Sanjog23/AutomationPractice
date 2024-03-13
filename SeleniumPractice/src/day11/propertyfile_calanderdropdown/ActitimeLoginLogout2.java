package day11.propertyfile_calanderdropdown;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class ActitimeLoginLogout2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\Data\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
	
		String expectedTitle=prop.getProperty("expectedTitle");
		
		WebDriver driver = ReusableFunctions.setUp("chrome", prop.getProperty("appUrl"));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		//explicit wait-WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		//validate home page		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Actual Home page title: "+actualHomePageTitle);
		System.out.println("Is home page title matched? "+expectedTitle.equals(actualHomePageTitle));
		//wait to logout link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}
}

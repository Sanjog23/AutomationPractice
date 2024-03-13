package day4.basicops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerAssignment2 {

	public static void main(String[] args) {
		
//		open a chrome browser
//		enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		// Validate login page is open
        String loginTitle = driver.getTitle();
        if (loginTitle.contains("vtiger")) {
            System.out.println("Login page is open.");
        } else {
            System.out.println("Login page is not open.");
            return; // Stop execution if login page is not open
        }
		
//		remove existing text from username field
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
//		type username as 'admin'
		driver.findElement(By.id("username")).sendKeys("admin");
//		remove existing text from password field
//		type password as admin'
		driver.findElement(By.id("password")).sendKeys("admin");
//		click on login button
		driver.findElement(By.className("buttonBlue")).click();
		 // Validate the home page
        String homePageTitle = driver.getTitle();
        if (homePageTitle.contains("Dashboard")) {
            System.out.println("Home page validation successful.");
        } else {
            System.out.println("Home page validation failed.");
        }
		

	}

}
/**
  Assignment2: 
	open a chrome browser
	enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
	validation login page open or not
	remove existing text from username field
	type username as 'admin'
	remove existing text from password field
	type password as admin'
	click on login button
	validate home page
 */

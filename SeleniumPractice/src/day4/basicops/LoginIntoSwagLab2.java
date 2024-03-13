package day4.basicops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day3.browseropening.GenericWayToOpenBrowser;

public class LoginIntoSwagLab2 {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome" , "https://www.saucedemo.com/");
		
		//TODO: validate login page
		
//		1st identify username input field before we perform any operation in that
//		WebElement usernameInputField=driver.findElement(By.id("user-name"));
//		usernameInputField.sendKeys("standard_user");

//		WebElement passwordInputField=driver.findElement(By.id("password"));
//		passwordInputField.sendKeys("secret_sauce");

//		WebElement loginButton=driver.findElement(By.name("login-button"));
//		loginButton.click();
		
				//or
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		
	}

}
/**
Open browser and enter required application URL
validate:
	login page url
enter username as "standard_user"
enter password as "secret_sauce"
click on login button
validate:
	home page url
*/
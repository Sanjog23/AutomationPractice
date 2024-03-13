package day4.basicops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.browseropening.GenericWayToOpenBrowser;

public class LoginIntoSwagLab {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://www.saucedemo.com/");
		
		//TODO: validate login page
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println("Title Validation status: "+expectedTitle.equals(actualTitle));
		
		//1st identify username input field before we perform any operation in that
		WebElement usernameInputField=driver.findElement(By.id("user-name"));
		usernameInputField.sendKeys("standard_user");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.name("login-button"));
		loginButton.click();
		
		
		
		System.out.println("Home page validation status: ");
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
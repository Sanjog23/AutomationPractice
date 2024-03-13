package day6.browserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectValidation {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("is username input field visible? "+userNameInputField.isDisplayed());
		System.out.println("is username input field functional/editable or not? "+userNameInputField.isEnabled());
		System.out.println("Default value of username input field: "+userNameInputField.getAttribute("value"));
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		System.out.println("is password input field visible? "+passwordInputField.isDisplayed());
		System.out.println("is password input field functional/editable or not? "+passwordInputField.isEnabled());
		System.out.println("Default value of password input field: "+passwordInputField.getAttribute("value"));
		
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		System.out.println("is Signin button visible/displayed? "+signInButton.isDisplayed());
		System.out.println("is Signin button functional/clickable? "+signInButton.isEnabled());
		System.out.println("Signin button name? "+signInButton.getText());
	}
}
/*
Validations:
	username field available or not
	username field is editable or not
	username field default value is "admin" or not
	
	password field available or not
	password field is editable or not
	password field default value is "admin" or not
	
	signin button available or not
	signin button is clickable /functional or not
	signin button name is Signin or not
*/
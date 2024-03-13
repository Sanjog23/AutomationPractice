package day6.browserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmValidation {

	public static void main(String[] args) {

		WebDriver driver = ReusableFunctions.setUp("chrome",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement userNameInputField = driver.findElement(By.name("username"));
		System.out.println("is username input field visible? " + userNameInputField.isDisplayed());
		System.out.println("is username input field functional/editable or not? " + userNameInputField.isEnabled());
		System.out.println("Default value of username input field: " + userNameInputField.getAttribute("value"));

		WebElement passwordInputField = driver.findElement(By.name("password"));
		System.out.println("is username input field visible? " + passwordInputField.isDisplayed());
		System.out.println("is username input field functional/editable or not? " + passwordInputField.isEnabled());
		System.out.println("Default value of username input field: " + passwordInputField.getAttribute("value"));

		WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("is Signin button visible/displayed? " + loginButton.isDisplayed());
		System.out.println("is Signin button functional/clickable? " + loginButton.isEnabled());
		System.out.println("Signin button name? " + loginButton.getText());
	}

}
/**
 * TC2:https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 * validation on username/password/login
 */
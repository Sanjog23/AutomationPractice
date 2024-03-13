package day6.browserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActitimeValidation {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://online.actitime.com/tcs/login.do");
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement userNameInputField = driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		System.out.println("Is username input field visible? " + userNameInputField.isDisplayed());
		System.out.println("Is username input field functional/editable or not? " + userNameInputField.isEnabled());
		// System.out.println(userNameInputField.getAttribute(null));
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		System.out.println("Is password input field visible? " + passwordInputField.isDisplayed());
		System.out.println("Is password input field functional/editable or not? " + passwordInputField.isEnabled());

		WebElement keepMeLogInCheckBox = driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
		System.out.println("Is keep me looged in check box present? " + keepMeLogInCheckBox.isDisplayed());
		System.out.println("Is keep me looged in check box functional? " + keepMeLogInCheckBox.isEnabled());

		WebElement loginButton = driver.findElement(By.linkText("Login"));
		System.out.println("Is login button visible? " + loginButton.isDisplayed());
		System.out.println("Is login button clickable? " + loginButton.isEnabled());
		System.out.println("Login button name is login or not? " + loginButton.getText());

	}

}
/**
 * TC1: https://online.actitime.com/tcs/login.do validation on
 * username/password/login/checkbox
 */

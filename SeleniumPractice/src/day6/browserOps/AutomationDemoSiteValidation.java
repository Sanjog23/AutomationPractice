package day6.browserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationDemoSiteValidation {

	public static void main(String[] args) {
		WebDriver driver= ReusableFunctions.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		WebElement firstNameInputField=driver.findElement(By.className("form-control"));
		System.out.println("Is first name field visible? "+firstNameInputField.isDisplayed());
		System.out.println("Is first name field functional? "+firstNameInputField.isEnabled());
		System.out.println("Default value of first name input field: "+firstNameInputField.getAttribute("class"));

		WebElement lastNameInputField= driver.findElement(By.className("form-control"));
		System.out.println("Is last name field visible? "+lastNameInputField.isDisplayed());
		System.out.println("Is last name field functional? "+lastNameInputField.isEnabled());
		System.out.println("Default value of last name input field: "+lastNameInputField.getAttribute("class"));
		
		WebElement maleRadioButton=driver.findElement(By.name("radiooptions"));
		System.out.println("Is male radio button visible? "+maleRadioButton.isDisplayed());
		System.out.println("Is male radio button functinal? "+maleRadioButton.isEnabled());
		System.out.println("Default value of male radio button? "+maleRadioButton.getAttribute("name"));
		
		WebElement submitButton=driver.findElement(By.id("submitbtn"));
		System.out.println("Is submit button visible? "+submitButton.isDisplayed());
		System.out.println("Is submit button functional? "+submitButton.isEnabled());
		System.out.println("Default value of submit button: "+submitButton.getAttribute("name"));
		System.out.println("Submit button name is submit or not? "+submitButton.getText());
	
		driver.quit();
	}

}
/**
TC3:https://demo.automationtesting.in/Register.html
validation on
	FirstName ---> visible/functional/default value
	LastName  ---> visible/functional/default value
	Male radio button ---> visible/functional/default selection/select and again check
	Submit button---> visible/functional/default name
*/
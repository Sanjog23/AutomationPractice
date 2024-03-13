package day7.csspropertyvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.time.Duration;

public class ColorTextValidation {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://online.actitime.com/tcs/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("errormsg")));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		System.out.println("Error Msg color RGBA code: "+errorMsg.getCssValue("color"));
		System.out.println("Error Msg Font Family: "+errorMsg.getCssValue("font-family"));
		System.out.println("Error Msg Font size: "+errorMsg.getCssValue("font-size"));
	}

}

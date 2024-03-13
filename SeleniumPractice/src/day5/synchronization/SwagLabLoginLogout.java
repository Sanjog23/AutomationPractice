package day5.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabLoginLogout {

	public static void main(String[] args) {
		//WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://online.actitime.com/tcs/login.do");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//validate home page	
		//explicit wait-WebDriverWait
		String expectedHomePageTitle="Swag Labs";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		System.out.println("Actual Home page title: "+actualHomePageTitle);
		System.out.println("Is home page title matched? "+expectedHomePageTitle.equals(actualHomePageTitle));
		//wait to logout link
		driver.findElement(By.id("react-burger-menu-btn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
	}

}

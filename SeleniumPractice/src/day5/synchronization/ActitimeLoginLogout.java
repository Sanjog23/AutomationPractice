package day5.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day3.browseropening.GenericWayToOpenBrowser;
import java.time.Duration;


public class ActitimeLoginLogout {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://online.actitime.com/tcs/login.do");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://online.actitime.com/tcs/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("loginButton")).click();
		//validate home page	
		//explicit wait-WebDriverWait
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
			
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Actual Home page title: "+actualHomePageTitle);
		System.out.println("Is home page title matched? "+expectedHomePageTitle.equals(actualHomePageTitle));
		//wait to logout link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
	}
}

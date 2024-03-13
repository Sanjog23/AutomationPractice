package day5.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day3.browseropening.GenericWayToOpenBrowser;
import java.time.Duration;

public class VtigerLoginLogout {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://online.actitime.com/tcs/login.do");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		remove existing text from username field
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.className("buttonBlue")).click();
		//validate home page	
		//explicit wait-WebDriverWait
		String expectedHomePageTitle="Dashboard";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle=driver.getTitle();
		
		System.out.println("Actual Home page title: "+actualHomePageTitle);
		System.out.println("Is home page title matched? "+expectedHomePageTitle.equals(actualHomePageTitle));
		//wait to logout link
		driver.findElement(By.className("userName")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menubar_item_right_LBL_SIGN_OUT")));
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
	}

}

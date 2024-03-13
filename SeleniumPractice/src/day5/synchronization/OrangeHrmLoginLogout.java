package day5.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHrmLoginLogout {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		String expectedTitle="OrangeHRM";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle=driver.getTitle();
		System.out.println("Actual title: "+expectedTitle);
		System.out.println("Is title matched? "+expectedTitle.equals(actualTitle));
		//wait to logout link
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-link")));
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		
	}

}
/**

Assignment3:
	Open chrome browser
	Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	Validate login page
	Enter user name as Admin
	Password as admin123
	Click on login button
	Validate home page
*/
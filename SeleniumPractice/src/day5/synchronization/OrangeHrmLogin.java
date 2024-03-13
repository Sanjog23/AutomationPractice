package day5.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day3.browseropening.GenericWayToOpenBrowser;
import java.time.Duration;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("Admin");//0-20 sec
		driver.findElement(By.name("password")).sendKeys("admin123");//0-20 sec
		driver.findElement(By.className("orangehrm-login-button")).click();//0-20 sec
		  
	}

}

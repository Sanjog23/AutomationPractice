package day4.basicops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRM {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		String expectedTitle="OrangeHRM";
		String actualTitle=driver.getTitle();
		System.out.println("Title validation status: "+expectedTitle.equals(actualTitle));
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
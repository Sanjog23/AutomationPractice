package day11.propertyfile_calanderdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrmAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String userName=driver.findElement(By.cssSelector(".orangehrm-login-error>div>*:nth-child(1)")).getText();
		String userNameReplace=userName.replace("Username : ", "");
		
		String password=driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		String passwordReplace=password.replace("Password : ", "");
		
		System.out.println("username: "+userNameReplace);
		System.out.println("password: "+passwordReplace);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(userNameReplace);
		driver.findElement(By.name("password")).sendKeys(passwordReplace);
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}

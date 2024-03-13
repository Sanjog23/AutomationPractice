package weekend_multielementAss;
                                        //DEPENDENT AND INDEPENDENT XPATH
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//DEPENDENT AND INDEPENDENT XPATH
import java.time.Duration;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// driver.findElement(By.linkText("Mobiles")).click();

		// OR

		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

//		1. xpath for 'Made for Amazon'  checkbox 
		driver.findElement(By.xpath(
				"//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Made for Amazon']\r\n"))
				.click();
		driver.navigate().back();

//	    2. xpath for 'Prime'  checkbox
		driver.findElement(By.xpath("//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/i")).click();
		driver.navigate().back();

//		3. xpath for 'Get It by Tomorrow'  checkbox
		driver.findElement(By.xpath(
				"//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Get It by Tomorrow']"))
				.click();
		driver.navigate().back();

//		4. xpath for 'Eligible for pay on delivery'  checkbox
		driver.findElement(By.xpath(
				"//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Eligible for Pay On Delivery']"))
				.click();
		driver.navigate().back();
		driver.quit();

	}

}

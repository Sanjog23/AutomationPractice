package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GsmArena0 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Validating home page
		String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle = driver.getTitle();
		System.out.println("Validating home page: " + expectedTitle.equals(actualTitle));
		
		List<WebElement> phoneFinder = driver
				.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		System.out.println("\nMobile phone name count from phone finder: " + phoneFinder.size());
		for (WebElement phoneList : phoneFinder) {
			System.out.println("Name of mobile phone: " + phoneList.getText());
		}

		driver.close();
	}

}
/**
 * TC 1: 
 1.Open gsmarena.com 
 2.Validate HomePage 
 3.Get Mobile phone name count from
 4.phone finder Print mobile phone name
 * 
 * TC 2: 
 1.Open gsmarena.com 
 2.Validate HomePage 
 3.Click on samsung phone link present in phone finder 
 4.Get device count and print on console 
 5.Print all the device names on the console
 * 
 * TC 3: 
 1.Open gsmarena.com 
 2.Validate HomePage 
 3.Click on samsung phone link present
 4.in phone finder 
 5.Check whether page has pagination or not 
 6.If yes than print pagination link names 
 7.Navigate to each page and get the page URL.
 * 
 */

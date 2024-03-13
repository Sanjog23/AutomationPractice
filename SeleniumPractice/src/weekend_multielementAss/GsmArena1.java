package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");

		// Validating home page
		String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle = driver.getTitle();
		System.out.println("Validating home page: " + expectedTitle.equals(actualTitle));
        
		// Click on samsung phone link present in phone finder
		driver.findElement(By.linkText("SAMSUNG")).click();
		
		//Get device count and print on console 
		List<WebElement> deviceList=driver.findElements(By.cssSelector("div#review-body>div>ul>li>a>strong>span"));
		System.out.println("Samsung device count: "+deviceList.size());
		
		//Print all the device names on the console
		System.out.println("All device name: ");
		for(WebElement list:deviceList) {
			System.out.println(list.getText());
		}
		driver.close();

	}

}
/**
 * TC 2:
 * 
 * Open gsmarena.com 
 * Validate HomePage 
 * Click on samsung phone link present in phone finder 
 * Get device count and print on console 
 * Print all the device names on the console
 */
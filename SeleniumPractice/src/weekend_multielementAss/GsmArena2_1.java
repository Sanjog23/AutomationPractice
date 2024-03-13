package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GsmArena2_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		Open gsmarena.com
		driver.get("https://www.gsmarena.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Validating home page
		String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle = driver.getTitle();
		System.out.println("Validating home page: " + expectedTitle.equals(actualTitle));

//		Click on samsung phone link present in phone finder 
		driver.findElement(By.linkText("SAMSUNG")).click();
		
		List<WebElement> pagination1 = driver.findElements(By.cssSelector("div.nav-pages>a"));
//		Check whether page has pagination or not
		if (!pagination1.isEmpty()) {
			System.out.println("Pagination is available on the page.");

			// If pagination exists, you can interact with it here,
		} else {
			System.out.println("No pagination is available on the page.");
			// Handle the case where there is no pagination
		}

//		Navigate to each page and get the page URL.	
		int pageNumber=1;
		boolean hasNextPage = true;
		while (hasNextPage) {
			
			 // Print current page URL and number
            System.out.println("Page Number: " + pageNumber + ", URL: " + driver.getCurrentUrl());
            
			List<WebElement> deviceList = driver
					.findElements(By.cssSelector("div#review-body>div>ul>li>a>strong>span"));
			System.out.println("\nSamsung device count: " + deviceList.size());

			// Print all the device names on the console
			System.out.println("All device name: ");
			for (WebElement list : deviceList) {
				System.out.println(list.getText());
			}
		//	List<WebElement> pagination = driver.findElements(By.cssSelector("div.nav-pages>a"));
			WebElement nextPage = null;

			if (pagination1.size() > 0) {
				// Assuming the last link in pagination is "Next" or equivalent
				nextPage = pagination1.get(pagination1.size() - 1);
				if (nextPage.getText().equalsIgnoreCase("Next page") || nextPage.getAttribute("href") != null) {
					System.out.println("Navigated to URL: " + driver.getCurrentUrl());
					
					wait.until(ExpectedConditions.elementToBeClickable(nextPage)).click();

				} else {
					hasNextPage = false; // Last page reached, no "Next" link
				}
			} else {
				hasNextPage = false; // No pagination found
				System.out.println("No pagination found on the page.");
			}

		}

		driver.close();
	}

}

/**
 * TC 3: 1.Open gsmarena.com 2.Validate HomePage 3.Click on samsung phone link
 * present in phone finder 4.Check whether page has pagination or not 5.If yes
 * than print pagination link names 6.Navigate to each page and get the page
 * URL.
 */
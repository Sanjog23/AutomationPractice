package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GsmArenaPagination2 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
//		Open gsmarena.com
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Validating home page
		String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle = driver.getTitle();
		System.out.println("Validating home page: " + expectedTitle.equals(actualTitle));

//		Click on samsung phone link present in phone finder 
		driver.findElement(By.linkText("SAMSUNG")).click();
		
		//List<WebElement> pagination1 = driver.findElements(By.cssSelector("div.nav-pages>a"));

//		Check whether page has pagination or not
		WebElement pagination2=driver.findElement(By.className("review-nav-v2"));
		System.out.println("Pagination is available on the page.: "+pagination2.isDisplayed());
//		if (!pagination1.isEmpty()) {
//			System.out.println("Pagination is available on the page.");
//
//			// If pagination exists, you can interact with it here,
//		} else {
//			System.out.println("No pagination is available on the page.");
//			// Handle the case where there is no pagination
//		}

//		Navigate to each page and get the page URL.		
		int pageNumber = 1; // Initialize page number
        boolean hasNextPage = true;
        while (hasNextPage) {
            // Print current page URL and number
            System.out.println("\nPage Number: " + pageNumber + ", URL: " + driver.getCurrentUrl());
            
            List<WebElement> deviceList = driver
					.findElements(By.cssSelector("div#review-body>div>ul>li>a>strong>span"));
			System.out.println("Samsung device count: " + deviceList.size());

			// Print all the device names on the console
			System.out.println("\nAll device name: ");
			for (WebElement list : deviceList) {
				System.out.println(list.getText());
			}

            // Attempt to find the "Next" button or pagination links
            List<WebElement> paginationLinks = driver.findElements(By.cssSelector("div.nav-pages>a"));
            WebElement nextPageLink = null;

            if (paginationLinks.size() > 0) {
                // Check if the last pagination link is a "Next" button or get the next page link
                WebElement lastLink = paginationLinks.get(paginationLinks.size() - 1);
                if (lastLink.getText().equalsIgnoreCase("Next page") || lastLink.getAttribute("href") != null) {
                    nextPageLink = lastLink;
                }
            }

            if (nextPageLink != null) {
                nextPageLink.click(); // Click to navigate to the next page
                pageNumber++; // Increment page number
            } else {
                hasNextPage = false; // No "Next" link found, end loop
            }

        }
    
        driver.close(); // Close the browser
    }
}

/**
 * TC 3: 1.Open gsmarena.com 2.Validate HomePage 3.Click on samsung phone link
 * present in phone finder 4.Check whether page has pagination or not 5.If yes
 * than print pagination link names 6.Navigate to each page and get the page
 * URL.
 */
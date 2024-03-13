package day9.multipleelements;


		import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.time.Duration;

		public class GoogleSuggestion2 {

		    public static void main(String[] args) throws InterruptedException {
		        WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.google.com/");
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		        // Identify the search input field and type "Selenium"
		        driver.findElement(By.name("q")).sendKeys("Selenium");
		        
		        // Wait for the suggestions to be visible
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span")));

		        // Identify all suggestions given by Google
		        List<WebElement> suggestionList = driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));

		        System.out.println("Suggestion count: " + suggestionList.size());

		        boolean foundSeleniumTesting = false;
		        for (int i = 0; i < suggestionList.size(); i++) {
		        	WebElement suggestion=suggestionList.get(i);
		            String suggestionText = suggestion.getText();
		            System.out.println("Suggestion: " + suggestionText);

		            if ("selenium testing".equalsIgnoreCase(suggestionText)) {
		                foundSeleniumTesting = true;
		                suggestion.click(); // Click on the suggestion
		                break;
		            }
		        }

		        if (foundSeleniumTesting) {
		            // Wait for the page to load and verify the search
		            wait.until(ExpectedConditions.titleContains("selenium testing"));
		            System.out.println("Searched for 'selenium testing' successfully.");
		        } else {
		            System.out.println("'selenium testing' suggestion was not found.");
		        }

		        driver.close();
		    }
		

	}



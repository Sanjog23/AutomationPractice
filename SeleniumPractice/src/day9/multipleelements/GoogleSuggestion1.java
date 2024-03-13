package day9.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.time.Duration;

public class GoogleSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.google.com/");
		// identify search input field and type selenium
		driver.findElement(By.name("q")).sendKeys("Selenium");

		// identify all suggestions given by google
		List<WebElement> suggestionList = driver
				.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count: " + suggestionList.size());

		for (int i = 0; i < suggestionList.size(); i++) {
			// to avoid staleElement Exception re-identifying suggestion list
			suggestionList = driver.findElements(
					By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
			WebElement element = suggestionList.get(i);
			String suggestion = element.getText();
			System.out.println("suggestion name: " + suggestion);

			if (suggestion.contains("selenium esting")) {
				element.click(); // Click on the suggestion to search for it
				// Wait for the page to load and verify the search

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.titleContains(suggestion)); 
				System.out.println("Searched for 'selenium testing' successfully.");
				break; // Exit the loop after clicking on the correct suggestion
			}else {
	            System.out.println("'selenium testing' suggestion was not found.");
	        }

			// or
			// System.out.println("suggestion name: "+linksList.get(i).getText());
		}

		driver.close();

	}
}
/*
 * Open google type selenium check suggestion count is 10 or not print one by
 * one all suggestion
 * 
 * TODO: check in the suggestion "selenium testing" present or not if yes then
 * select it and validate same is searched in google or not
 * 
 */
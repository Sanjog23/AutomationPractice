package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Flipkart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Validate home page
		String expectedHomePage = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualHomePage = driver.getTitle();
		System.out.println("Home page validation status:" + expectedHomePage.equals(actualHomePage));
		
		                                      //OR

		boolean isHomePageValid = !driver.findElements(By.cssSelector("img[title='Flipkart']")).isEmpty();
		System.out.println("Is home page valid: " + isHomePageValid);

		List<WebElement> mainMenuOption = driver.findElements(By.cssSelector("div._1yQHx8>div>div>div>div>div>a>div>div>*:last-child>span"));

		System.out.println("Main menu option count is: " + mainMenuOption.size());
		System.out.println("Main menu option name: ");
		for (int i = 0; i < mainMenuOption.size(); i++) {
			String optionName = mainMenuOption.get(i).getText();
			System.out.println(optionName);
		}
		
		List<WebElement> chevronsMenuOptions=driver.findElements(By.cssSelector("div._1ch8e_>div>div>span>span._27h2j1"));
		System.out.println("\nChevron main menu option count is: " + chevronsMenuOptions.size());
	
		List<WebElement> chevronsMenuOptions1=driver.findElements(By.cssSelector("div._1ch8e_>div>div>span>span"));
		System.out.println("Chevron main menu option: ");
		for(WebElement Chevron:chevronsMenuOptions1 ) {
			System.out.println(Chevron.getText());
			
			
		}
		driver.close();

	}

}
/**
 * 1. Open flipkart 2. Validate home page 3. Get main menu option count 4. Print
 * main menu option name
 */
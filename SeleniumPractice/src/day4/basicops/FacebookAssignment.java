package day4.basicops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

	public static void main(String[] args) {
	//Launch the web browser.
		WebDriver driver= new ChromeDriver();
		
		//Open the URL https://www.facebook.com in the current browser.
		driver.get("https://www.facebook.com");
		//Fetching home page title.
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		System.out.println("Home page title: "+actualTitle);
		//Verify actual tile of the home page with the expected title.
		System.out.println("Verify title status: "+expectedTitle.equals(actualTitle));
		
		driver.close();
	}

}
/**
Scenario to Automate:

1. Launch the web browser.
2. Open the URL https://www.facebook.com in the current browser.
3. Fetching home page title.
4. Verify actual tile of the home page with the expected title.
5. Print home page title on the console.
6. Close the browser.
*/
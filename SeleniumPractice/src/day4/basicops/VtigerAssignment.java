package day4.basicops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
	//WebDriver driver=GenericWayToOpenBrowser.setUp("chrome","https:/www.google.com/");
		
		String titleName=driver.getTitle();
		System.out.println("Title name: "+titleName);
		System.out.println("Title length: " +titleName.length());
		
		String expectedUrl="https://demo.vtiger.com/";
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Page URL: "+actualUrl);
		System.out.println("Validate URL status: "+expectedUrl.equals(actualUrl));
		

        // Get and print the page source and its length
        String pageSource = driver.getPageSource();
        int sourceLength = pageSource.length();
        System.out.println("Page Source Length: " + sourceLength);

        // Close the browser
        driver.close();
	}

}
/**
Scenario to Automate:
Launch a new Chrome browser.
Open https://demo.vtiger.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Close the Browser.


*/
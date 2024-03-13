package day6.browserOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://demowebshop.tricentis.com/");
		//maximize browser window
		driver.manage().window().maximize();
		//browser window size
		driver.manage().window().setSize(new Dimension(400, 600));
		//minimize browser window
		driver.manage().window().minimize();
		//maximize browser window
		driver.manage().window().maximize();
		//click on Books link
		driver.findElement(By.linkText("Books")).click();
		//come back to previous page
		driver.navigate().back();
		//again goto next page
		driver.navigate().forward();
		//reload application
		driver.navigate().refresh();
		//if you want to move to another URL
		driver.navigate().to("https://www.google.com");
	}
}

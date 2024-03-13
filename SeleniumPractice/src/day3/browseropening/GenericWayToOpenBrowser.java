package day3.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {
		// ChromeDriver cdriver=new ChromeDriver();
		// or
		//WebDriver driver = new ChromeDriver();
		WebDriver driver1=setUp("chrome");
		

	}

	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver=null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get(appUrl);
		return driver;
	}
	public static WebDriver setUp(String browserName) {
		WebDriver driver1=null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver1 = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver1 = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver1 = new EdgeDriver();
		}
	
		return driver1;
	}
}

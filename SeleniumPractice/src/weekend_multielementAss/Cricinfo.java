package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Cricinfo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String expectedTitle="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
		String actualTitle=driver.getTitle();
		System.out.println("Validating home page: "+actualTitle.equals(expectedTitle));
	                                 //OR
		boolean isHomePageValid=!driver.findElements(By.cssSelector("img[class='logo']")).isEmpty();
		System.out.println("Is home page valid: "+isHomePageValid);
		
		List<WebElement> menuOption=driver.findElements(By.cssSelector("div.ds-flex-1>div>div>a"));
		System.out.println("\nMenu option count is: "+menuOption.size());
		for(WebElement option:menuOption) {
			System.out.println("Menu option name: "+option.getText());
		}
		
		List<WebElement> menuIcons2=driver.findElements(By.cssSelector("div.ds-flex.ds-flex-row.ds-items-center>div.ds-popper-wrapper>div"));
		System.out.println("\nIcon option count: "+menuIcons2.size());
		for(WebElement iconOptions:menuIcons2) {
			System.out.println("Icon option name: "+iconOptions.getText());
		}
		List<WebElement> menuIcons3=driver.findElements(By.cssSelector("div.ci-nav-item.ci-nav-hover>i"));
		System.out.println("\nIcon option name 3: "+menuIcons3.size());
		
		

		driver.close();
	}

}
/**
* 1. Open https://www.espncricinfo.com/ 
* 2. Validate home page 3. Get main menu option count 4. Print
* main menu option name
*/

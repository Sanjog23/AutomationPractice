package day11.propertyfile_calanderdropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.browserOps.ReusableFunctions;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");

		// identify dropdown
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("button[id$='-button']"));
		dropdowns.get(0).click();
		
		List<WebElement> countries=driver.findElements(By.cssSelector(".dropdown-menu.show>div>a"));
		System.out.println("country count: "+countries.size());
		for(WebElement element:countries) {
			System.out.println(element.getText());
		}		
		countries.get(5).click();		
		
		
		// Assuming the active option gets a specific class like 'active'
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a")); // Adjust based on your structure
		String activeOptionText = "";
		for (WebElement option : options) {
		    if (option.getAttribute("class").contains("active")) { // Or any other attribute that marks it as active
		        activeOptionText = option.getText();
		        break;
		    }
		}

		if (!activeOptionText.isEmpty()) {
		    System.out.println("Active option: " + activeOptionText);
		} else {
		    System.out.println("No active option was found.");
		}

	}
}

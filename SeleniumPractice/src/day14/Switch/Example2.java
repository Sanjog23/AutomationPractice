package day14.Switch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day6.browserOps.ReusableFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		
		//to perform operation on input field first get inside the frame 
//		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
				//or
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("tags")).sendKeys("Ja",Keys.ARROW_DOWN,Keys.ENTER);
		//to perform operation on element present in main page, then switch your control back to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
		
	}

}
/**
Open any browser and enter https://jqueryui.com/
click on Autocomplete
type Ja and select 1st suggestion
click on JQueryUI logo.
*/
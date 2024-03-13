package day14.mousops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;

public class JquarySortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://jqueryui.com/sortable/");

		// switching to required frame
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		Actions act = new Actions(driver);

		List<WebElement> listItems = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
//		WebElement sourceElement=driver.findElement(By.xpath("//ul[@id='sortable']/li/span"));
		WebElement drop = driver.findElement(By.id("sortable"));

		for (WebElement element:listItems){
			Thread.sleep(2000);
			System.out.println(element);
			act.dragAndDrop(element, drop).build().perform();
		}
		System.out.println("Ends.............");
		
	}
}
/*
 * place the item from 1 to 7 ---> 7 to 1
 * 
 */
package day14.mousops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;


public class Example4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://jqueryui.com/draggable/");
		
		//switching to required frame 
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		act.dragAndDropBy(src, 200,100).build().perform();
		
		System.out.println("Ends....");
	}

}

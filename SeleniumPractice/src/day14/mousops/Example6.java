package day14.mousops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;


public class Example6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.espncricinfo.com/");
	
		Actions act=new Actions(driver);
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
		System.out.println("Main menu count: "+mainMenu.size());
		
		for(int i=0;i<mainMenu.size();i++) {
			Thread.sleep(1000);
			act.moveToElement(mainMenu.get(i)).perform();
			
		}
		driver.close();
	}

}
/*
 * perform mouse hover in main menu
 * 
 */
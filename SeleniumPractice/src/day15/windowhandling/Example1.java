package day15.windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day6.browserOps.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://etrain.info/in");
		//main page id
		String homeWinId=driver.getWindowHandle();
		//click on linkedin logo to open linkedin page in new tab/window
		driver.findElement(By.cssSelector(".icon-linkedin")).click();
		
		//get all window ids opened by WebDriver instance
		Set<String> allWinIds=driver.getWindowHandles();
		//remove home win id from all win ids
		allWinIds.remove(homeWinId);
		
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		
		//now move control to child window
		driver.switchTo().window(childWinId);
		
		System.out.println("Linkedin title: "+driver.getTitle());
		
		//close- will close only current linkedin page but control won't switch back to main page
		//driver.close();
		
		//to come back to home page
		driver.switchTo().window(homeWinId);
		
		System.out.println("Etrail title: "+driver.getTitle());
		
		//driver.close();
		
		//close all browser instance
		driver.quit();
	}
}
/*
Open browser and enter  etrain url
click linkedin logo present in connect with us section
get the title and print it
come back to home page print title 
 */

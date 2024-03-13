package day14.mousops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;


public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		Actions act=new Actions(driver);
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		System.out.println("Main menu count: "+mainMenu.size());
		
		//perform hover on WebTable link
		//act.moveToElement(mainMenu.get(2)).perform();
		
		//perform hover next menu present right side of WebTable
		//act.moveToElement(mainMenu.get(2), 100, 0).perform();
		
		for(int i=0;i<mainMenu.size();i++) {
			act.moveToElement(mainMenu.get(i)).perform();
		}
		
	}

}

package day9.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.browserOps.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.demoblaze.com/");
		Thread.sleep(5000);
		//identify all link present in the page
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		System.out.println("Link count: "+linksList.size());
		

	}

}

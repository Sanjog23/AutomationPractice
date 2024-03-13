package day14.mousops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		
		//switching to required frame 
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));
		
		Actions act=new Actions(driver);
		
		List<WebElement> srcList=driver.findElements(By.cssSelector("ul#gallery>li>img"));
		WebElement target=driver.findElement(By.id("trash"));
		
		//act.dragAndDrop(srcList.get(0), target).build().perform();
		for(WebElement element:srcList) {
			act.dragAndDrop(element, target).build().perform();
		}
		
	}

}

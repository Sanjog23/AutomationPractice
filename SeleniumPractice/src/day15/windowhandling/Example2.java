package day15.windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.time.Duration;

public class Example2 {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.ecatering.irctc.co.in/");
		
		// Explicit wait page 2 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder ='Search Train or Station to explore']"))).click();		
		
		//enter train number 12627
		driver.findElement(By.cssSelector(".fixed.rounded div:last-child>input")).sendKeys("12627");
//		driver.findElement(By.cssSelector(".fixed.rounded.bg-white.transition-opacity.bottom-0>div>div>div:last-child>input")).sendKeys("12627");
		driver.findElement(By.cssSelector(".w-full>button")).click();
		
//		date from next month
		driver.findElement(By.xpath("//input[@placeholder='Boarding Date']")).click();
		Actions actions = new Actions(driver);
		for(int i=0;i<6;i++){
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		}

		actions.sendKeys(Keys.ENTER).build().perform();
		
//		any station (Itarsi)
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).isSelected();

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[placeholder='Boarding Station']"))).click();
//		driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).click();
		driver.findElement(By.cssSelector("option[value='ET']")).click();
//		click submit

		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
//		driver.findElement(By.cssSelector(".btn-primary.w-full")).click();
		
//		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
//		print all resturent names
		List<WebElement> restaurants=driver.findElements(By.cssSelector(".justify-center>div:last-child>div>div>div>div:last-child>div"));
		for(WebElement elements:restaurants) {
			System.out.println("Name of restaurants: "+elements);
		}
		
	}
}
/*
https://erail.in/
click on eCatering
enter train number 12627
date from next month
any station (Itarsi)
click submit
print all resturent names
go back home page
perform following
	1. from: Pune
	2. to: Bangalore
	3. date from next month
	4. click on get trains
print all the train numbers and name which are running on that particular date
 */

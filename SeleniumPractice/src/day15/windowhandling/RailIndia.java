package day15.windowhandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.browserOps.ReusableFunctions;
import java.time.Duration;

public class RailIndia {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = ReusableFunctions.setUp("chrome", "https://erail.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		String homePageId = driver.getWindowHandle();
//		click on eCatering
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("eCatering"))).click();
		driver.findElement(By.linkText("eCatering")).click();

		// get all window ids opened by WebDriver instance
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(homePageId);

		Iterator<String> itr = allWinId.iterator();
		String childWinId = itr.next();
		// now move control to child window
		driver.switchTo().window(childWinId);

		System.out.println("Page 2 title: " + driver.getTitle());

		// Explicit wait page 2 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
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
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@placeholder='Boarding Station']"))).click();	
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()='Boarding Station']"))).click();		
		//driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).click();
		driver.findElement(By.cssSelector("option[value='ET']")).click();
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		
//		click submit
//		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
//		print all resturent names
		List<WebElement> restaurants=driver.findElements(By.cssSelector(".justify-center>div:last-child>div>div>div>div:last-child>div"));
		for(WebElement elements:restaurants) {
			System.out.println("Name of restaurants: "+elements);
		}
//		go back home page
	    driver.switchTo().window(homePageId);
		System.out.println("Etrail title: "+driver.getTitle());


		Actions action=new Actions(driver);
		//perform following
				//1. from: Pune
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Pune");
		action.sendKeys(Keys.ENTER).build().perform();
				//2. to: Bengaluru
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Bengaluru");
		action.sendKeys(Keys.ENTER).build().perform();
				//3. date from next month
		driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
		driver.findElement(By.xpath("//table[tbody[tr[td[2][table[tbody[tr[td[@style='text-align:right']]]]]]]]/tbody/tr/td[2]/table/tbody/tr[6]/td[5]")).click();
				//4. click on get trains
		driver.findElement(By.id("buttonFromTo")).click();
			    //print all the train numbers and name which are running on that particular date
		List<WebElement> trainNumbers=driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']"));
		List<WebElement> trainNames=driver.findElements(By.xpath("//td[@style=';']"));
		
		for (int i = 0; i < 5; i++) {
			 String trainNumber = trainNumbers.get(i).getText();
			 String trainName = trainNames.get(i).getText();
				driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']"));
				driver.findElements(By.xpath("//td[@style=';']"));
			System.out.println("Train number: "+trainNumber+" Train Name: "+trainName);
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


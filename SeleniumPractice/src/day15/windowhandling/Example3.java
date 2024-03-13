package day15.windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://erail.in/");
				
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

package day14.mousops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.browserOps.ReusableFunctions;


public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		Actions act=new Actions(driver);
		
		WebElement fName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fName.sendKeys("admin");
		act.doubleClick(fName).perform();
		fName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement lName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}

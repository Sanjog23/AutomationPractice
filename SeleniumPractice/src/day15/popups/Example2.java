package day15.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day6.browserOps.ReusableFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//first switch to the frame as Try it button present inside the frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//get text from alert pop-up
		System.out.println(driver.switchTo().alert().getText());
		//accept pop-up
		//driver.switchTo().alert().accept();//for - OK, Yes button
		
		driver.switchTo().alert().dismiss();// for - Cancel, Close, No
		
		String msg=driver.findElement(By.id("demo")).getText();
		System.out.println("Message after alert: "+msg);
	}

}

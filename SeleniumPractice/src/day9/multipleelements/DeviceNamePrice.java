package day9.multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.browserOps.ReusableFunctions;

public class DeviceNamePrice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.demoblaze.com/");

		// identify all devices present in the page
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		// identify all devices price present in the page
		List<WebElement> priceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		                        //OR
		// List<WebElement> priceList=driver.findElements(By.cssSelector("h5"));

		System.out.println("Device count: " + deviceList.size());

		for (int i = 0; i < deviceList.size(); i++) {
//			WebElement deviceElement=deviceList.get(i);
//			String deviceName=deviceElement.getText();
//			WebElement priceElement=priceList.get(i);
//			String devicePrice=priceElement.getText();

			String deviceName = deviceList.get(i).getText();
			String devicePrice = priceList.get(i).getText();

			System.out.println("Device name: " + deviceName + " || Price: " + devicePrice);
			                         // OR
			// System.out.println("Device name: "+linksList.get(i).getText()+ " Price: "+priceList.get(i).getText());
		}
		driver.close();
	}

}
/*
 * get device count print device name one by one
 * 
 * TODO: Print device name and price both
 * 
 */
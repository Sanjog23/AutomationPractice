package day11.propertyfile_calanderdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RedBusAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		Open Redbus.in
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		From Pune
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//text[text()='Pune']")).click();
//		To Goa
		driver.findElement(By.id("dest")).sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//text[text()='Goa']")).click();

//		Date in future
		driver.findElement(By.xpath("//span[text()='Date']")).click();
	
		driver.findElement(By.xpath("//div[starts-with(@class,'DatePicker__MainBlock')]/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//div[starts-with(@class,'DatePicker__MainBlock')]/div[3]/div[5]/span/div[2]")).click();
//		Click on search button
		driver.findElement(By.id("search_button")).click();
//		Departure time should be after 6am
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-of-type(4)>label[class='custom-checkbox']")).click();
        
		//using this to close the popup
		driver.findElement(By.cssSelector("#root>div>div:nth-of-type(3)>div:nth-of-type(2)>i")).click();
//		Bus type “AC”
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='list-chkbox']/li[3]/label[1]")).click();
//		Get the bus name along with its price
//		List<WebElement> busList=driver.findElements(By.cssSelector(".clearfix.bus-item>div>div.row-one>div.column-two>div.travels"));
		
		Thread.sleep(20);
		List<WebElement> busList=driver.findElements(By.cssSelector(".bus-item>div div.travels"));
		
		                        //*****************OR*******************
//		List<WebElement> busList=driver.findElements(By.xpath("//div[@id='result-section']/div/ul/div/li/div/div/div/div/div"));
//		List<WebElement> priceList=driver.findElements(By.cssSelector(".column-seven>div>div>span.f-bold"));
		List<WebElement> priceList=driver.findElements(By.cssSelector(".fare"));
		
		
		for(int i=0;i<busList.size();i++) {
			String busName=busList.get(i).getText();
			String busPrice=priceList.get(i).getText(); 
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			System.out.println("Bus name: "+busName+" Price: "+busPrice);
		}
		Thread.sleep(5000);
//		driver.close();	
	}

}
/*
Open Redbus.in
From Pune
To Goa
Date in future
Click on search button
Departure time should be after 6am
Bus type “AC”
Get the bus name along with its price


*/

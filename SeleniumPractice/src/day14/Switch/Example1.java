package day14.Switch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.browserOps.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://demowebshop.tricentis.com/login");
		
		//identify the element where mouse is blinking/focusing
		WebElement element=driver.switchTo().activeElement();
			
		String activeElementValue=element.getAttribute("name");
		System.out.println("Is username input field having focus? "+activeElementValue.equals("Email"));
		
		//login without identifying any element
		element.sendKeys("tester01@vomoto.com",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("Abc@12345",Keys.ENTER);
		
	}

}
/**
validate mouse focus is on username field or not

login without identifying any element

*/
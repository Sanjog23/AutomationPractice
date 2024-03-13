package day10.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AutomationTesting {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("************************YEAR*************************");
		WebElement yearDropdown=driver.findElement(By.id("yearbox"));
		Select year = new Select(yearDropdown);
		System.out.println("Is year dropdown multiselected: "+year.isMultiple());
		System.out.println("Is year dropdown presence: "+yearDropdown.isDisplayed());
		System.out.println("Is year dropdown functional: "+yearDropdown.isEnabled());
//		default value
		System.out.println("Default selected year: "+year.getFirstSelectedOption().getText());
//		select and validate new selection
		year.selectByVisibleText("1998");
		System.out.println("Year selected from index 5: "+year.getFirstSelectedOption().getText());
//        validate year us showing in ascending order
		
		
		System.out.println("************************MONTH*************************");
	      // Locate the month dropdown using xpath
		WebElement monthDropdown=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month=new Select(monthDropdown);
		System.out.println("Is month dropdown multiselect: "+month.isMultiple());
		System.out.println("Is month dropdown presence: "+monthDropdown.isDisplayed());
		System.out.println("Is month dropdown functional: "+monthDropdown.isEnabled());
//		default value
		System.out.println("Default selected month: "+month.getFirstSelectedOption().getText());
//		select and validate new selection
		month.selectByIndex(3);
		System.out.println("Month selected from index 2: "+month.getFirstSelectedOption().getText());
		
		
		System.out.println("************************DATE*************************");
		 // Locate the month dropdown 
		WebElement dateDropdown=driver.findElement(By.id("daybox"));
		Select date=new Select(dateDropdown);
		System.out.println("Is date dropdown multiselect: "+date.isMultiple());
		System.out.println("Is date dropdown visible: "+dateDropdown.isDisplayed());
		System.out.println("Is date dropdown functional: "+dateDropdown.isEnabled());
//		default value
		System.out.println("Default selected date: "+date.getFirstSelectedOption().getText());
		//date.selectByVisibleText("23");
		date.selectByValue("23");
		System.out.println("Date selected based on value: "+date.getFirstSelectedOption().getText());
		
		driver.quit();
	}

}
/**
year: perform following actions
    validate  -   presence, functional or not
                 default value
                 select and validate new selection
                 validate year us showing in ascending order
                 
month: perform following actions
    validate  -   presence, functional or not
                 default value
                 select and validate new selection
                 validate year us showing in ascending order           
*/ 
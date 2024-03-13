package weekend_multielementAss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookMultiElement {

	public static void main(String[] args) {
		// Launch the web browser.
		WebDriver driver = new ChromeDriver();

		// Open the URL https://www.facebook.com in the current browser.
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Validate home page title.
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println("Validate home page: "+expectedTitle.equals(actualTitle));
		
		
//		Click on create account button
		driver.findElement(By.linkText("Create new account")).click();    
		
		WebElement date=driver.findElement(By.id("day"));
		Select dateDropdown=new Select(date);
		System.out.println("Is date dropdown multiselect: "+dateDropdown.isMultiple());
		System.out.println("Is date dropdown visible: "+date.isDisplayed());
		System.out.println("Is date dropdown functional: "+date.isEnabled());
//		Option count
		List <WebElement> dateOptionCount=dateDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+dateOptionCount.size());
//		Name
		System.out.println("Elements of date dropdown: ");
		for(WebElement dateElement: dateOptionCount) {
			System.out.println(dateElement.getText());
		}
//		Default value
		System.out.println("By default selected option: "+dateDropdown.getFirstSelectedOption().getText());
//      change value and check the updated value
		dateDropdown.selectByIndex(22);
		System.out.println("Date selected from index 22: "+dateDropdown.getFirstSelectedOption().getText());
		
		System.out.println("********************************************");
		WebElement month=driver.findElement(By.id("month"));
		Select monthDropdown =new Select(month);
		System.out.println("Is month dropdown multiselect: "+monthDropdown.isMultiple());
		System.out.println("Is month dropdown visible: "+month.isDisplayed());
		System.out.println("Is month dropdown functional: "+month.isEnabled());
//		Option count
		List<WebElement> monthOptionCount=monthDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+monthOptionCount.size());
//		Name
		System.out.println("Elements of month dropdown: ");
		for(WebElement monthElement:monthOptionCount) {
			System.out.println(monthElement.getText());
		}
//		Default value
		System.out.println("Default selected month: "+monthDropdown.getFirstSelectedOption().getText());
//      change value and check the updated value
		monthDropdown.selectByIndex(2);
		System.out.println("Month selected from index 2: "+monthDropdown.getFirstSelectedOption().getText());

		System.out.println("********************************************");
		WebElement year=driver.findElement(By.id("year"));
		Select yearDropdown=new Select (year);
		System.out.println("Is year dropdown multiselect: "+yearDropdown.isMultiple());
		System.out.println("Is year dropdown visible: "+year.isDisplayed());
		System.out.println("Is year dropdown functional: "+year.isEnabled());
//		Option count
		List<WebElement> yearOptionCount=yearDropdown.getOptions();
		System.out.println("Option count in skill dropdown: "+yearOptionCount.size());
//		Name
		System.out.println("Elements of year dropdown: ");
		for(WebElement yearElement:yearOptionCount) {
			System.out.println(yearElement.getText());
		}
//		Default value
        System.out.println("Default selected month: "+yearDropdown.getFirstSelectedOption().getText());
//      change value and check the updated value
        yearDropdown.selectByIndex(26);
        System.out.println("Year selected from index 26: "+yearDropdown.getFirstSelectedOption().getText());
		
		
driver.close();
	}

}

/**
 TC :
 1. Open facebook 
 2.Validate home page
 3.Click on create account button
 4.Perform following operation on date, month and year
 -->dropdown
 
 +Visible
 +Enable
 +Multiselected
 +Option count
 +Name
 +Default value
 +change value and check the updated value
 */
 

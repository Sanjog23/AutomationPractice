package day10.dropdownlist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AutomationTesting3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println("************************YEAR*************************");
		
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		//Create an instance of select class
		Select selectYearDropdown= new Select(yearDropdown);
		
		System.out.println("Is year dropdown multiselected: " + selectYearDropdown.isMultiple());
		System.out.println("Is year dropdown presence: " + yearDropdown.isDisplayed());
		System.out.println("Is year dropdown functional: " + yearDropdown.isEnabled());
//		default value
		System.out.println("Default selected year: " + selectYearDropdown.getFirstSelectedOption().getText());
//		select and validate new selection
		selectYearDropdown.selectByVisibleText("1998");
		System.out.println("Year selected from index 5: " + selectYearDropdown.getFirstSelectedOption().getText());

//      Print month from month dropdown
		List<WebElement> yearList = selectYearDropdown.getOptions();
//      Store the years in an ArrayList
        List<Integer> years=new ArrayList<Integer>();
	    for(int i=1;i<yearList.size();i++) {
	    	try {
	    		int year=Integer.parseInt(yearList.get(i).getText());
	    		years.add(year);
	    	}catch (NumberFormatException e) {
	    		//Skip the option if it's not avalid year
	    		continue;
	    	}
	    }	
	    //Check if years are in ascending order
	    boolean isAscending = true;
	    for(int j=0;j<years.size()-1;j++) {
	    	if(years.get(j)>years.get(j+1)) {
	    		isAscending=false;
	    		break;
	    	}
	    }
	    //Print the result
	    if(isAscending) {
	    	System.out.println("Years are in ascending order.");
	    }else {
	    		System.out.println("Years are not in ascending order.");
	    	}
		driver.quit();

	    }
	}


	


/**
 * year: perform following actions validate - presence, functional or not
 * default value select and validate new selection validate year us showing in
 * ascending order
 * 
 * month: perform following actions validate - presence, functional or not
 * default value select and validate new selection validate year us showing in
 * ascending order
 */
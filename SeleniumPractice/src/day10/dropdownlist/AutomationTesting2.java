package day10.dropdownlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AutomationTesting2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println("************************YEAR*************************");
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		Select year = new Select(yearDropdown);
		System.out.println("Is year dropdown multiselected: " + year.isMultiple());
		System.out.println("Is year dropdown presence: " + yearDropdown.isDisplayed());
		System.out.println("Is year dropdown functional: " + yearDropdown.isEnabled());
//		default value
		System.out.println("Default selected year: " + year.getFirstSelectedOption().getText());
//		select and validate new selection
		year.selectByVisibleText("1998");
		System.out.println("Year selected from index 5: " + year.getFirstSelectedOption().getText());

//      Print month from month dropdown
		List<WebElement> yearList = year.getOptions();

		System.out.println("Print month from month dropdown");
		for (WebElement elementMonth : yearList) {
			System.out.println(elementMonth.getText());
		}
//		  validate year showing in ascending order
		ArrayList<Integer> originalYear = new ArrayList<Integer>();
		Collections.addAll(originalYear, 1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928,
				1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945,
				1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962,
				1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979,
				1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996,
				1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
				2014, 2015);

		ArrayList<Integer> duplicateYear = new ArrayList<Integer>(originalYear);
		Collections.sort(duplicateYear);

		System.out.println("Original List: " + originalYear);
		System.out.println("Sorted Duplicate List: " + duplicateYear);

		System.out.println("Year comparision: " + originalYear.equals(duplicateYear));

		System.out.println("************************MONTH*************************");
		// Locate the month dropdown using xpath
	//	WebElement monthDropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		WebElement monthDropdown = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select month = new Select(monthDropdown);
		System.out.println("Is month dropdown multiselect: " + month.isMultiple());
		System.out.println("Is month dropdown presence: " + monthDropdown.isDisplayed());
		System.out.println("Is month dropdown functional: " + monthDropdown.isEnabled());
//		default value
		System.out.println("Default selected month: " + month.getFirstSelectedOption().getText());
//		select and validate new selection
		month.selectByIndex(3);
		System.out.println("Month selected from index 2: " + month.getFirstSelectedOption().getText());

		List<WebElement> listOptions = month.getOptions();
		System.out.println("Print month from month dropdown");
		for (WebElement elementMonth : listOptions) {
			System.out.println(elementMonth.getText());
		}

		String expectedMonths = "Month,January,February,March,April,May,June,July,August,September,October,November,December";
		String actualMonths = "";
//		  validate month showing in ascending order
		for (int i = 0; i < listOptions.size(); i++) {
			if (i != listOptions.size() - 1) {
				actualMonths = actualMonths + listOptions.get(i).getText() + ",";
			} else {
				actualMonths = actualMonths + listOptions.get(i).getText();
			}
		}
		System.out.println("Expected months: " + expectedMonths);
		System.out.println("Actual months: " + actualMonths);

		System.out.println("Months comparision: " + actualMonths.equals(expectedMonths));

		System.out.println("************************DATE*************************");
		// Locate the month dropdown
		WebElement dateDropdown = driver.findElement(By.id("daybox"));
		Select date = new Select(dateDropdown);
		System.out.println("Is date dropdown multiselect: " + date.isMultiple());
		System.out.println("Is date dropdown visible: " + dateDropdown.isDisplayed());
		System.out.println("Is date dropdown functional: " + dateDropdown.isEnabled());
//		default value
		System.out.println("Default selected date: " + date.getFirstSelectedOption().getText());
		// date.selectByVisibleText("23");
		date.selectByValue("23");
		System.out.println("Date selected based on value: " + date.getFirstSelectedOption().getText());

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
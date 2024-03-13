package day10.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MultiSelectionDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//identify dropdown
		WebElement multiSelection=driver.findElement(By.id("multiselect1"));
		//create an instance of select class
		Select selectSkill = new Select(multiSelection);
		
		System.out.println(selectSkill.isMultiple());
		
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(1);
		selectSkill.selectByIndex(2);
		
		System.out.println("Number of option are selected: "+selectSkill.getAllSelectedOptions().size()); //.getAllSelectedOptions() this method can only used in multi select dropdown

		selectSkill.deselectByIndex(0);
		selectSkill.deselectAll();
		
		
	}

}

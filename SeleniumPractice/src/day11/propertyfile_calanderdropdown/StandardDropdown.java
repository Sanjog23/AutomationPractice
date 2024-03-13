package day11.propertyfile_calanderdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day6.browserOps.ReusableFunctions;

public class StandardDropdown {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://demo.automationtesting.in/Register.html");
		
		//identify dropdown
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		//create an instance of Select class
		Select selectSkill=new Select(skillDropdown);
		
		System.out.println("is dropdown multiselect? "+selectSkill.isMultiple());
		
		List<WebElement> optionList=selectSkill.getOptions();
		System.out.println("Option count in skill dropdown: "+optionList.size());
		
		//get already selected or newly select option
		System.out.println("By Default selected option: "+selectSkill.getFirstSelectedOption().getText());
		
		//to select option from dropdown using any one method
		selectSkill.selectByIndex(2);
		System.out.println("Option selected from index 2: "+selectSkill.getFirstSelectedOption().getText());
		
		selectSkill.selectByValue("APIs");
		System.out.println("Option selected using value as 'APIs': "+selectSkill.getFirstSelectedOption().getText());
		
		selectSkill.selectByVisibleText("Backup Management");
		System.out.println("Option selected using VisibleText as 'Backup Management': "+selectSkill.getFirstSelectedOption().getText());
	
		System.out.println("**************Print all options from skill dropdown***************************");
//		for(WebElement element: optionList) {
//			System.err.println(element.getText());
//		}
					//or
		String expectedSkills="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String actualSkills="";
		for(int i=0;i<optionList.size();i++) {
			if(i!=optionList.size()-1) {
				actualSkills=actualSkills+optionList.get(i).getText()+",";
			}else {
				actualSkills=actualSkills+optionList.get(i).getText();
			}
		}
		System.out.println("Expected Skills\n"+expectedSkills);
		System.out.println("Actual Skills\n"+actualSkills);
		
		System.out.println("Skill comparision: "+actualSkills.equals(expectedSkills));
	}
}
/**
year: perform following actions
	validate - presence, functional or not
			default value
			select and validate new selection
			validate year is showing in ascending order
month: perform following actions
	validate - presence, functional or not
			default value
			select and validate new selection
			validate month is showing as expected	

*/
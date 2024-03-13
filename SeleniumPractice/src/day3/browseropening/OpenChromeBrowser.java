package day3.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver cdriver=new ChromeDriver();
	}
}
/*
* selenium opens a fresh for each run
* on that browser, you won't have
* 	- history
* 	- cookies
* 	- plugins
*/
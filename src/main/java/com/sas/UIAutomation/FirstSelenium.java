package com.sas.UIAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sinlka\\eclipse-workspace\\chromedriver.exe");
	  
	        ChromeDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        // using maximize() method
	        driver.manage().window().maximize();
	  
	        // Launching website
	        driver.get("https://www.geeksforgeeks.org/");
	        driver.close();

	}

}

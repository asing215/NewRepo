package com.sas.UIAutomation;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class UIDemo {
  @Test
  public void f() {
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

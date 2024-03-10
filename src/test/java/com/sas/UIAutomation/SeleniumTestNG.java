package com.sas.UIAutomation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNG {
	    WebDriver webdriver;
	    String username = "user-name";
	    String access_key = "access-key";
	    ChromeDriver driver;
	
	@BeforeTest
    public void init() throws InterruptedException, MalformedURLException
    {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sinlka\\eclipse-workspace\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
//        options.merge(capabilities);
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.guru99.com/maven-jenkins-with-selenium-complete-tutorial.html");
//        driver.manage().window().maximize();
//        System.out.println("Started session");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sinlka\\eclipse-workspace\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("C:\\Users\\sinlka\\Downloads\\extension_5_4_1_0.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//driver.quit();
		System.out.println("First Browser Opened Successfully");
        
    }

	@Test(description = "Demonstration of AssertEquals in Selenium Java", priority = 1, enabled = true)
    public void Test_assert_equals() throws IOException, InterruptedException
    {
        String exp_title = "Most Powerful Cross Browser Testing Tool Online | LambdaTest";
        String test_url = "https://www.lambdatest.com";
 
        driver.manage().window().maximize();
        driver.get(test_url);
        Thread.sleep(3000);
 
        String curr_window_title = driver.getTitle();
        /* Hard Assert */
        Assert.assertEquals(curr_window_title, exp_title);
        System.out.println("AssertEquals Test Passed\n");
}
}

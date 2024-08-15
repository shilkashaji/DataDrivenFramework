package org.automation.frame.base;

//import java.io.IOException;

import org.automation.frame.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class DriverInstance {

	public WebDriver driver;
	
	  @BeforeMethod

	    public void initiateDriverInstance() throws Exception {
		
		if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

			driver = new ChromeDriver();
		}

		     driver.get(Utility.fetchPropertyValue("applicationURL").toString());

	 }

	  @AfterMethod
	public void closeDriverInstance() {

		
		driver.quit();
	}
}

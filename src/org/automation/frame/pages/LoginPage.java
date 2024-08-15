package org.automation.frame.pages;

import org.automation.frame.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	   this.driver= driver;
	}

	public void enterUsername(String uname) throws Exception
	{
	     driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	
	public void enterPassword(String pass) throws Exception
	{
		 driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	
	public void ClickSignin() throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_signin_xpath"))).click();
	}
}

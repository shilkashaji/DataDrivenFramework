package org.automation.frame.testcases;

import org.automation.frame.base.DriverInstance;
import org.automation.frame.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctinality extends DriverInstance{
	
	@Test
	public void tc_001_login_functionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("uname1");
		login.enterPassword("pass1");
		login.ClickSignin();
	}

}

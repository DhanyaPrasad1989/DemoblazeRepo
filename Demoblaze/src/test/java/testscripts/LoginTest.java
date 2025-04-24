package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test 
	public void logIn() throws IOException
	{
	LoginPage loginobj=new LoginPage(driver);
	loginobj.loginButton();
	loginobj.enterUsername();
	loginobj.enterPwd();
	loginobj.submitLogin();

}
}
package testscripts;

import java.io.IOException;

import pages.LoginPage;

public class LoginTest extends Base {
	public void logIn() throws IOException
	{
	LoginPage loginobj=new LoginPage(driver);
	loginobj.loginButton();
	loginobj.enterUsername();
	loginobj.enterPwd();
	loginobj.submitLogin();

}
}
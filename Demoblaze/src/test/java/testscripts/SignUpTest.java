package testscripts;

import java.io.IOException;


import pages.SignUpPage;

public class SignUpTest extends Base{
	public void signUp() throws IOException
	{
		SignUpPage signpage=new SignUpPage(driver);
		signpage.signButton();
		signpage.enterUserName();
		signpage.password();
		signpage.signUp();
	}
}

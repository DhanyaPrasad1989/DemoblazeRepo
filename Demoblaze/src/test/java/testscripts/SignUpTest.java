package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SignUpPage;

public class SignUpTest extends Base{
	@Test
	public void signUp() throws IOException
	{
		SignUpPage signpage=new SignUpPage(driver);
		signpage.signButton();
		signpage.enterUserName();
		signpage.password();
		signpage.sign();
	}
}

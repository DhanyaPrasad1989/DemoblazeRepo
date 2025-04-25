package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogOutPage;

public class LogOutTest extends Base{
	@Test
	
	public void checkOutProduct() throws IOException
	{
		LogOutPage log=new LogOutPage(driver);
		log.logoutButton();
	}

}

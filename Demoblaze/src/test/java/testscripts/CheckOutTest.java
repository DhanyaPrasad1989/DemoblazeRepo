package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CheckOutPage;

public class CheckOutTest extends Base{
	@Test
	
	public void checkOutProduct() throws IOException
	{
		CheckOutPage checkout=new CheckOutPage(driver);
		checkout.fillForm();
	}

}

package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.NavigateCartPage;

public class CheckOutTest extends Base{
	@Test
	
	public void checkOutProduct() throws IOException
	{
		NavigateCartPage cart=new NavigateCartPage(driver);
		cart.cartLink();
		cart.placeOrder();
		CheckOutPage checkout=new CheckOutPage(driver);
		checkout.fillForm();
	}

}

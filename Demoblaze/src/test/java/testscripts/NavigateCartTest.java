package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.NavigateCartPage;

public class NavigateCartTest extends Base{
	@Test
	
	public void NavigateProductToCart() throws IOException
	{
		NavigateCartPage cart=new NavigateCartPage(driver);
		cart.cartLink();
		cart.placeOrder();
	}

	
}

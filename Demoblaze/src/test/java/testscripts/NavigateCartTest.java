package testscripts;

import java.io.IOException;

import pages.NavigateCartPage;

public class NavigateCartTest extends Base{
	public void NavigateProductToCart() throws IOException
	{
		NavigateCartPage cart=new NavigateCartPage(driver);
		cart.cartLink();
		cart.placeOrder();
	}

	
}

package testscripts;

import java.io.IOException;

import pages.AddProductPage;

public class AddProductTest extends Base {
	public void addProductToCart() throws IOException
	{
		AddProductPage addpro=new AddProductPage(driver);
		addpro.addCart();
	}

}

package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddProductPage;

public class AddProductTest extends Base {
	@Test
	public void addProductToCart() throws IOException
	{
		AddProductPage addpro=new AddProductPage(driver);
		addpro.addCart();
	}

}

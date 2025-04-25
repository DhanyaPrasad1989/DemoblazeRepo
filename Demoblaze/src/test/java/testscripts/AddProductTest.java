package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddProductPage;
import pages.LoginPage;
import pages.SelectProductPage;

public class AddProductTest extends Base {
	@Test
	public void addProductToCart() throws IOException
	{
		SelectProductPage product=new SelectProductPage(driver);
		AddProductPage addpro=new AddProductPage(driver);
		product.cat();
		product.phone();
		product.sam();
		addpro.addCart();
		
	}

}

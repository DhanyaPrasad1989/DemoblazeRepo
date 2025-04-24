package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SelectProductPage;

public class SelectProductTest extends Base{
	@Test
	public void selectProduct() throws IOException
	{
		SelectProductPage product=new SelectProductPage(driver);
		product.cat();
		product.phone();
		product.sam();
	}

}

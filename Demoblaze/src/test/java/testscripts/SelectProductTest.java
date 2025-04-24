package testscripts;

import java.io.IOException;

import pages.SelectProductPage;

public class SelectProductTest extends Base{
	public void selectProduct() throws IOException
	{
		SelectProductPage product=new SelectProductPage(driver);
		product.cat();
		product.phone();
		product.sam();
	}

}

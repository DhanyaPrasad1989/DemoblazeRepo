package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateCartPage {
	WebDriver driver;
	public NavigateCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//a[@id='cartur']")private WebElement cart;
	@FindBy(xpath="//button[text()='Place Order']")private WebElement order;
	public void cartLink()
	{
		cart.click();;
	}
	public void placeOrder()
	{
		order.click();
	}
}

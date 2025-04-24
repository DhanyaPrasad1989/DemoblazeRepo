package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {
	WebDriver driver;
	public SelectProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//a[text()='CATEGORIES']")private WebElement categories;
	@FindBy(xpath="//a[text()='CATEGORIES']//following::a[text()='Phones']")private WebElement phones;
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")private WebElement samsung;
	
	public void cat()
	{
		categories.click();
		
	}
	public void phone()
	{
		phones.click();
		
	}
	public void sam()
	{
		samsung.click();
	}
}

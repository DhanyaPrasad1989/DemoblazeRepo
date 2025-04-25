package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@id='name']")private WebElement name;
	@FindBy(xpath="//input[@id='country']")private WebElement country;
	@FindBy(xpath="//input[@id='city']")private WebElement city;
	@FindBy(xpath="//input[@id='card']")private WebElement card;
	@FindBy(xpath="//input[@id='month']")private WebElement month;
	@FindBy(xpath="//input[@id='year']")private WebElement year;
	@FindBy(xpath="//button[@onclick='purchaseOrder()']")private WebElement purchase;
	
	public void fillForm()
	{
		name.sendKeys("Dhanya");
		country.sendKeys("India");
		city.sendKeys("Trivandrum");
		card.sendKeys("1234 5678 1234");
		month.sendKeys("April");
		year.sendKeys("2025");
		purchase.click();
		driver.switchTo().alert().accept();
		
	}
}

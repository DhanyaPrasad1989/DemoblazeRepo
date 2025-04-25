package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//a[@id='logout2']")private WebElement logout;
	public void logoutButton()
	{
		logout.click();
	}
}

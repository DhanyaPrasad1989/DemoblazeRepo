package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//a[@id='signin2']")private WebElement signbutton;
	@FindBy(xpath="//input[@id='sign-username']")private WebElement user;
	@FindBy(xpath="//input[@id='sign-password']")private WebElement pass;
	@FindBy(xpath="//button[text()='Sign up']")private WebElement signup;
	//@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alert;
	
	public void signButton()
	{
		signbutton.click();
		
	}
	public void enterUserName()
	{
		user.sendKeys("Dhanya@27");
		
	}
	public void  password()
	{
		pass.sendKeys("Dhanya");
		
	}
	
	public void  signUp()
	{
		signup.click();
		driver.switchTo().alert().accept();
	}
}

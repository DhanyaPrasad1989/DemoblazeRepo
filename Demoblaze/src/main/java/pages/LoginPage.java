package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//a[@id='login2']")private WebElement login;
	@FindBy(xpath="//input[@id='loginusername']")private WebElement user;
	@FindBy(xpath="//input[@id='loginpassword']")private WebElement pass;
	@FindBy(xpath="//button[@onclick='logIn()']")private WebElement buttonlog;
	//@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alert;
	public void loginButton() {

		login.click();
		
	}
	public void enterUsername() {

		user.sendKeys("Dhanya@27");
		

	}
	public void enterPwd() {

		pass.sendKeys("Dhanya");
		

	}
	

	public void submitLogin() {
		buttonlog.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
	}

}

package testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;

//import com.beust.jcommander.Parameters;

import utilities.ScreenShotUtility;
//import utilities.WaitUtility;


public class Base {
public WebDriver driver;
public  ScreenShotUtility scrshot;
public Properties properties;
@BeforeMethod(alwaysRun = true)
//	@Parameters("browser")
	public void initializeBrowser()
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();

	//driver.get(properties.getProperty("url"));
	
	//driver = new ChromeDriver();
	//driver.get("https://groceryapp.uniqassosiates.com/admin/login");	
	//driver.manage().window().maximize();
	}

/*@AfterMethod(alwaysRun=true)
	
public void browserQuit(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == ITestResult.FAILURE) {
		scrshot = new ScreenShotUtility();
		scrshot.captureFailureScreenShot(driver, iTestResult.getName());
	}

	driver.quit();
}
*/
	
}

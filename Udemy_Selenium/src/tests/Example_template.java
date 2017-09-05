package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import isimHome.HomePage;
import isimHome.LoginPage;
import isimProfile.ProfileContract;
import isimProfile.ProfileEmployee;
import isimProfile.ProfileEmployer;
import isimProfile.ProfileSecurity;
import isimProfile.ProfileSite;
import isimProfile.ProfileSiteCard;
import isimProfile.ProfileWorkings;
import isimProfile.ViewAndEditProfile;
import requestAndDeleteAccess.SelectUser;
import utilities.Screenshots;

public class Example_template {
	private WebDriver driver;
	private String baseUrl;

	// Define page elements page Loginpage gets name loginpage
	LoginPage loginPage;


	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Workspace\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "";
		loginPage = new LoginPage(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(baseUrl);
	}

	@Test (priority=1, enabled=true)
	public void Test_template() throws Exception {
		loginPage.fillUsername("username");
		loginPage.fillPassword("password");
		loginPage.clickLoginButton();
		somePage.assertAttributeValue("Some value");
		Reporter.log("Test to run.", true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			Screenshots.takeScreenshot(driver, testResult.getName());
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}

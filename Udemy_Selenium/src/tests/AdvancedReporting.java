package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import utilities.ExtentReport;
import utilities.ScreenshotToReport;


public class AdvancedReporting {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	LoginPage loginPage;

  @BeforeClass
  public void beforeClass() {
	  baseUrl = "http://letskodeit.com/";
	  report = ExtentReport.reportResult();
	  test = report.startTest("Verify Welcome Text");
	  driver = new ChromeDriver();
	  loginPage = new LoginPage(driver, test);
	  driver.get(baseUrl);
	  test.log(LogStatus.INFO, "Browser Started");
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser Maximized");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  test.log(LogStatus.INFO, "Web application opened");
  }
	
  @Test(priority=1, enabled=true)
  public void loginTestIsPassed() throws InterruptedException {
	  loginPage.clickSignupLink();
	  loginPage.CLickLoginLink();
	  loginPage.FillEmailField("test@email.com");
	  loginPage.FillPasswordField("abcabc");
	  loginPage.ClickGoButton();
	  loginPage.assertWelcomeText();
	  loginPage.ClickLogOutButton();
  }
  
  @Test(priority=2, enabled=true)
  public void loginTestIsFailed() throws InterruptedException {
	  loginPage.clickSignupLink();
	  loginPage.CLickLoginLink();
	  loginPage.FillEmailField("testi@email.com");
	  loginPage.FillPasswordField("abcabc");
	  loginPage.ClickGoButton();
	  loginPage.assertWelcomeText();
  }
 
  @AfterMethod
  public  void afterMethod(ITestResult testResult) throws IOException {
	  if (testResult.getStatus() == ITestResult.FAILURE) {
		  String path = ScreenshotToReport.takeScreenshot(driver, testResult.getName());
		  String imagePath = test.addScreenCapture(path);
		  test.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}

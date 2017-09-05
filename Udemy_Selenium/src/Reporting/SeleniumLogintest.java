package Reporting;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import utilities.ExtentReport;
import utilities.ScreenshotToReport;

public class SeleniumLogintest {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	
  @BeforeClass
  public void beforeClass() {
	  baseUrl = "http://letskodeit.com/";
	  report = ExtentReport.reportResult();
	  test = report.startTest("Verify Welcome Text - Passed Version");
	  driver = new ChromeDriver();
	  test.log(LogStatus.INFO, "Browser Started");
	  
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser Maximized");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
	  test.log(LogStatus.INFO, "Web application opened");
  }
	
  @Test
  public void validLoginTest() throws InterruptedException {
	  WebElement signbupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
	  signbupLink.click();
	  test.log(LogStatus.INFO, "Clicked on signup link");
	  
	  WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
	  loginLink.click();
	  test.log(LogStatus.INFO, "Clicked on login link");
	  
	  WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
	  emailField.sendKeys("test@email.com");
	  test.log(LogStatus.INFO, "Entered email");
	  
	  WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
	  passwordField.sendKeys("abcabc");
	  test.log(LogStatus.INFO, "Entered password");
	  
	  WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
	  goButton.click();
	  test.log(LogStatus.INFO, "Clicked on go button");
	  
	  Thread.sleep(3000);
	  
	  WebElement welcomeText = null;
	  
	  try {
		  welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
	  }
	  catch (NoSuchElementException e) {
		  System.out.println(e.getMessage());
	  }
	  Assert.assertTrue(welcomeText != null);
	  test.log(LogStatus.PASS, "Verified Welcome Text");
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

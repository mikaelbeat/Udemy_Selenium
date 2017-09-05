package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage {
	
	
	WebDriver driver;
	ExtentTest test;
	
	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void clickSignupLink() {
		  WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		  signupLink.click();
		  test.log(LogStatus.INFO, "Clicked on signup link");
	}
	
	public void CLickLoginLink() {
		  WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		  loginLink.click();
		  test.log(LogStatus.INFO, "Clicked on login link");
	}
	
	public void FillEmailField(String user) {
		  WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		  emailField.sendKeys(user);
		  test.log(LogStatus.INFO, "Entered email");
	}
	
	public void FillPasswordField(String user) {
		  WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		  passwordField.sendKeys(user);
		  test.log(LogStatus.INFO, "Entered password");
	}
	
	public void ClickGoButton() {
		  WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
		  goButton.click();
		  test.log(LogStatus.INFO, "Clicked on go button");	
	}
	
	public void assertWelcomeText() {
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
	
	public void ClickLogOutButton() throws InterruptedException {
		  WebElement logOutButton = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		  logOutButton.click();
		  Thread.sleep(3000);
		  test.log(LogStatus.INFO, "Clicked on go button");	
	}
	
	
	
	
	
	
	
	}








	

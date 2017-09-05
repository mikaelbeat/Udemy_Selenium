package adactinClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassesBookingConfirmation {
	
	private static final Logger log = LogManager.getLogger(ClassesBookingConfirmation.class.getName());
	
	WebDriver driver;
	
	// Define logout button
	@FindBy (id="logout")
	WebElement logOut;
	
	public ClassesBookingConfirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement element = null;
	
	
	
	//Order number
	public static WebElement ordeNRO(WebDriver driver) {
		element = driver.findElement(By.id("order_no"));
		ExpectedConditions.visibilityOfElementLocated(By.id("order_no"));
		return element;
	}
	
	//Clicks Logout button
	public void clickLogOutButton() {
		logOut.click();
	}
	

}

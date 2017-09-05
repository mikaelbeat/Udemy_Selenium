package adactinClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassesSelectHotel {
	
	private static final Logger log = LogManager.getLogger(ClassesSelectHotel.class.getName());
	
	WebDriver driver;
	
	// Define radiobutton to choose hotel
	@FindBy (id="radiobutton_0")
	WebElement selectHotel;
	
	// Define continue button
	@FindBy (id="continue")
	WebElement continueButton;
	
	public ClassesSelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Clicks on radiobutton
	public void ClickOnRadiobutton() {
		selectHotel.click();
	}
	
	// Clicks on continue button
	public void ClickOnContinuebutton() {
		continueButton.click();
	}

}

package pageClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testNGdemo.TestNG_Asserts;

public class SearchPage2 {
	WebDriver driver;
	
	private static final Logger log = LogManager.getLogger(SearchPage2.class.getName());
	
	
	
	@FindBy(id="tab-flight-tab")
	WebElement flightTab;
	
	@FindBy(id="flight-origin")
	WebElement origin;
	
	@FindBy(id="flight-destination")
	WebElement destination;


	@FindBy(id="flight-departing")
	WebElement departure;
	

	@FindBy(id="flight-returning")
	WebElement returning;

	@FindBy(id="search-button") 
	WebElement searchButton;
	
	@FindBy(id="advanced-options")
	WebElement advanced;
	
	@FindBy(id="flight-advanced-preferred-class")
	WebElement preferred;
	
	public SearchPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		flightTab.click();
	}
	
	public void fillOrigin(String where) {
		origin.sendKeys(where);
	}
	
	public void fillDestination(String to) {
		destination.sendKeys(to);
	}
	
	public void fillDeparture(String whenGo) {
		departure.sendKeys(whenGo);
	}
	
	public void fillReturn(String whenBack) {
		returning.sendKeys(whenBack);
	}
	
	public void clickSearchButton() {
		searchButton.click();;
	}

	public void selectAdvancedOptions(String aOptions) {
		advanced.sendKeys(aOptions);
	}
	
	public void selectPreferredClass(String pClass) {
		preferred.sendKeys(pClass);
	}


}

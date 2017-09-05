package adactinClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNGdemo.TestNG_Asserts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassesBookHotel {
	
	private static final Logger log = LogManager.getLogger(ClassesBookHotel.class.getName());
	
	WebDriver driver;
	
	// Define first name field
	@FindBy(id="first_name")
	WebElement firstName;
	
	// Define last name field
	@FindBy(id="last_name")
	WebElement lastName;
	
	// Define address field
	@FindBy(id="address")
	WebElement address;
	
	// Define credit card number field
	@FindBy(id="cc_num")
	WebElement ccNum;

	// Define credit card type field
	@FindBy(id="cc_type")
	WebElement ccType;
	
	// Define credit card expire month field
	@FindBy(id="cc_exp_month")
	WebElement ccExp;
	
	// Define credit card expire year field
	@FindBy(id="cc_exp_year")
	WebElement ccYear;
	
	// Define credit card cvv number field
	@FindBy(id="cc_cvv")
	WebElement ccCVV;
	
	// Define booknow button
	@FindBy(id="book_now")
	WebElement bookNowButton;
	
	public ClassesBookHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Sends keys to first name field
	public void fillFirstName(String first) {
		firstName.sendKeys(first);
	}
	
	// Sends keys to last name field
	public void fillLastName(String last) {
		lastName.sendKeys(last);
	}
	
	// Sends keys to address field
	public void fillAddress(String Homeaddress) {
		address.sendKeys(Homeaddress);
	}
	
	// Sends keys to credit card number field
	public void fillCreditCardNumber(String ccNumber) {
		ccNum.sendKeys(ccNumber);
	}
	
	// Sends keys to credit card type field
	public void fillCreditCardtype(String cCardType) {
		ccType.sendKeys(cCardType);
	}
	
	// Sends keys to credit card expire month field
	public void fillCreditCardExpMonth(String ccExpMonth) {
		ccExp.sendKeys(ccExpMonth);
	}
	
	// Sends keys to credit card expire month field
	public void fillCreditCardExpYear(String ccExpYear) {
		ccYear.sendKeys(ccExpYear);
	}
	
	// Sends keys to credit card number field
	public void fillCreditCardCVVnumber(String ccCVVnumber) {
		ccCVV.sendKeys(ccCVVnumber);
	}
	
	// Clicks booknow button
	public void clickBookNowButton() {
		bookNowButton.click();;
	}


}

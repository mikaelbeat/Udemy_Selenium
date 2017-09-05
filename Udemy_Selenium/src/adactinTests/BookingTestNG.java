package adactinTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adactinClasses.ClassesBookHotel;
import adactinClasses.ClassesBookingConfirmation;
import adactinClasses.ClassesLogin;
import adactinClasses.ClassesSearch;
import adactinClasses.ClassesSelectHotel;

public class BookingTestNG {
	
	private WebDriver driver;
	private String baseUrl;
	
	ClassesLogin loginPage;
	ClassesSearch searchPage;
	ClassesSelectHotel selectPage;
	ClassesBookHotel bookPage;
	
	
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "http://www.adactin.com/HotelAppBuild2/";
		loginPage = new ClassesLogin(driver);
		searchPage = new ClassesSearch(driver);
		selectPage = new ClassesSelectHotel(driver);
		bookPage = new ClassesBookHotel(driver);
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@Test
	public void Booking() throws Exception {
		driver.get(baseUrl);
		loginPage.fillUsername("ryynanenphm");
		loginPage.fillPassword("Tester74");
		loginPage.clickLoginButton();
		searchPage.selectLocation("London");
		searchPage.selectHotel("Hotel Cornice");
		searchPage.selectRoomType("Deluxe");
		searchPage.selectNumberOfRooms("1");
		searchPage.fillCheckInDate("30/09/2017");
		searchPage.fillCheckOutDate("30/10/2017");
		searchPage.selectAdultsPerRoom("2");
		searchPage.selectChildrenPerRoom("2");
		searchPage.clickSearchButton();
		selectPage.ClickOnRadiobutton();
		selectPage.ClickOnContinuebutton();
		bookPage.fillFirstName("Petri");
		bookPage.fillLastName("Ryynänen");
		bookPage.fillAddress("Pläsinpellonkuja 1 a 3 00740 Helsinki");
		bookPage.fillCreditCardNumber("1234567890987654");
		bookPage.fillCreditCardtype("AMEX");
		bookPage.fillCreditCardExpMonth("July");
		bookPage.fillCreditCardExpYear("2022");
		bookPage.fillCreditCardCVVnumber("1234");
		bookPage.clickBookNowButton();
		ClassesBookingConfirmation.ordeNRO(driver);
	}
  
  
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

package adactinClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassesSearch {
	
	private static final Logger log = LogManager.getLogger(ClassesSearch.class.getName());
	
	WebDriver driver;
	
	// Define location field
	@FindBy(id="location")
	WebElement location;

	// Define hotels field
	@FindBy(id="hotels")
	WebElement hotels;
	
	// Define room type field
	@FindBy(id="room_type")
	WebElement roomType;
	
	// Define number of rooms field
	@FindBy(id="room_nos")
	WebElement NumberOfRooms;
	
	// Define check in date field
	@FindBy(id="datepick_in")
	WebElement checkInDate;

	// Define check out date field
	@FindBy(id="datepick_out")
	WebElement checkOutDate;
	
	// Define adults per room field
	@FindBy(id="adult_room")
	WebElement adultsInRoom;
	
	// Define children per room field
	@FindBy(id="child_room")
	WebElement childrenInRoom;
	
	// Define search button
	@FindBy(id="Submit")
	WebElement searchButton;
	
	public ClassesSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Selects location
	public void selectLocation(String hLocation) {
		location.sendKeys(hLocation);
	}

	// Selects hotel
	public void selectHotel(String sHotel) {
		hotels.sendKeys(sHotel);
	}
	
	// Selects room type
	public void selectRoomType(String rType) {
		roomType.sendKeys(rType);
	}
	
	// Selects number of rooms
	public void selectNumberOfRooms(String nRooms) {
		NumberOfRooms.sendKeys(nRooms);
	}
	
	// Fills check in date
	public void fillCheckInDate(String checkIn) {
		checkInDate.clear();
		checkInDate.sendKeys(checkIn);
	}

	// Fills check out date
	public void fillCheckOutDate(String checkOut) {
		checkOutDate.clear();
		checkOutDate.sendKeys(checkOut);
	}
	
	// Select adults per  room
	public void selectAdultsPerRoom(String aRoom) {
		adultsInRoom.sendKeys(aRoom);
	}
	
	// Selects childs per  room
	public void selectChildrenPerRoom(String cRoom) {
		childrenInRoom.sendKeys(cRoom);
	}
	
	//Clicks search button
	public void clickSearchButton() {
		searchButton.click();
	}
	
	
	
	
	
	
	
	
	
	

}

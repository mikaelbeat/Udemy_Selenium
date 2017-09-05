import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Define_element {

	WebDriver driver;

	// Defining  page elements

	// Manage rolesDefine_element
	@FindBy(xpath = "locations")
	WebElement nameOfElememnt;
	
	
	public void fillUsername(String user) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ThisIsMyUserName");
		test.log(LogStatus.INFO, "Entered username");
	}
	
	
	public Define_element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
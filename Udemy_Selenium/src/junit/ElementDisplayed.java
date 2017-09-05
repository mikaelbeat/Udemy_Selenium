package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl1 = "https://letskodeit.teachable.com/p/practice";
		baseUrl2 = "http://expedia.com/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void A_LetsKodeIt() throws InterruptedException {
		driver.get(baseUrl1);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Textbox displayed: " + textBox.isDisplayed());
		
		Thread.sleep(2000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Textbox displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on show button");
		System.out.println("Textbox displayed: " + textBox.isDisplayed());
		
		
	}
	
	@Test
	public void B_Expedia() throws InterruptedException {
		driver.get(baseUrl2);
		
		WebElement childs = driver.findElement(By.id("package-1-children"));
		childs.click();
		Thread.sleep(2000);
		WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
		System.out.println("childDropDown displayed: " + childDropdown.isDisplayed());
		
		
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

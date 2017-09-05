package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}



	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement hondaRadioBtn = driver.findElement(By.id("hondaradio"));
		hondaRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		Thread.sleep(1000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		Thread.sleep(1000);
		
		WebElement hondaCheckBox = driver.findElement(By.id("hondacheck"));
		hondaCheckBox.click();
		Thread.sleep(1000);
		
		bmwCheckBox.click();
		Thread.sleep(1000);
		
		benzCheckBox.click();
		Thread.sleep(1000);
		
		hondaCheckBox.click();
		Thread.sleep(1000);
		
		System.out.println("BMW radio button is selected: " + bmwRadioBtn.isSelected());
		System.out.println("Benz radio button is selected: " + benzRadioBtn.isSelected());
		System.out.println("Honda radio button is selected: " + hondaRadioBtn.isSelected());
		System.out.println("BMW checkbox is clicked: " + bmwCheckBox.isSelected());
		System.out.println("Benz checkbox is clicked: " + benzCheckBox.isSelected());
		System.out.println("Honda checkboox is clicked: " + hondaCheckBox.isSelected());
		System.out.println("BMW checkbox is clicked: " + bmwCheckBox.isSelected());
		System.out.println("Benz checkbox is clicked: " + benzCheckBox.isSelected());
		System.out.println("Honda checkboox is clicked: " + hondaCheckBox.isSelected());
		


		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

}

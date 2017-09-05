package junit;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.fi";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.id("tab-flight-tab")).click();
		Thread.sleep(2000);
		
		WebElement flight_origin = driver.findElement(By.id("flight-origin"));
		WebElement flight_destination = driver.findElement(By.id("flight-destination"));
		WebElement departure_date = driver.findElement(By.id("flight-departing"));
		WebElement return_date = driver.findElement(By.id("flight-returning"));
		WebElement search = driver.findElement(By.id("search-button"));
		
		
		
		
		flight_origin.sendKeys("New York");
		Thread.sleep(2000);
		flight_origin.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		departure_date.sendKeys("09/03/2014");
		Thread.sleep(2000);
		return_date.clear();
		Thread.sleep(2000);
		return_date.sendKeys("09/10/2014");
		Thread.sleep(2000);
		flight_destination.sendKeys("New York");
		Thread.sleep(2000);
		flight_destination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.click();
	}
	
	public static String getRandomString(int lenght) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ1234567890";
		for (int i = 0; i < lenght; i++) {
			int index = (int) Math.random() * characters.length();
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	
	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(10) + ".png";
		String directory = "E:\\Testing\\Selenium";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
		
		
		
		
	}

}

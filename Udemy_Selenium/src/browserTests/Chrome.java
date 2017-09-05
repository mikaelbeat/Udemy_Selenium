package browserTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Chrome {
	private WebDriver driver;
	private String baseUrl1;
	private String baseUrl2;

	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Workspace\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl1 = "";
		baseUrl2 = "";


		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void checkEmployeeInformation() throws Exception {
		driver.get(baseUrl1);
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		Thread.sleep(1000);
		driver.get(baseUrl2);
		Thread.sleep(1000);
	}

	
	@AfterClass
	public void afterClass() throws InterruptedException {
		driver.quit();
	}
	
}

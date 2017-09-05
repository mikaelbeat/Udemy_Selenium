package browserTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InternetExplorer {
	private WebDriver driver;
	private String baseUrl1;
	private String baseUrl2;

	@BeforeClass
	public void beforeClass() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Public\\Workspace\\Webdrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
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

package genericMethodsDemo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementPresentDemo {
	private WebDriver driver;
	private String baseUrl;
	private GenericMethodsRefactored  gm;
	

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl ="http://letskodeit.teachable.com/p/practice";
		gm = new GenericMethodsRefactored(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	@Test
	public void test() {
		driver.get(baseUrl);
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("Element is present: " + result1);
		
		boolean result2 = gm.isElementPresent("This is false", "id");
		System.out.println("Element is present: " + result2);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

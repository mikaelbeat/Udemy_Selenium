package junit;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithElementsList {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void testListOfElements() throws InterruptedException  {
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		sel.selectByIndex(2);
		System.out.println("Selected Honda by index");
		Thread.sleep(2000);
		
		sel.selectByValue("benz");
		System.out.println("Selected Benz by value");
		Thread.sleep(2000);

		sel.selectByVisibleText("BMW");
		System.out.println("Selected BMW by visible text");
		Thread.sleep(2000);
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for (int i=0; i<size; i++){
			String optionName = options.get(i).getText();
			System.out.println(optionName);
			
		}
		System.out.println("Printed the list of all options");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

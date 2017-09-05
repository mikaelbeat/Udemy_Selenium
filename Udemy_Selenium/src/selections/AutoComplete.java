package selections;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.finnair.com/fi/fi/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String searchingText = "ISG, Japani";
		String partialText = "Ne";
		
		WebElement text = driver.findElement(By.id("booking-flight-flight-from"));
		text.sendKeys(partialText);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("ui-id-3"));
		List<WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();
		
		for (int i=0; i<size; i++) {
			System.out.println(results.get(i).getText());
		}
		
		Thread.sleep(3000);
		
		for (WebElement result : results) {
			if (result.getText().equals(searchingText)) {
				result.click();
			}
		}
	}
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

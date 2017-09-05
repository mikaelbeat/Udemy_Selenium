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

public class CalendarSelection2 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		// Click flights tab
		driver.findElement(By.id("tab-flight-tab")).click();
		// Find departing field
		WebElement departingField = driver.findElement(By.id("flight-departing"));
		// Click departing field
		departingField.click();
		
		
		
		Thread.sleep(3000);
		// FInd the date to be selected
		WebElement calMonth = driver.findElement(By.xpath("//table[@class='datepicker-cal-weeks' and caption='huhtikuu 2017']"));
		List<WebElement> allValidDates = calMonth.findElements(By.className("datepicker-day-number"));
		
		for (WebElement date : allValidDates) {
			if (date.getText().equals("30")) {
				date.click();
				break;
			}
		}
	
		
		
	}
		
		
		
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}

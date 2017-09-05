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

public class MultipleSelect {
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
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		sel.selectByValue("orange");
		System.out.println("Selected orange by value");
		
		Thread.sleep(2000);
		sel.deselectByValue("orange");
		System.out.println("De-selected orange by value");
		
		Thread.sleep(2000);
		sel.selectByIndex(2);
		System.out.println("Selected peach by index");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Apple");
		System.out.println("Selected Apple by visible text");
		
		Thread.sleep(2000);
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		System.out.println("Printed all selected options");
		
		Thread.sleep(2000);
		sel.deselectAll();
		System.out.println("De-selected all selected options");
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

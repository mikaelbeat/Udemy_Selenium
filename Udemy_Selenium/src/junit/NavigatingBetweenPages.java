package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("");
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating to login");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("");
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forvard");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		System.out.println("");
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		System.out.println("");
		driver.get(currentUrl);
		System.out.println("Navigate refresh");
		
		String pageSource = driver.getPageSource();
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println(pageSource);
		System.out.println("----------------------------");
		System.out.println("");
	}
	
	
	@After
	public void tearDown() throws Exception {
		//driver.quit;
	}

}

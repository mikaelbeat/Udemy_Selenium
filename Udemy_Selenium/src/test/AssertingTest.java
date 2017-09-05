package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertingTest {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://www.simplesite.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testI() throws Exception {
	driver.get(baseUrl);  
    String element = driver.findElement(By.xpath("//div[@id='logo']/a")).getText();
    System.out.println("Test " + element + " Jotain");
  }

  @After
  public void tearDown() throws Exception {
	  Thread.sleep(2000);
    driver.quit();
  }

  }

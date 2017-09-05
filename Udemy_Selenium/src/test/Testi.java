package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testi {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://www.letskodeit.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testI() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("i90scv3glabel")).click();
    driver.findElement(By.cssSelector("button.navbar-toggle")).click();
    driver.findElement(By.linkText("Practice")).click();
  }

  @After
  public void tearDown() throws Exception {
	  Thread.sleep(5000);
    //driver.quit();
  }

  }

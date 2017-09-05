package locateELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinkByTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "https://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("div")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("ul")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("div")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("ul")).click();
	}

}

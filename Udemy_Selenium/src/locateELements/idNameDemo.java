package locateELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class idNameDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		
		driver.findElement(By.name("btnK")).click();
	}

}

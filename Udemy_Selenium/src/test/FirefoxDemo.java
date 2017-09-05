package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		String baseURL ="http://google.com";
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\petri.ryynanen\\workspace\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseURL);
	}

}

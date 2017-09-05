package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) {
			String baseURL ="http://iltasanomat.fi";
			WebDriver driver;
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\petri.ryynanen\\workspace\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(baseURL);
		}
	}


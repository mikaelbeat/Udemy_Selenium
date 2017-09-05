package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotToReport {

	public static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName + ".jpg";
		String directory = "CC:\\Users\\petri.ryynanen\\Desktop\\SeleniumTraining\\Reports\\Screenshots\\";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;
	}
	
}
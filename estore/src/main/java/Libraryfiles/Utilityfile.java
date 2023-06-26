package Libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityfile {
	
	
	// reading data from the property file
	public static String ReadProperyfile(String key) throws IOException {
	
	FileInputStream file = new FileInputStream ("C:\\Users\\SSK\\eclipse-workspace\\estore\\property.properties");
	
	Properties prop = new Properties();
	prop.load(file);
	
	String value = prop.getProperty(key);
	return value;
	
	}
	
	// screenshot for failed test cases.
	public void Screenshot(WebDriver driver) throws IOException {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SSK\\eclipse-workspace\\estore\\FailedTCScreenshots");
		FileHandler.copy(scr, dest);
		System.out.println("Screenshot for failed Test case is taken");
	}
	
	
	
}

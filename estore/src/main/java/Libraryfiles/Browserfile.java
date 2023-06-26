package Libraryfiles;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Browserfile {
	
	public WebDriver driver;
	
	public ExtentReports extent;
	public ExtentTest test;
	public Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void OpenBrowser(String browser) throws IOException {
		
		log = Logger.getLogger("estore.com");
		DOMConfigurator.configure("log4j.xml");
		
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get(Utilityfile.ReadProperyfile("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get(Utilityfile.ReadProperyfile("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void extentreport() {
		
		Random ran = new Random();
		int num = ran.nextInt(100);
		
		String path = System.getProperty("user.dir")+"\\aventreports\\index"+num+".html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Estore");
		reporter.config().setDocumentTitle("Estore report");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("OS", "Window 10");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Testername", "suhas");
		
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		extent.flush();
	}
	
	

}

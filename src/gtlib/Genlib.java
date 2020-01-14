package gtlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import projlib.Globals;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.LoggerUtils;


public class Genlib 

{
	@SuppressWarnings("unchecked")
	public static String getDepVal(String depFile, String depSheet, String depKey, int depKeyCol) {
		String retVal = "";
		String strData = "";
		return retVal;
	}
	public static WebDriver webDriverSetUp()
	{
		WebDriver driver = null;
		
		switch (Globals.BROWSER)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Globals.CHROME_DRIVER_PATH);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			default:
			case "firefox":
				//System.setProperty("webdriver.gecko.driver", Globals.FIREFOX_DRIVER_PATH);
				//System.setProperty("webdriver.firefox.marionette", Globals.FIREFOX_DRIVER_PATH);
				driver = new FirefoxDriver();
				//ProfilesIni profile = new ProfilesIni();
				//FirefoxProfile autoProfile = profile.getProfile("FirefoxDriver");
				
				//DesiredCapabilities dc = DesiredCapabilities.firefox();
				//dc.setCapability(FirefoxDriver.PROFILE, autoProfile);
				//dc.setCapability("marionette", true);
				//driver = new FirefoxDriver(dc);
				//driver = new MarionetteDriver();
				break;

			case "ie":
				System.setProperty("webdriver.ie.driver", Globals.IE_DRIVER_PATH);
				DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
				dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				dc.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://galentictech.com");
				driver = new InternetExplorerDriver(dc);
				driver.manage().window().maximize();
				break;
				
			
				
		}

		LoggerUtils.logInfo("Driver Setup");

		return driver;
		
	}
	
	public static void webDriverTearDown(WebDriver driver)
	{
		if (driver != null)
		{
			//driver.close();
			driver.quit();
			LoggerUtils.logInfo("Driver tear down");
		}
	}

	public static Properties readConfig(String fileName)
	{
		File file = new File(fileName);
		FileInputStream fis = null;
		
		try 
		{
			
			fis = new FileInputStream(file);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		Properties prop = new Properties();

		try 
		{
			
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		
		return prop;
		
	}

	public static void sleep(int mSec)
	{
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void generate_screenshot(WebDriver driver,String method) 
	{
		// TODO Auto-generated method stub
		File screenshot_page= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// String currentDir = System.getProperty("D:\\GSS\\RELIGARE");
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(Calendar.getInstance().getTime());
		try 
		{
			String a = Globals.SCREENSHOT_DIR + method  + timeStamp + ".png";
			FileUtils.copyFile(screenshot_page, new File(a));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

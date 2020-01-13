package modules.calendar.tests;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import gtlib.Genlib;
import modules.calendar.pageobject.CalendarPage;
import modules.common.CommPageObject;
import modules.login.pageobject.LoginPage;
import modules.login.tests.LoginTest;
import projlib.Applib;
import projlib.Globals;
import utility.LoggerUtils;

public class CalendarTest {

	public static HashMap<String, String> EditCalendar(String strData, String depVal) throws Exception {
		/*
		 * Employee Creation
		 */
		HashMap<String, String> hMapRetObj = new HashMap<String, String>();
		hMapRetObj.put("testRunStatus", Globals.FAIL);

		WebDriver driver = null;
		driver = setUp(driver);

		String[] datArr = strData.split("\\|");
		String[] arrMetaData = datArr[3].split("\\,");

		try {
			testSetUp(driver, datArr);
			Genlib.sleep(2000);

			WebElement menuHRDept = CommPageObject.menuHRDept(driver);
			menuHRDept.click();
			LoggerUtils.logInfo("HR Department Menu clicked");
			Thread.sleep(1000);
			
			WebElement menuCalendar = CalendarPage.menuCalendars(driver);
			menuCalendar.click();
			LoggerUtils.logInfo("Calendar Menu Clicked");
			Thread.sleep(1000);
			
			WebElement manageCalendar = CalendarPage.menuManageCalendar(driver);
			manageCalendar.click();
			LoggerUtils.logInfo("Managed calendar menu clicked");
			Thread.sleep(2000);
			
			
			WebElement selectDate = CalendarPage.selectDate(driver,datArr[6]);
			selectDate.click();
			LoggerUtils.logInfo("Date Selectted from calendar");
			Thread.sleep(1500);
			
			// Alert Actions for browser alerts
			Alert alert = driver.switchTo().alert();
			Thread.sleep(1000);
			
			alert.sendKeys(datArr[7]);
			Thread.sleep(1000);
			
			alert.accept();
			Thread.sleep(1500);
			
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1500);
			
			WebElement btnUpdate = CalendarPage.btnUpdate(driver);
			btnUpdate.click();
			LoggerUtils.logInfo("Update Button Clicked");
			Thread.sleep(1000);
			
			WebElement btnAlertOk = CalendarPage.btnAlertOk(driver);
			btnAlertOk.click();
			LoggerUtils.logInfo(" AlertOk Button Clicked");
			
			Thread.sleep(2000);
			
			WebElement txtMSG = CalendarPage.txtAlertMsg(driver);
			String alertMSG = txtMSG.getText();
			Thread.sleep(1000);
			
			if (alertMSG.equals(Globals.CAL_UPDATED_SUCCESS)) {
				
				WebElement btnSubmit = CalendarPage.btnAlertSubmit(driver);
				btnSubmit.click();
				LoggerUtils.logInfo("Calendar Updated Successfully");
				Thread.sleep(1000);
				
				hMapRetObj.put("testRunStatus", Globals.PASS);
				hMapRetObj.put("depUpdateVal", "");
				
			} else {
				
				WebElement btnSubmit = CalendarPage.btnAlertSubmit(driver);
				btnSubmit.click();
				LoggerUtils.logInfo("Unable to Update Calendar");
				Thread.sleep(1000);
				

				hMapRetObj.put("testRunStatus", Globals.FAIL);
				hMapRetObj.put("depUpdateVal", "");
			}
			
		} catch (Exception e) {
			LoggerUtils.logError("Exception In Employee Creation : ", e);
			hMapRetObj.put("testRunStatus", Globals.EXCEPTION);
			hMapRetObj.put("depUpdateVal", "");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Globals.SCREENSHOT_DIR + datArr[0] + ".png"));
			LoggerUtils.logError("Failed in test case execution", e);

		} finally {
			Genlib.webDriverTearDown(driver);
		}
		return hMapRetObj;
	}

	public static void testSetUp(WebDriver driver, String[] datArr) throws Exception {
		LoginTest.navLogin(driver, datArr);
		WebElement btnSubmit = LoginPage.btnSubmitLogin(driver);
		btnSubmit.click();
		Applib.forceLogin(driver, datArr[5]);
		Genlib.sleep(1000);

		String arrMetaData[] = datArr[3].split("\\,");

	}

	public static WebDriver setUp(WebDriver driver) {
		driver = Genlib.webDriverSetUp();
		String url = projlib.Globals.LOGIN_URL;
		driver.get(url);
		return driver;
	}
}

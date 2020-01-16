package modules.payroll.tests;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gtlib.Genlib;
import modules.common.CommPageObject;
import modules.login.pageobject.LoginPage;
import modules.login.tests.LoginTest;
import modules.payroll.pageobject.PayrollPage;
import modules.payroll.pageobject.SalarySlipGeneratorPage;
import projlib.Applib;
import projlib.Globals;
import utility.LoggerUtils;

public class SalarySlipGeneratorTest {
	
	public static HashMap<String, String> ProcessSalary(String strData, String depVal) throws Exception {
		
		// View Leave Muster
		HashMap<String, String> hMapRetObj = new HashMap<String, String>();
		hMapRetObj.put("testRunStatus", Globals.FAIL);

		WebDriver driver = null;
		driver = setUp(driver);

		String[] datArr = strData.split("\\|");
		String[] arrMetaData = datArr[3].split("\\,");
		String[] arrDepVal = depVal.split("\\|");
		try {
			testSetUp(driver, datArr);
			Genlib.sleep(2000);

			WebElement menuPayrollDept = CommPageObject.menuPayrollDept(driver);
			menuPayrollDept.click();
			LoggerUtils.logInfo("Payroll Department Menu clicked");
			Thread.sleep(1000);
			
			WebElement menuSalarySlip = PayrollPage.menuSalarySlipGenerator(driver);
			menuSalarySlip.click();
			LoggerUtils.logInfo("Menu Salary Slip Generator Clicked");
			Thread.sleep(1000);
			
			
			// Sync all records
			 
			if (arrMetaData[0].equals("SyncRecords")) {
				
				WebElement btnSync = SalarySlipGeneratorPage.btnSync(driver);
				btnSync.click();
				LoggerUtils.logInfo("Button Sync Clicked");
				Thread.sleep(1000);
				
				WebElement btnOkConfirm = SalarySlipGeneratorPage.btnOkConfirm(driver);
				btnOkConfirm.click();
				LoggerUtils.logInfo("Ok button Clicked");
				Thread.sleep(1000);
				
				WebElement btnOkSuccess = SalarySlipGeneratorPage.btnOkSuccess(driver);
				btnOkSuccess.click();
				LoggerUtils.logInfo("Success Ok Button Clicked");
				Thread.sleep(1000);
				
			}
			
			WebElement txtSearch = SalarySlipGeneratorPage.txtSuccess(driver);
			txtSearch.sendKeys(datArr[6]);
			LoggerUtils.logInfo("Text Entered in search box");
			Thread.sleep(1000);
			
			
			
			
			
			

		} catch (Exception e) {
			LoggerUtils.logError("Exception In Employee Creation : ", e);
			hMapRetObj.put("testRunStatus", Globals.EXCEPTION);
			hMapRetObj.put("depUpdateVal", "");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Globals.SCREENSHOT_DIR + datArr[0] + ".png"));
			LoggerUtils.logError("Failed in test case execution", e);
//		test.fail("Program Exception")
//				.addScreenCaptureFromPath("file:///" + Globals.SCREENSHOT_DIR + datArr[0] + ".png");
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

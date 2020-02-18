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
import modules.payroll.pageobject.ViewMusterPage;
import projlib.Applib;
import projlib.Globals;
import utility.LoggerUtils;

public class LeaveMusterTest {

	public static HashMap<String, String> ViewMuster(String strData, String depVal) throws Exception {
		// View Leave Muster

		HashMap<String, String> hMapRetObj = new HashMap<String, String>();
		hMapRetObj.put("testRunStatus", Globals.FAIL);

		WebDriver driver = null;
		driver = setUp(driver);

		String[] datArr = strData.split("\\|");
		String[] arrMetaData = datArr[3].split("\\,");
		String[] arrDepVal = depVal.split("\\,");
		try {
			testSetUp(driver, datArr);
			Genlib.sleep(2000);

			WebElement menuPayrollDept = CommPageObject.menuPayrollDept(driver);
			menuPayrollDept.click();
			LoggerUtils.logInfo("Payroll Department Menu clicked");
			Thread.sleep(1000);
			
			WebElement menuLeaveMuster = PayrollPage.menuLeaveMuster(driver);
			menuLeaveMuster.click();
			LoggerUtils.logInfo("Leave Muster Menu Clicked");
			Thread.sleep(1000);
			
			WebElement listViewMuster = ViewMusterPage.listViewMuster(driver);
			listViewMuster.click();
			LoggerUtils.logInfo("View Leave Muster Clicked");
			Thread.sleep(1000);
			
			if (arrMetaData[0].equals("SyncLeaveMuster")) {
				
				WebElement btnSycn = ViewMusterPage.btnSync(driver);
				btnSycn.click();
				LoggerUtils.logInfo("Sync Button Clicked");
				Thread.sleep(1000);
				
				WebElement btnAlertOK = ViewMusterPage.btnOK(driver);
				btnAlertOK.click();
				Thread.sleep(1000);
				btnAlertOK.click();
				LoggerUtils.logInfo("Alert Ok Button Clicked");
				
			}
			Thread.sleep(1000);
			//Searching employe employee
			WebElement txtSearch = ViewMusterPage.txtSearch(driver);
			txtSearch.sendKeys(arrDepVal[1]);
			LoggerUtils.logInfo("Employee ID Entered");
			Thread.sleep(1000);
			
			WebElement selectSearchEmp = ViewMusterPage.selectSearchRecord(driver);
			selectSearchEmp.click();
			LoggerUtils.logInfo("Employee Selected");
			Thread.sleep(1000);
			
			
			
			if (arrMetaData[1].equals("AddLeaves")) {
				
				WebElement btnAdd = ViewMusterPage.btnAddLeaves(driver);
				btnAdd.click();
				LoggerUtils.logInfo("Add Leaves Clicked");
				Thread.sleep(1000);
				
				
				Applib.selMonth(arrDepVal, driver, ViewMusterPage.lblFromMonth(driver), ViewMusterPage.btnForwardFromMonth(driver), ViewMusterPage.btnBackwardFromMonth(driver));
				
			} 
			
			 if (arrMetaData[2].equals("ViewLeaves")) {
//				 
//				 WebElement btnViewLeaves = ViewMusterPage.btnViewLeaves(driver);
//				 btnViewLeaves.click();
//				 LoggerUtils.logInfo("View Button Clicked");
//				 Thread.sleep(1000);
				 
				 // Checking Leave Balance
				 WebElement lblLeaveBalance = ViewMusterPage.lblLeaveBalance(driver);
				 Thread.sleep(1000);
				 
				Float leaveBalance = Float.parseFloat(lblLeaveBalance.getText());
				Float datLeaveBal = Float.parseFloat(datArr[6]);
				
				if (Float.compare(leaveBalance,datLeaveBal) == 0) {
						
					 LoggerUtils.logInfo("Leave Balance is matched");
						hMapRetObj.put("testRunStatus", Globals.PASS);
						hMapRetObj.put("depUpdateVal","");	
					
				}
				else {
					 LoggerUtils.logInfo("Leave Balance not matched");
					 hMapRetObj.put("testRunStatus", Globals.FAIL);
						hMapRetObj.put("depUpdateVal","");
				}
 				 
			}
			
			
			

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

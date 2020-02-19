package modules.payroll.tests;

import java.io.File;
import java.util.HashMap;

import javax.swing.text.View;

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
				
				// Selecting From Date
				WebElement txtFromDate = ViewMusterPage.txtFromDate(driver);
				txtFromDate.click();
				LoggerUtils.logInfo("Entering From Date");
				Thread.sleep(1000);
				
				String [] arrFromDate = datArr[7].split("\\-");
				
				//Selecting Month from Date	
				Applib.selMonthForwardButton(arrFromDate, driver, ViewMusterPage.lblFromMonth(driver), ViewMusterPage.btnForwardFromMonth(driver));
				LoggerUtils.logInfo("From Month Selected");
				Thread.sleep(1000);
				
				// Selecting Year from Date
				Applib.selYear(arrFromDate, driver, ViewMusterPage.lblFromYear(driver), ViewMusterPage.btnForwardFromYear(driver), ViewMusterPage.btnForwardFromYear(driver));
				LoggerUtils.logInfo("From Year Selected");
				Thread.sleep(1000);
				
				WebElement selDay = ViewMusterPage.selDay(driver,arrFromDate[0]);
				selDay.click();
				LoggerUtils.logInfo("From Day Selected");
				Thread.sleep(2000);
				
				WebElement btnFromOk = ViewMusterPage.btnDateOk(driver);
				btnFromOk.click();
				LoggerUtils.logInfo("From Date Selected");
				Thread.sleep(1000);
				
				// Selecting To Date
				WebElement txtToDate = ViewMusterPage.txtToDate(driver);
				txtToDate.click();
				LoggerUtils.logInfo("Entering To Date");
				Thread.sleep(1000);
				
				String [] arrToDate = datArr[8].split("\\-");
				
				// Selecting Month From date
				Applib.selMonthForwardButton(arrToDate, driver, ViewMusterPage.lblToMonth(driver), ViewMusterPage.btnForwarToMonth(driver));
				LoggerUtils.logInfo("To Month Selected");
				Thread.sleep(1000);
				
				// Selecting Year from Date
				Applib.selYear(arrToDate, driver, ViewMusterPage.lblToYear(driver), ViewMusterPage.btnForwardToYear(driver), ViewMusterPage.btnForwardToYear(driver));
				LoggerUtils.logInfo("To Year Selected");
				Thread.sleep(1000);
				
				WebElement selToDay = ViewMusterPage.selDay(driver, arrToDate[0]);
				selToDay.click();
				LoggerUtils.logInfo("To Day Selected");
				Thread.sleep(1000);
				
				WebElement btnToOk = ViewMusterPage.btnToDateOk(driver);
				btnToOk.click();
				LoggerUtils.logInfo("To  Date Selected");
				Thread.sleep(1000);
				
				WebElement txtRemarks = ViewMusterPage.txtRemarks(driver);
				txtRemarks.sendKeys(datArr[9]);
				LoggerUtils.logInfo("Remarks Entered");
				Thread.sleep(1000);
				
				WebElement btnSubmit = ViewMusterPage.btnSubmitAddLeaves(driver);
				btnSubmit.click();
				LoggerUtils.logInfo("Submit Button Clicked");
				Thread.sleep(1000);
				
				WebElement alertBtnOk = ViewMusterPage.btnOK(driver);
				alertBtnOk.click();
				LoggerUtils.logInfo("Alert Ok Button Clicked");
				Thread.sleep(2000);
				
				WebElement alertMsg = ViewMusterPage.alertMsg(driver);
				Thread.sleep(1000);
				
				if (Globals.LEAVE_SUBMITED_SUCCESS.equals(alertMsg.getText())) {			
					
					LoggerUtils.logInfo(Globals.LEAVE_SUBMITED_SUCCESS);
					Thread.sleep(1000);
					WebElement btnAlertOk = ViewMusterPage.btnOK(driver);
					btnAlertOk.click();
					LoggerUtils.logInfo("Alert Ok ButtonClicked");
					Thread.sleep(1000);
					hMapRetObj.put("testRunStatus", Globals.PASS);
					hMapRetObj.put("depUpdateVal","");	
					
				} else {
					
					LoggerUtils.logInfo("Unable to Submit Leave Application");
					LoggerUtils.logInfo(alertMsg.getText());
					Thread.sleep(1000);
					WebElement btnAlertOk = ViewMusterPage.btnOK(driver);
					btnAlertOk.click();
					LoggerUtils.logInfo("Alert Ok ButtonClicked");
					Thread.sleep(1000);
					hMapRetObj.put("testRunStatus", Globals.FAIL);
					hMapRetObj.put("depUpdateVal","");	
				}
				
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

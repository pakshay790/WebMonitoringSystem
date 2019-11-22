package modules.employeecreation.tests;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hdgf.chunks.Chunk.Command;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import gtlib.Genlib;
import modules.common.CommPageObject;
import modules.employeecreation.pageobject.EmployeeCreationPage;
import modules.login.pageobject.LoginPage;
import modules.login.tests.LoginTest;
import projlib.Applib;
import projlib.Globals;
import utility.LoggerUtils;

public class EmployeeCreationTest {

	public static HashMap<String, String> NewEmp(String strData,  String depVal) throws Exception {
		/*
		 * Farmer Registration with voter id
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
//			test.pass("HR Department Menu clicked");
			Thread.sleep(1000);
			
			WebElement menuEmp = EmployeeCreationPage.menuEmp(driver);
			menuEmp.click();
			LoggerUtils.logInfo("Employee Menu clicked");
			
			WebElement menuAddEmp = EmployeeCreationPage.menuAddEmp(driver);
			menuAddEmp.click();
			LoggerUtils.logInfo("Add Employee Menu clicked");
			Thread.sleep(1000);
			
			// Employee Personal Details Script
			WebElement firstName = EmployeeCreationPage.firstName(driver);
			firstName.sendKeys(datArr[6]);
			LoggerUtils.logInfo("First Name Entered");
			Thread.sleep(1000);
			
			WebElement middleName = EmployeeCreationPage.middleName(driver);
			middleName.sendKeys(datArr[7]);
			LoggerUtils.logInfo("Middle Name Entered");
			Thread.sleep(1000);
			
			WebElement lastName = EmployeeCreationPage.lastName(driver);
			lastName.sendKeys(datArr[8]);
			LoggerUtils.logInfo("Last Name Entered");
			Thread.sleep(1000);
			
			WebElement emailId = EmployeeCreationPage.personalEmail(driver);
			emailId.sendKeys(datArr[9]);
			LoggerUtils.logInfo("Email-id Entered");
			Thread.sleep(1000);
			
			WebElement aadharNo = EmployeeCreationPage.aadhaarNo(driver);
			aadharNo.sendKeys(datArr[10]);
			LoggerUtils.logInfo("Aadhaar No entered");
			Thread.sleep(1000);
			
			WebElement panNo = EmployeeCreationPage.panNo(driver);
			panNo.sendKeys(datArr[11]);
			LoggerUtils.logInfo("Pan No entered");
			Thread.sleep(2000);
			
//			WebElement dob = EmployeeCreationPage.selDOB(driver);
//			dob.sendKeys(datArr[12]);
//			
//			String arrDate[] = datArr[12].split("\\/");
//			WebElement dobVal = EmployeeCreationPage.selDOBVal(driver);
//			dobVal.click();
//			Thread.sleep(1000);
			
			WebElement parmAddress = EmployeeCreationPage.parmAddress(driver);
			parmAddress.sendKeys(datArr[13]);
			LoggerUtils.logInfo("Permanant Address Entered");
			Thread.sleep(1000);
			
			WebElement bloodGroup = EmployeeCreationPage.selBloogGrp(driver);
			bloodGroup.click();
			WebElement bloodGroupVal = EmployeeCreationPage.bloodGroupVal(driver,datArr[14]);
			bloodGroupVal.click();
			LoggerUtils.logInfo("Blood Group Selected");
			Thread.sleep(1000);
			
			if (datArr[15].equals("YES")){
				

				WebElement btnCopyAddress = EmployeeCreationPage.btnCopyAddress(driver);
				btnCopyAddress.click();
				LoggerUtils.logInfo("Copy above address button clicked");
				LoggerUtils.logInfo("Communication Address  Entered");
				Thread.sleep(1000);
				
			} else {

				WebElement commAddress = EmployeeCreationPage.commAddress(driver);
				commAddress.sendKeys(datArr[16]);
				LoggerUtils.logInfo("Communication Address  Entered");
				Thread.sleep(1000);
			}
			

			WebElement contactNo = EmployeeCreationPage.contactNo(driver);
			contactNo.sendKeys(datArr[17]);
			LoggerUtils.logInfo("Contact Number  Entered");
			Thread.sleep(1000);
			
			WebElement emerContact = EmployeeCreationPage.emgContactNo(driver);
			emerContact.sendKeys(datArr[18]);
			LoggerUtils.logInfo("Emergency Contact Number Entered");
			Thread.sleep(1000);
			
			WebElement identityMark = EmployeeCreationPage.identityMark(driver);
			identityMark.sendKeys(datArr[19]);
			LoggerUtils.logInfo("Identity Mark  Entered");
			Thread.sleep(1000);
			
			WebElement emgConRel = EmployeeCreationPage.selEmgContactRel(driver);
			emgConRel.click();
			WebElement emgConRelVal = EmployeeCreationPage.emgContactRelVal(driver, datArr[20]);
			emgConRelVal.click();
			LoggerUtils.logInfo("Emergency Contact Relation Selected");
			Thread.sleep(1000);
			
			WebElement btnNext = EmployeeCreationPage.btnPerDetNext(driver);
			btnNext.click();
			LoggerUtils.logInfo("Personal Details Filed, Next Button Clicked");
			Thread.sleep(3000);
			
			// Employee Education Details Script
			
			WebElement txtQualification = EmployeeCreationPage.txtQualification(driver);
			txtQualification.sendKeys(datArr[22]);
			LoggerUtils.logInfo("Qualification Details Entered");
			Thread.sleep(1000);
			
			WebElement passingYear = EmployeeCreationPage.passingYear(driver);
			passingYear.sendKeys(datArr[23]);
			LoggerUtils.logInfo("Passing Year Entered");
			Thread.sleep(1000);
			
			WebElement universityName = EmployeeCreationPage.univercityName(driver);
			universityName.sendKeys(datArr[24]);
			LoggerUtils.logInfo("University Name Entered");
			Thread.sleep(1000);
			
			WebElement percentage = EmployeeCreationPage.percentage(driver);
			percentage.sendKeys(datArr[25]);
			LoggerUtils.logInfo("Percentage Entered");
			Thread.sleep(1000);
			
			WebElement btnPerDetailsNext = EmployeeCreationPage.btnPerDetNext(driver);
			btnPerDetailsNext.click();
			LoggerUtils.logInfo("Personal Details Enterd, Next Button Clicked");
			Thread.sleep(3000);
			
			// Employee's Employment Details Scripts
			
			
			

			Thread.sleep(4000);
			LoggerUtils.logInfo("Employee Created Successfully, Tac ID : ");
			hMapRetObj.put("testRunStatus", Globals.PASS);
			hMapRetObj.put("depUpdateVal", ""); // updating depval with tacid,id proof val, mobile

		} catch (Exception e) {
			LoggerUtils.logError("Exception In Employee Creation : ", e);
			hMapRetObj.put("testRunStatus", Globals.EXCEPTION);
			hMapRetObj.put("depUpdateVal", "");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Globals.SCREENSHOT_DIR + datArr[0] + ".png"));
			LoggerUtils.logError("Failed in test case execution", e);
//			test.fail("Program Exception")
//					.addScreenCaptureFromPath("file:///" + Globals.SCREENSHOT_DIR + datArr[0] + ".png");
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

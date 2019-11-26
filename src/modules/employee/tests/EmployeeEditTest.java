package modules.employee.tests;

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
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import gtlib.Genlib;
import modules.common.CommPageObject;
import modules.employee.pageobject.EmployeeCreationPage;
import modules.employee.pageobject.EmployeeEditPage;
import modules.login.pageobject.LoginPage;
import modules.login.tests.LoginTest;
import projlib.Applib;
import projlib.Globals;
import utility.LoggerUtils;

public class EmployeeEditTest {

	public static HashMap<String, String> EditEmp(String strData,  String depVal) throws Exception {
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
			
			WebElement menuEmp = CommPageObject.menuEmp(driver);
			menuEmp.click();
			LoggerUtils.logInfo("Employee Menu clicked");
			Thread.sleep(1000);
			
			WebElement menuViewEmp = EmployeeEditPage.menuViewEmp(driver);
			menuViewEmp.click();
			LoggerUtils.logInfo("ViewEmployee Menu clicked");
			Thread.sleep(1000);
			
			WebElement searchEmp = EmployeeEditPage.searchEmp(driver);
			searchEmp.sendKeys("803418901109");
			LoggerUtils.logInfo("Employee Searching...");
			Thread.sleep(2000);
			
			WebElement resultRecord = EmployeeEditPage.resultRecord(driver);
			resultRecord.click();
			LoggerUtils.logInfo("Employee Found");
			Thread.sleep(1000);
			
//			WebElement btnViewEmp = EmployeeEditPage.btnViewEmp(driver);
//			btnViewEmp.click();
//			LoggerUtils.logInfo("Button View Employee Clicked");
//			Thread.sleep(10000);
			
			WebElement btnEditEmp = EmployeeEditPage.btnEditEmp(driver);
			btnEditEmp.click();
			LoggerUtils.logInfo("Edit  Employee Button Clicked");
			Thread.sleep(2000);
			
			if (datArr[3].equals("personalDetails")) {
				
				WebElement parmAddress = EmployeeEditPage.parmAddress(driver);
				parmAddress.clear();
				Thread.sleep(1000);
				parmAddress.sendKeys(datArr[13]);
				LoggerUtils.logInfo("Permanant Address Entered");
				Thread.sleep(1000);
				
				if (datArr[15].equals("YES")){
					WebElement btnCopyAddress = EmployeeEditPage.btnCopyAddress(driver);
					btnCopyAddress.click();
					LoggerUtils.logInfo("Copy above address button clicked");
					LoggerUtils.logInfo("Communication Address  Entered");
					Thread.sleep(1000);
					
				} else {

					WebElement commAddress = EmployeeEditPage.commAddress(driver);
					commAddress.clear();
					Thread.sleep(1000);
					commAddress.sendKeys(datArr[16]);
					LoggerUtils.logInfo("Communication Address  Entered");
					Thread.sleep(1000);
				}
				
				WebElement contactNo = EmployeeEditPage.contactNo(driver);
				contactNo.clear();
				Thread.sleep(1000);
				contactNo.sendKeys(datArr[17]);
				LoggerUtils.logInfo("Contact Number  Entered");
				Thread.sleep(1000);
				
				WebElement emerContact = EmployeeEditPage.emgContactNo(driver);
				emerContact.clear();
				Thread.sleep(1000);
				emerContact.sendKeys(datArr[18]);
				LoggerUtils.logInfo("Emergency Contact Number Entered");
				Thread.sleep(1000);
				
				WebElement emgConRel = EmployeeEditPage.selEmgContactRel(driver);
				Thread.sleep(1000);
				emgConRel.click();
				WebElement emgConRelVal = EmployeeEditPage.emgContactRelVal(driver, datArr[20]);
				emgConRelVal.click();
				LoggerUtils.logInfo("Emergency Contact Relation Selected");
				Thread.sleep(10000);
				
				
			} else if (datArr[3].equals("personalDetails")) {
				
				
			} else if (datArr[3].equals("personalDetails")) {
				
				
			} 
			
			
			
			
//			// Employee Personal Details Script
//			WebElement firstName = EmployeeCreationPage.firstName(driver);
//			firstName.sendKeys(datArr[6]);
//			LoggerUtils.logInfo("First Name Entered");
//			Thread.sleep(1000);
//			
//			WebElement middleName = EmployeeCreationPage.middleName(driver);
//			middleName.sendKeys(datArr[7]);
//			LoggerUtils.logInfo("Middle Name Entered");
//			Thread.sleep(1000);
//			
//			WebElement lastName = EmployeeCreationPage.lastName(driver);
//			lastName.sendKeys(datArr[8]);
//			LoggerUtils.logInfo("Last Name Entered");
//			Thread.sleep(1000);
//			
//			WebElement emailId = EmployeeCreationPage.personalEmail(driver);
//			emailId.sendKeys(datArr[9]);
//			LoggerUtils.logInfo("Email-id Entered");
//			Thread.sleep(1000);
//			
//			WebElement aadharNo = EmployeeCreationPage.aadhaarNo(driver);
//			aadharNo.sendKeys(datArr[10]);
//			LoggerUtils.logInfo("Aadhaar No entered");
//			Thread.sleep(1000);
//			
//			WebElement panNo = EmployeeCreationPage.panNo(driver);
//			panNo.sendKeys(datArr[11]);
//			LoggerUtils.logInfo("Pan No entered");
//			Thread.sleep(2000);
//			
////			WebElement dob = EmployeeCreationPage.selDOB(driver);
////			dob.sendKeys(datArr[12]);
////			
////			String arrDate[] = datArr[12].split("\\/");
////			WebElement dobVal = EmployeeCreationPage.selDOBVal(driver);
////			dobVal.click();
////			Thread.sleep(1000);
//			
//			WebElement parmAddress = EmployeeCreationPage.parmAddress(driver);
//			parmAddress.sendKeys(datArr[13]);
//			LoggerUtils.logInfo("Permanant Address Entered");
//			Thread.sleep(1000);
//			
//			WebElement bloodGroup = EmployeeCreationPage.selBloogGrp(driver);
//			bloodGroup.click();
//			WebElement bloodGroupVal = EmployeeCreationPage.bloodGroupVal(driver,datArr[14]);
//			bloodGroupVal.click();
//			LoggerUtils.logInfo("Blood Group Selected");
//			Thread.sleep(1000);
//			
//			if (datArr[15].equals("YES")){
//				
//
//				WebElement btnCopyAddress = EmployeeCreationPage.btnCopyAddress(driver);
//				btnCopyAddress.click();
//				LoggerUtils.logInfo("Copy above address button clicked");
//				LoggerUtils.logInfo("Communication Address  Entered");
//				Thread.sleep(1000);
//				
//			} else {
//
//				WebElement commAddress = EmployeeCreationPage.commAddress(driver);
//				commAddress.sendKeys(datArr[16]);
//				LoggerUtils.logInfo("Communication Address  Entered");
//				Thread.sleep(1000);
//			}
//			
//
//			WebElement contactNo = EmployeeCreationPage.contactNo(driver);
//			contactNo.sendKeys(datArr[17]);
//			LoggerUtils.logInfo("Contact Number  Entered");
//			Thread.sleep(1000);
//			
//			WebElement emerContact = EmployeeCreationPage.emgContactNo(driver);
//			emerContact.sendKeys(datArr[18]);
//			LoggerUtils.logInfo("Emergency Contact Number Entered");
//			Thread.sleep(1000);
//			
//			WebElement identityMark = EmployeeCreationPage.identityMark(driver);
//			identityMark.sendKeys(datArr[19]);
//			LoggerUtils.logInfo("Identity Mark  Entered");
//			Thread.sleep(1000);
//			
//			WebElement emgConRel = EmployeeCreationPage.selEmgContactRel(driver);
//			emgConRel.click();
//			WebElement emgConRelVal = EmployeeCreationPage.emgContactRelVal(driver, datArr[20]);
//			emgConRelVal.click();
//			LoggerUtils.logInfo("Emergency Contact Relation Selected");
//			Thread.sleep(1000);
//			
//			WebElement btnNext = EmployeeCreationPage.btnPerDetNext(driver);
//			btnNext.click();
//			LoggerUtils.logInfo("Personal Details Filed, Next Button Clicked");
//			Thread.sleep(3000);
//			
//			// Employee Education Details Script
//			
//			WebElement txtQualification = EmployeeCreationPage.txtQualification(driver);
//			txtQualification.sendKeys(datArr[22]);
//			LoggerUtils.logInfo("Qualification Details Entered");
//			Thread.sleep(1000);
//			
//			WebElement passingYear = EmployeeCreationPage.passingYear(driver);
//			passingYear.sendKeys(datArr[23]);
//			LoggerUtils.logInfo("Passing Year Entered");
//			Thread.sleep(1000);
//			
//			WebElement universityName = EmployeeCreationPage.univercityName(driver);
//			universityName.sendKeys(datArr[24]);
//			LoggerUtils.logInfo("University Name Entered");
//			Thread.sleep(1000);
//			
//			WebElement percentage = EmployeeCreationPage.percentage(driver);
//			percentage.sendKeys(datArr[25]);
//			LoggerUtils.logInfo("Percentage Entered");
//			Thread.sleep(1000);
//			
//			WebElement btnPerDetailsNext = EmployeeCreationPage.btnPerDetNext(driver);
//			btnPerDetailsNext.click();
//			LoggerUtils.logInfo("Personal Details Enterd, Next Button Clicked");
//			Thread.sleep(3000);
//			
//			// Employee's Employment Details Scripts
//			
//			WebElement txtTotalExp = EmployeeCreationPage.totalExperience(driver);
//			txtTotalExp.sendKeys(datArr[26]);
//			LoggerUtils.logInfo("Total Experience  Entered");
//			Thread.sleep(1000);
//			
//			WebElement txtGTEmail  = EmployeeCreationPage.txtGTEmailID(driver);
//			txtGTEmail.sendKeys(datArr[28]);
//			LoggerUtils.logInfo("Galentic Email-ID  Entered");
//			Thread.sleep(1000);
//			
//			WebElement doj = EmployeeCreationPage.txtDOJ(driver);
//			doj.click();
//			Thread.sleep(1000);
//			WebElement btnOkDOJ = EmployeeCreationPage.btnOkDOJ(driver);
//			btnOkDOJ.click();
//			Thread.sleep(1000);
//			
//			WebElement empType = EmployeeCreationPage.selEmpType(driver);
//			empType.click();
//			WebElement empTypeVal = EmployeeCreationPage.selEmpTypeVal(driver, datArr[29]);
//			empTypeVal.click();
//			LoggerUtils.logInfo("Employee Type  Selected");
//			Thread.sleep(1000);
//			
//			WebElement designation = EmployeeCreationPage.designation(driver);
//			designation.click();
//			Thread.sleep(2000);
//			WebElement designationVal = EmployeeCreationPage.designationVal(driver,datArr[30]);
//			LoggerUtils.logInfo("Employee Designation  Selected");
//			designationVal.click();
//			Thread.sleep(2000);
//			
//			WebElement assign = EmployeeCreationPage.assignProject(driver);
//			assign.click();
//			WebElement assignVal = EmployeeCreationPage.assignProjectVal(driver, datArr[31]);
//			assignVal.click();
//			LoggerUtils.logInfo("Employee Assign Project  Selected");
//			Thread.sleep(1000);
//			
//			WebElement remarks  = EmployeeCreationPage.remarks(driver);
//			remarks.sendKeys(datArr[32]);
//			LoggerUtils.logInfo("Remarks  Entered");
//			Thread.sleep(1000);
//			
//			WebElement bankName  = EmployeeCreationPage.bankName(driver);
//			bankName.sendKeys(datArr[33]);
//			LoggerUtils.logInfo("Bank Name  Entered");
//			Thread.sleep(1000);
//			
//			WebElement location = EmployeeCreationPage.location(driver);
//			location.click();
//			WebElement locationVal = EmployeeCreationPage.locationVal(driver,datArr[34]);
//			LoggerUtils.logInfo("Employee Location  Selected");
//			locationVal.click();
//			Thread.sleep(1000);
//			
//			WebElement bankAccNo  = EmployeeCreationPage.bankAccNo(driver);
//			bankAccNo.sendKeys(datArr[35]);
//			LoggerUtils.logInfo("Bank Account Number  Entered");
//			Thread.sleep(1000);
//			
//			WebElement uanNo  = EmployeeCreationPage.UANNo(driver);
//			uanNo.sendKeys(datArr[36]);
//			LoggerUtils.logInfo("UAN Number  Entered");
//			Thread.sleep(1000);
//			
//			WebElement PFNo  = EmployeeCreationPage.PFNo(driver);
//			PFNo.sendKeys(datArr[37]);
//			LoggerUtils.logInfo("PF Number  Entered");
//			Thread.sleep(1000);
//			
//			WebElement btnNextEmpmntDet = EmployeeCreationPage.btnNextEmpmntDet(driver);
//			btnNextEmpmntDet.click();
//			LoggerUtils.logInfo("Employement Details Feild, Next Button Clicked");
//			Thread.sleep(2000);
//
//			// Employee's Salary Details Script
//			
//			if (datArr[29].equals("TRAINEE")) {
//				
//				WebElement txtStipend = EmployeeCreationPage.txtStipend(driver);
//				txtStipend.sendKeys(datArr[38]);
//				LoggerUtils.logInfo("Employee's Stipend Entered");
//				Thread.sleep(2000);
//				
//				WebElement btnNextSalDet = EmployeeCreationPage.btnNextSalaryDet(driver);
//				btnNextSalDet.click();
//				LoggerUtils.logInfo("Employee's Salary Details Entered, Next Button Clikced");
//				Thread.sleep(1000);
//				
//			} else if (datArr[29].equals("CONTRACTUAL")) {
//				
//				WebElement txtConsulatationFee = EmployeeCreationPage.txtConsulatationFee(driver);
//				txtConsulatationFee.sendKeys(datArr[39]);
//				LoggerUtils.logInfo("Employee's Salary Details Entered, Next Button Clicked");
//				Thread.sleep(2000);
//				
//				WebElement btnNextSalDet = EmployeeCreationPage.btnNextSalaryDet(driver);
//				btnNextSalDet.click();
//				LoggerUtils.logInfo("Employee's Salary Details Entered, Next Button Clikced");
//				Thread.sleep(1000);	
//				
//			}
//			else {
//				
//				WebElement txtCTC = EmployeeCreationPage.txtCTC(driver);
//				txtCTC.sendKeys(datArr[40]);
//				LoggerUtils.logInfo("Employee's CTC Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtBasic = EmployeeCreationPage.txtBasicSalary(driver);
//				txtBasic.sendKeys(datArr[41]);
//				LoggerUtils.logInfo("Employee's Baisc Salary Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtHRA = EmployeeCreationPage.txtHRA(driver);
//				txtHRA.sendKeys(datArr[42]);
//				LoggerUtils.logInfo("Employee's HRA Amount Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtConveyence = EmployeeCreationPage.txtConvyenceAllowance(driver);
//				txtConveyence.sendKeys(datArr[43]);
//				LoggerUtils.logInfo("Employee's Convyence Allowance Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtMedical = EmployeeCreationPage.txtMedicalAllowance(driver);
//				txtMedical.sendKeys(datArr[44]);
//				LoggerUtils.logInfo("Employee's Medical Allowance Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtMobile = EmployeeCreationPage.txtMobileAllowance(driver);
//				txtMobile.sendKeys(datArr[45]);
//				LoggerUtils.logInfo("Employee's Mobile Allowance Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtExecutive = EmployeeCreationPage.txtExecutiveAllowance(driver);
//				txtExecutive.sendKeys(datArr[46]);
//				LoggerUtils.logInfo("Employee's Executive Allowance Entered");
//				Thread.sleep(1000);
//
//				WebElement txtEmployeeInsurance = EmployeeCreationPage.txtEmployeeInsurance(driver);
//				txtEmployeeInsurance.sendKeys(datArr[47]);
//				LoggerUtils.logInfo("Employee's Insurance Benefit Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtVariable = EmployeeCreationPage.txtVariablePay(driver);
//				txtVariable.sendKeys(datArr[48]);
//				LoggerUtils.logInfo("Employee's Variable Pay Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtEPF = EmployeeCreationPage.txtEPF(driver);
//				txtEPF.sendKeys(datArr[49]);
//				LoggerUtils.logInfo("Employee's EPF Amount Entered");
//				Thread.sleep(1000);
//				
//				WebElement txtJoining = EmployeeCreationPage.txtJoiningBonus(driver);
//				txtJoining.sendKeys(datArr[50]);
//				LoggerUtils.logInfo("Employee's Joining Bonus Enterd");
//				Thread.sleep(1000);
//				
//				WebElement btnNextSalaryDet = EmployeeCreationPage.btnNextSalaryDet(driver);
//				btnNextSalaryDet.click();
//				LoggerUtils.logInfo("Employee's Salary Details Entered");
//				Thread.sleep(2000);
//			}	
//			
//			WebElement btnFinish = EmployeeCreationPage.btnFinish(driver);
//			btnFinish.click();
//			LoggerUtils.logInfo("Finish Button Clicked");
//			Thread.sleep(1000);
//			
//			WebElement btnProceedOK = EmployeeCreationPage.btnProceedOK(driver);
//			btnProceedOK.click();
//			LoggerUtils.logInfo("Proceed Ok button Clicked");
//			Thread.sleep(2000);
//			
//			WebElement successMSG = EmployeeCreationPage.dialogMSG(driver);
//			Thread.sleep(1000);
//			String successMessage = successMSG.getText();
//			
//			if (successMessage.equals(Globals.EMP_CREATED_SUCCESS)) 	
//			{
//				LoggerUtils.logInfo("Employee Created Successfully");
//				WebElement btnOk = EmployeeCreationPage.btnDailogOK(driver);
//				btnOk.click();
//				LoggerUtils.logInfo("Ok Button Clicked");
//				hMapRetObj.put("testRunStatus", Globals.PASS);
//				hMapRetObj.put("depUpdateVal", "");
//			}
//			else {
//				LoggerUtils.logInfo("Unable to create employee");
//				WebElement btnOk = EmployeeCreationPage.btnDailogOK(driver);
//				btnOk.click();
//				LoggerUtils.logInfo("Ok Button Clicked");
//				hMapRetObj.put("testRunStatus", Globals.FAIL);
//				hMapRetObj.put("depUpdateVal", "");
//			}

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

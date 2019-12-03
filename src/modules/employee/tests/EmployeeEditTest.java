package modules.employee.tests;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hdgf.chunks.Chunk.Command;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

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
		String[] arrDepVal = depVal.split("\\,"); 

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
			searchEmp.sendKeys(arrDepVal[0]);
			LoggerUtils.logInfo("Employee Searching...");
			Thread.sleep(2000);
			
			WebElement resultRecord = EmployeeEditPage.resultRecord(driver);
			resultRecord.click();
			LoggerUtils.logInfo("Employee Found");
			Thread.sleep(1000);
			
			WebElement btnEditEmp = EmployeeEditPage.btnEditEmp(driver);
			btnEditEmp.click();
			LoggerUtils.logInfo("Edit  Employee Button Clicked");
			Thread.sleep(2000);
			
			// To edit employee's Personal Details
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
				Thread.sleep(1000);
				
				//To edit employee's education details
			} else if (datArr[3].equals("educationDetails")) {
				
				WebElement menuEducationDet = EmployeeEditPage.menuEducationDet(driver);
				menuEducationDet.click();
				LoggerUtils.logInfo("Education Details Menu Clicked");
				Thread.sleep(1000);
				
				String arrQualification [] = datArr[23].split("\\,");
				String arryear [] = datArr[24].split("\\,");
				String arrUniversity [] = datArr[25].split("\\,");
				String arrPercentage [] = datArr[26].split("\\,");
				
				int count = Integer.parseInt(datArr[22]);
				
				for(int i = 1 ; i <= count ; i++) {
					String num = String.valueOf(i+1);
					WebElement btnAddEduDet = EmployeeEditPage.btnAddMoreDetails(driver);
					btnAddEduDet.click();
					LoggerUtils.logInfo("Adding more education details");
					Thread.sleep(1000);
					
					WebElement txtQualification = EmployeeEditPage.txtQualificationNum(driver, num);					
					txtQualification.sendKeys(arrQualification[i]);
					LoggerUtils.logInfo("Adding Qualifications Details..");
					Thread.sleep(1000);
					
					WebElement txtYearPassing = EmployeeEditPage.passingYearNum(driver, num);
					txtYearPassing.sendKeys(arryear[i]);
					LoggerUtils.logInfo("Adding Year of Passing Details..");
					Thread.sleep(1000);
					
					WebElement txtUniversity = EmployeeEditPage.univercityNameNum(driver,num);
					txtUniversity.sendKeys(arrUniversity[i]);
					LoggerUtils.logInfo("Adding University Details..");
					Thread.sleep(1000);
					
					WebElement txtPercentage = EmployeeEditPage.percentageNum(driver, num);
					txtPercentage.sendKeys(arrPercentage[i]);
					LoggerUtils.logInfo("Adding Percentage Details..");
					Thread.sleep(1000);
				}
				
			} else if (datArr[3].equals("employmentDetails")) {
				
				WebElement menuEmploymentDet = EmployeeEditPage.menuEmploymentDet(driver);
				menuEmploymentDet.click();
				LoggerUtils.logInfo("Menu Employment Details Clicked ");
				Thread.sleep(1000);
				
				// To Change employee status to Confirm
				if (datArr[36].equals("YES")) {
					
					WebElement empStatusProbConf = EmployeeEditPage.empStatusConfProb(driver);
					Thread.sleep(1000);
					empStatusProbConf.click();
					Thread.sleep(1000);
					WebElement empStatusProbConfVal = EmployeeEditPage.empStatusConfProbVal(driver, datArr[37]);
					empStatusProbConfVal.click();
					LoggerUtils.logInfo("Employee Status Probation / Confirmed   Updated");
					Thread.sleep(2000);

					// To Exit employee
				} else if (datArr[38].equals("YES")) {			
					WebElement selExit = EmployeeEditPage.selExitDate(driver);
					selExit.click();
					Thread.sleep(1000);
					WebElement btnOkExitDate = EmployeeEditPage.btnOkExitDate(driver);
					btnOkExitDate.click();
					LoggerUtils.logInfo("Employee Exit date entered");
					
					WebElement selEmpStatus = EmployeeEditPage.empStatus(driver);
					selEmpStatus.click();
					Thread.sleep(1000);
					WebElement selEmpStatusVal = EmployeeEditPage.empStatusVal(driver, datArr[39]);
					Thread.sleep(1000);
					selEmpStatusVal.click();
					LoggerUtils.logInfo("Employee Status Changed");
					Thread.sleep(2000);			
				} 
				
				// To change employe's baisc employment details
				else {
					WebElement designation = EmployeeEditPage.designation(driver);
					Thread.sleep(1000);
					designation.click();
					Thread.sleep(1000);
					WebElement designationVal = EmployeeEditPage.designationVal(driver, datArr[31]);
					designationVal.click();
					LoggerUtils.logInfo("Employee Designation Updated");
					Thread.sleep(2000);

					WebElement assign = EmployeeEditPage.assignProject(driver);
					Thread.sleep(1000);
					assign.click();
					WebElement assignVal = EmployeeEditPage.assignProjectVal(driver);
					assignVal.sendKeys(datArr[32]);
					Thread.sleep(1000);
					assignVal.sendKeys(Keys.ENTER);
					LoggerUtils.logInfo("Employee Assign Project  Selected");
					Thread.sleep(1000);

					Actions actions = new Actions(driver);
					actions.sendKeys(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(1000);

					WebElement location = EmployeeEditPage.location(driver);
					Thread.sleep(1000);
					location.click();
					WebElement locationVal = EmployeeEditPage.locationVal(driver, datArr[35]);
					LoggerUtils.logInfo("Employee Location  Selected");
					locationVal.click();
					Thread.sleep(1000);
				}
				
			} else if (datArr[3].equals("salaryDetails")) {
				
				WebElement menuEmploymentDet = EmployeeEditPage.menuEmploymentDet(driver);
				menuEmploymentDet.click();
				LoggerUtils.logInfo("Menu Employment Details Clicked ");
				Thread.sleep(1000);
				
				WebElement menuSalaryDet = EmployeeEditPage.menuSalaryDetails(driver);
				menuSalaryDet.click();
				LoggerUtils.logInfo("Menu Employee Salary Details Clicked");
				Thread.sleep(2000);
				
				if (datArr[30].equals(Globals.TRAINEE)) {
					
					WebElement txtStipend = EmployeeEditPage.txtStipend(driver);
					txtStipend.clear();
					Thread.sleep(1000);
					txtStipend.sendKeys(datArr[43]);
					LoggerUtils.logInfo("Trainee's  Stipend Updated");
					Thread.sleep(2000);
					
					
				} else if (datArr[30].equals(Globals.CONTRACTUAL)) {
					
					WebElement txtConsulationFees = EmployeeEditPage.txtConsulatationFee(driver);
					txtConsulationFees.clear();
					Thread.sleep(1000);
					txtConsulationFees.sendKeys(datArr[44]);
					LoggerUtils.logInfo("Contractual's  Consulation Fees Updated");
					Thread.sleep(2000);
					
				}else
				{
					WebElement txtCTC = EmployeeEditPage.txtCTC(driver);
					txtCTC.clear();
					Thread.sleep(1000);
					txtCTC.sendKeys(datArr[45]);
					LoggerUtils.logInfo("Employee's CTC Updated");
					Thread.sleep(1000);
					
					WebElement txtBasic = EmployeeEditPage.txtBasicSalary(driver);
					txtBasic.clear();
					Thread.sleep(1000);
					txtBasic.sendKeys(datArr[46]);
					LoggerUtils.logInfo("Employee's Baisc Salary Updated");
					Thread.sleep(1000);
					
					WebElement txtHRA = EmployeeEditPage.txtHRA(driver);
					txtHRA.clear();
					Thread.sleep(1000);
					txtHRA.sendKeys(datArr[47]);
					LoggerUtils.logInfo("Employee's HRA Amount Updated");
					Thread.sleep(1000);
					
					WebElement txtConveyence = EmployeeEditPage.txtConvyenceAllowance(driver);
					txtConveyence.clear();
					Thread.sleep(1000);
					txtConveyence.sendKeys(datArr[48]);
					LoggerUtils.logInfo("Employee's Convyence Allowance Updated");
					Thread.sleep(1000);
					
					WebElement txtMedical = EmployeeEditPage.txtMedicalAllowance(driver);
					txtMedical.clear();
					Thread.sleep(1000);
					txtMedical.sendKeys(datArr[49]);
					LoggerUtils.logInfo("Employee's Medical Allowance Updated");
					Thread.sleep(1000);
					
					WebElement txtMobile = EmployeeEditPage.txtMobileAllowance(driver);
					txtMobile.clear();
					Thread.sleep(1000);
					txtMobile.sendKeys(datArr[50]);
					LoggerUtils.logInfo("Employee's Mobile Allowance Updated");
					Thread.sleep(1000);
					
					WebElement txtExecutive = EmployeeEditPage.txtExecutiveAllowance(driver);
					txtExecutive.clear();
					Thread.sleep(1000);
					txtExecutive.sendKeys(datArr[51]);
					LoggerUtils.logInfo("Employee's Executive Allowance Updated");
					Thread.sleep(1000);

					WebElement txtEmployeeInsurance = EmployeeEditPage.txtEmployeeInsurance(driver);
					txtEmployeeInsurance.clear();
					Thread.sleep(1000);
					txtEmployeeInsurance.sendKeys(datArr[52]);
					LoggerUtils.logInfo("Employee's Insurance Benefit Updated");
					Thread.sleep(1000);
					
					WebElement txtVariable = EmployeeEditPage.txtVariablePay(driver);
					txtVariable.clear();
					Thread.sleep(1000);
					txtVariable.sendKeys(datArr[53]);
					LoggerUtils.logInfo("Employee's Variable Pay Updated");
					Thread.sleep(1000);
					
					WebElement txtEPF = EmployeeEditPage.txtEPF(driver);
					txtEPF.clear();
					Thread.sleep(1000);
					txtEPF.sendKeys(datArr[54]);
					LoggerUtils.logInfo("Employee's EPF Amount Updated");
					Thread.sleep(1000);
					
					WebElement txtJoining = EmployeeEditPage.txtJoiningBonus(driver);
					txtJoining.clear();
					Thread.sleep(1000);
					txtJoining.sendKeys(datArr[55]);
					LoggerUtils.logInfo("Employee's Joining Bonus Updated");
					Thread.sleep(1000);

				}
				
				
				
			}
			
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			
			WebElement menuUploadDoc = EmployeeEditPage.menuUploadDoc(driver);
			menuUploadDoc.click();
			LoggerUtils.logInfo("Upload Document Menu Clicked");
			Thread.sleep(1000);
			
			WebElement btnFinish = EmployeeEditPage.btnFinish(driver);
			btnFinish.click();
			LoggerUtils.logInfo("Finish Button Clicked");
			Thread.sleep(1000);
			
			WebElement btnProceedOK = EmployeeEditPage.btnProceedOK(driver);
			btnProceedOK.click();
			LoggerUtils.logInfo("Proceed Ok button Clicked");
			Thread.sleep(2000);
			
			WebElement successMSG = EmployeeEditPage.dialogMSG(driver);
			Thread.sleep(1000);
			String successMessage = successMSG.getText();
			
			if (successMessage.equals(Globals.EMP_UPDATED_SUCCESS)) 	
			{
				LoggerUtils.logInfo("Employee Created Successfully");
				WebElement btnOk = EmployeeEditPage.btnDailogOK(driver);
				btnOk.click();
				LoggerUtils.logInfo("Ok Button Clicked");
				hMapRetObj.put("testRunStatus", Globals.PASS);
				hMapRetObj.put("depUpdateVal", "");
			}
			else {
				LoggerUtils.logInfo("Unable to create employee");
				WebElement btnOk = EmployeeEditPage.btnDailogOK(driver);
				btnOk.click();
				LoggerUtils.logInfo("Ok Button Clicked");
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

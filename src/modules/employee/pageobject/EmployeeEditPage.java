package modules.employee.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeEditPage {
	
	public static WebElement menuViewEmp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'View Employees')]")));
		return element;
	}
	
	public static WebElement searchEmp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='form-control input-sm']")));
		return element;
	}
	
	public static WebElement resultRecord(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[1]")));
		return element;
	}
	
	public static WebElement btnViewEmp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(text(),'remove_red_eye')]")));
		return element;
	}
	
	public static WebElement btnEditEmp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(text(),'edit')]")));
		return element;
	}
	
	public static WebElement menuEducationDet(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/a[1]")));
		return element;
	}
	
	public static WebElement menuEmploymentDet(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[3]/a[1]")));
		return element;
	}
	
	public static WebElement menuSalaryDetails(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[4]/a[1]")));
		return element;
	}
	public static WebElement menuUploadDoc(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[5]/a[1]")));
		return element;
	}
	
	
	
	// Personal Details Page Object
	public static WebElement firstName(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='first_name']")));
		return element;
	}
	
	public static WebElement middleName(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='middle_name']")));
		return element;
	}
	
	public static WebElement lastName(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='last_name']")));
		return element;
	}
	
	public static WebElement personalEmail(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_personal_email']")));
		return element;
	}
	
	public static WebElement aadhaarNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='addhar_no']")));
		return element;
	}
	
	public static WebElement panNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='pan_no']")));
		return element;
	}
	
	public static WebElement selDOB(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dob']")));
		return element;
	}
	
	public static WebElement selDOBVal(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'03')]")));
		return element;
	}
	
	public static WebElement btnDOBOk(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='dtp_NPIPr']//button[@class='dtp-btn-ok btn btn-flat btn-sm'][contains(text(),'OK')]")));
		return element;
	}
	
	public static WebElement parmAddress(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='perm_address']")));
		return element;
	}
	
	public static WebElement selBloogGrp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[1]/div[5]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement bloodGroupVal(WebDriver driver, String bloodGroupVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='text'][contains(text(),'"+bloodGroupVal+"')]")));
		return element;
	}
	
	public static WebElement btnCopyAddress(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='copy-perm-addr-btn']")));
		return element;
	}
	
	public static WebElement commAddress(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='comm_address']")));
		return element;
	}
	
	public static WebElement contactNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_contact']")));
		return element;
	}
	
	public static WebElement emgContactNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emergency_contact']")));
		return element;
	}
	
	public static WebElement identityMark(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_identity_mark']")));
		return element;
	}
	
	public static WebElement selEmgContactRel(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[2]/div[7]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement emgContactRelVal(WebDriver driver,String relVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+relVal+"')]")));
		return element;
	}
	
	public static WebElement btnChoosePhoto(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_photo']")));
		return element;
	}
	
	public static WebElement btnPerDetNext(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Next')]")));
		return element;
	}
	
	// Education Details Page Object
	
	public static WebElement txtQualification(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='degree_1']")));
		return element;
	}
	
	public static WebElement passingYear(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='year_1']")));
		return element;
	}
	
	public static WebElement univercityName(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='clg_name_1']")));
		return element;
	}
	
	public static WebElement percentage(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='percent_1']")));
		return element;
	}
	
	public static WebElement btnAddMoreDetails(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='add-new-edu-row']//i[@class='material-icons'][contains(text(),'add')]")));
		return element;
	}
	
	public static WebElement txtQualificationNum(WebDriver driver,String num)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='degree_"+num+"']")));
		return element;
	}
	
	public static WebElement passingYearNum(WebDriver driver, String num)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='year_"+num+"']")));
		return element;
	}
	
	public static WebElement univercityNameNum(WebDriver driver,String num)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='clg_name_"+num+"']")));
		return element;
	}
	
	public static WebElement percentageNum(WebDriver driver,String num)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='percent_"+num+"']")));
		return element;
	}
	
	public static WebElement btnEduDetailsNext(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Next')]")));
		return element;
	}
	
	// Employee's Employment Details Page Object
	
	public static WebElement totalExperience(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='total_exp']")));
		return element;
	}
	
	public static WebElement txtGTEmailID(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='gt_email']")));
		return element;
	}
	
	public static WebElement txtDOJ(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='doj']")));
		return element;
	}
	
	public static WebElement btnOkDOJ(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/button[4]")));
		return element;
	}
	
	public static WebElement selEmpType(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[3]/div[2]/div[4]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement selEmpTypeVal(WebDriver driver, String empTypeVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+empTypeVal+"')]")));
		return element;
	}
	
	public static WebElement designation(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@class='theme-red']/section[@class='content']/div[@class='container-fluid']/div[@class='row clearfix']/div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']/div[@class='card']/div[@class='body']/form[@id='create_emp_form']/div[@class='content clearfix']/section[@id='create_emp_form-p-2']/div[@class='col-md-6']/div[4]/div[1]/div[1]/button[1]/span[1]")));
		return element;
	}
	
	
	
	public static WebElement assignProject(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[3]/div[2]/div[5]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement assignProjectVal(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='bs-container btn-group bootstrap-select show-tick open']//input[@class='form-control']")));
		return element;
	}
	
	public static WebElement remarks(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@placeholder='Enter remarks']")));
		return element;
	}
	
	public static WebElement bankName(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_bank_name']")));
		return element;
	}
	
	public static WebElement location(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[3]/div[3]/div[9]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement locationVal(WebDriver driver, String locationVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+locationVal+"')]")));
		return element;
	}
	
	public static WebElement empStatusConfProb(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[3]/div[3]/div[5]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement empStatusConfProbVal(WebDriver driver, String empStatusVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+empStatusVal+"')]")));
		return element;
	}
	
	public static WebElement selExitDate(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_exit_date']")));
		return element;
	}
	
	public static WebElement btnOkExitDate(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/button[4]")));
		return element;
	}
	
	public static WebElement empStatus(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/section[3]/div[2]/div[8]/div[1]/div[1]/button[1]")));
		return element;
	}
	
	public static WebElement empStatusVal(WebDriver driver, String empStatusVal)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+empStatusVal+"')]")));
		return element;
	}
	
	
	public static WebElement bankAccNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_bank_acc_no']")));
		return element;
	}
	
	public static WebElement UANNo(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='uan']")));
		return element;
	}
	
	public static WebElement PFNo (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='pf_no']")));
		return element;
	}
	
	public static WebElement btnNextEmpmntDet (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Next')]")));
		return element;
	}

	public static WebElement designationVal(WebDriver driver, String string) {
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+string+"')]")));
		return element;
	}
	
	// Employee's Salary Details Page Object
	public static WebElement txtStipend (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='other_fees']")));
		return element;
	}
	
	public static WebElement txtConsulatationFee (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='other_fees']")));
		return element;
	}
	
	public static WebElement txtCTC (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='ctc']")));
		return element;
	}
	
	public static WebElement txtBasicSalary (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='basic_salary']")));
		return element;
	}
	
	public static WebElement txtHRA (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='hra']")));
		return element;
	}
	
	public static WebElement txtConvyenceAllowance (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='convyence_allowance']")));
		return element;
	}
	
	public static WebElement txtMedicalAllowance (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='medical_allowance']")));
		return element;
	}
	
	public static WebElement txtMobileAllowance (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='mobile_allowance']")));
		return element;
	}
	
	public static WebElement txtExecutiveAllowance (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='executive_allowance']")));
		return element;
	}
	
	public static WebElement txtEmployeeInsurance (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_health_benefit']")));
		return element;
	}
	
	public static WebElement txtVariablePay (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='var_pay']")));
		return element;
	}

	public static WebElement txtEPF (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='epf']")));
		return element;
	}
	
	public static WebElement txtJoiningBonus (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='join_bonus']")));
		return element;
	}
	
	public static WebElement btnNextSalaryDet (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Next')]")));
		return element;
	}
	
	// Employee's Document Page Object
	
	public static WebElement btnFinish (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Finish')]")));
		return element;
	}
	
	public static WebElement btnProceedOK (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='confirm']")));
		return element;
	}
	
	public static WebElement dialogMSG (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[8]/p[1]/b[1]")));
		return element;
	}
	
	public static WebElement btnDailogOK (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='confirm']")));
		return element;
	}
	
	public static WebElement txtExitDate (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='emp_exit_date']")));
		return element;
	}
	
	public static WebElement lblExitMonth (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]")));
		return element;
	}
	
	public static WebElement btnForwardExitMonth (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")));
		return element;
	}
	
	public static WebElement btnBackExitMonth (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")));
		return element;
	}
	
	public static WebElement lblExitYear (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]")));
		return element;
	}
	
	public static WebElement btnForwardExitYear (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[3]/a[1]/i[1]")));
		return element;
	}
	
	public static WebElement btnBackExitYear (WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/i[1]")));
		return element;
	}
	
	public static WebElement selExitDay(WebDriver driver, String lblExitDay)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'"+lblExitDay+"')]")));
		return element;
	}
	
}

package projlib;

import org.openqa.selenium.WebDriver;


public class Applib 

{
	public static void forceLogin(WebDriver driver, String sPwd) {
		try {
			/*WebElement forceLoginMsg = LoginPage.forceLoginMsg(driver);
			String msg = forceLoginMsg.getText();
			WebElement txtPwd = LoginPage.userPwd(driver);
			txtPwd.clear();
			txtPwd.sendKeys(sPwd);
			WebElement btnSubmit = LoginPage.btnSubmitLogin(driver);
			btnSubmit.click();*/
		} catch (Exception e) {
			System.out.println("Direct Login");
		}
		
	}
	

	public static void selectDate(String date,WebDriver driver)
	{
		
	}
}

package projlib;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
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
	
	public static void consoleOutput(HashMap<String, String> consoleData) throws JSONException {
			 
	        System.out.println(new JSONObject(consoleData));    			
	}
	
	public static long calculateExecutionTime(long endTime, long startTime) {
		
		long timeElapsed = endTime - startTime;
		long executionTime = timeElapsed/1000000000;
		return executionTime;
		
	}
}

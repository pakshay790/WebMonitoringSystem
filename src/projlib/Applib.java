package projlib;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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
	
	
	public static void selectDate(String date,WebDriver driver, String[] datArr)
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
	
	public static void selMonthBackButton(String[] arrDate, WebDriver driver, WebElement objSelMonth,WebElement btnBackMonth) throws InterruptedException {
		WebElement selMonth = objSelMonth;
		String currentMonth;
		String dataMonth = arrDate[1];
		
		Thread.sleep(1000);
		
		for (int i = 0; i < 12; i++) {
			currentMonth = selMonth.getText();
			
			if (!currentMonth.equals(dataMonth)) {
				WebElement BackMonth =btnBackMonth;
				BackMonth.click();
				Thread.sleep(500);			
			}
		}
		
	}
	
	public static void selMonthForwardButton(String[] arrDate, WebDriver driver, WebElement objSelMonth, WebElement btnForwardMonth) throws InterruptedException {
		WebElement selMonth = objSelMonth;
		String currentMonth;
		String dataMonth = arrDate[1];
		
		Thread.sleep(1000);
		
		for (int i = 0; i < 12; i++) {
			currentMonth = selMonth.getText();
			
			if (!currentMonth.equals(dataMonth)) {
				WebElement ForwardMonth =btnForwardMonth;
				ForwardMonth.click();
				Thread.sleep(500);			
			}
		}
		
	}
	
	public static void selYear(String[] arrDate, WebDriver driver, WebElement objSelYear, WebElement objForwardYear, WebElement objBackYear) throws InterruptedException {
		WebElement selYear = objSelYear ;
		int currentYear = Integer.parseInt(selYear.getText());
		
		int dataYear =  Integer.parseInt(arrDate[2]);
		int difference = Math.abs(dataYear - currentYear);
		
		if (currentYear < dataYear)
		{
			WebElement forwardYear = objForwardYear ;
			for (int i = 0; i <difference; i++) {
				forwardYear.click();
			}
		}
		else {
			WebElement backYear = objBackYear;
			for (int i = 0; i <difference; i++) {
				backYear.click();
			}
		}
		
	}
}

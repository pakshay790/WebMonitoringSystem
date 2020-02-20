package modules.payroll.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewMusterPage {

	public static WebElement listViewMuster(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'View Muster')]")));
        return element;
    }
	
	public static WebElement btnSync(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'cached')]")));
        return element;
    }
	
	public static WebElement txtSearch(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]")));
        return element;
    }
	
	public static WebElement selectSearchRecord(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]")));
        return element;
    }
	
	public static WebElement btnAddLeaves(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'add')]")));
        return element;
    }
	
	public static WebElement btnViewLeaves(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'remove_red_eye')]")));
        return element;
    }
	
	public static WebElement btnOK(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm']")));
        return element;
    }
	//button[@class='confirm']
	
	public static WebElement txtFromDate(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='start-date']")));
        return element;
    }
	
	public static WebElement txtToDate(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='end-date']")));
        return element;
    }
	public static WebElement lblLeaveBalance(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")));
        return element;
    }
	
	public static WebElement lblFromMonth(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        return element;
    }
	
	public static WebElement btnForwardFromMonth(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")));
        return element;
    }
	public static WebElement btnBackwardFromMonth(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]/i[1]")));
        return element;
    }
	
	public static WebElement lblFromYear(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]")));
        return element;
    }
	
	public static WebElement btnForwardFromYear(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[3]/a[1]/i[1]")));
        return element;
    }
	
	public static WebElement btnBackwardFromYear(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[3]/a[2]/i[1]")));
        return element;
    }
	
	public static WebElement lblToMonth(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        return element;
    }
	
	public static WebElement btnForwarToMonth(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")));
        return element;
    }
	
	public static WebElement lblToYear(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[2]")));
        return element;
    }
	
	public static WebElement btnForwardToYear(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[3]/a[1]/i[1]")));
        return element;
    }

	public static WebElement selDay(WebDriver driver, String strDay)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+strDay+"')]")));
        return element;
    }
	
	public static WebElement selToDay(WebDriver driver, String strDay)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(strDay)));
        return element;
    }
	
	public static WebElement btnDateOk(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/button[4]")));
        return element;
    }
	
	public static WebElement btnToDateOk(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/button[4]")));
        return element;
    }
	
	public static WebElement txtRemarks(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='leaves-input']")));
        return element;
    }
	
	public static WebElement btnSubmitAddLeaves(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='save-added-leaves']")));
        return element;
    }
	
	public static WebElement alertMsg(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[9]/p[1]")));
        return element;
    }
	
	
}

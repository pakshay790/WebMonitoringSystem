package modules.calendar.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPage {

	public static WebElement menuCalendars(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/aside[1]/div[2]/div[1]/ul[1]/li[4]/a[2]")));
        return element;
    }
	
	public static WebElement menuManageCalendar(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Manage Calendars')]")));
        return element;
    }
	
	public static WebElement selectDate(WebDriver driver, String date)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'"+date+"')]")));
        return element;
    }
	
	public static WebElement btnUpdate(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit-calendar']")));
        return element;
    }
	
	public static WebElement btnAlertOk(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm']")));
        return element;
    }
	
	public static WebElement txtAlertMsg(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[4]/p[1]")));
        return element;
    }
	
	public static WebElement btnAlertSubmit(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm']")));
        return element;
    }
	
	
}

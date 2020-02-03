package modules.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommPageObject {
	
	public static WebElement menuHRDept(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]")));
        return element;
    }
	
	public static WebElement menuMainMenu(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='menu']//li[3]//a[1]")));
        return element;
    }
	
	public static WebElement menuAccDept(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[2]/div[1]/div[1]")));
        return element;
    }
	
	public static WebElement menuPayrollDept(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[3]/div[1]/div[1]")));
        return element;
    }

	public static WebElement menuEmp(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/aside[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")));
		return element;
	}
	
	public static WebElement selectDate(WebDriver driver,String date)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'"+date+"')]")));
		return element;
	}
	
	public static WebElement selectMonth(WebDriver driver,String month)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dtp-date']//div//div[@class='dtp-actual-month p80'][contains(text(),'"+month+"')]")));
		return element;
	}
	
	public static WebElement selectYear(WebDriver driver)
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]")));
		return element;
	}
	
	public static WebElement selectYear(WebDriver driver, String year)  
	{
		WebElement element=null;
		WebDriverWait wait=new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'"+year+"')]")));
		return element;
	}
	
}

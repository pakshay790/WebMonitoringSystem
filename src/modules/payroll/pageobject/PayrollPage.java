package modules.payroll.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayrollPage {
	
	public static WebElement menuLeaveMuster(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Leave Muster')]")));
        return element;
    }

	
	public static WebElement menuSalarySlipGenerator(WebDriver driver)
    {
        WebElement element=null;
        WebDriverWait wait=new WebDriverWait(driver, 50);
        element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Salary Slip Generator')]")));
        return element;
    }
}

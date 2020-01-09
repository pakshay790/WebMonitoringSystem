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
	
}

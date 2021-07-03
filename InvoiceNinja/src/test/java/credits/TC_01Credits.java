package credits;

import java.awt.AWTException;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import junit.framework.Assert;
import pomRepository.CreditsPage;
import pomRepository.HomePage;
/***
 * 
 * @author Sowmya H M
 *
 */
public class TC_01Credits extends BaseTest{
	@Test
	public void createCredit() throws AWTException
	{
		
		ExcelUtil excelData=new ExcelUtil();
		HomePage home=new HomePage(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement link = home.getCreditsButton();
		js.executeScript("arguments[0].click();", link);
		Assert.assertEquals(driver.getTitle(), "Credits | Invoice Ninja");
		Reporter.log("Credit page is displayed",true);
		
		//---------------Navigate to the CreditPage---------//
		
		CreditsPage credit=new CreditsPage(driver);
		credit.getenterCreditButton().click();
		String name = driver.getTitle();
		System.out.println(name);
		Assert.assertEquals(driver.getTitle(), "Enter Credit | Invoice Ninja");
		Reporter.log("Enter credit page is displayed",true);
		
		//------------Navigate to the EnterCreditpage----------//
		
		WebElement element = credit.getClientTextField();
		element.sendKeys("D swag",Keys.ENTER);
		Reporter.log("Entered client name",true);
		credit.getAmountTextfield().sendKeys("56777");
		Reporter.log("Entered amount",true);
		credit.getPublicnotesTextfield().sendKeys("hii");
		Reporter.log("Enter edit page is displayed",true);
		credit.getPrivatenotesTextfield().sendKeys("hello");
		credit.getSave1Button().click();
		
		
	}

}

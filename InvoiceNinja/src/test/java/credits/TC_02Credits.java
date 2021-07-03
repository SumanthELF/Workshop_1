package credits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CreditsPage;
import pomRepository.HomePage;
/***
 * 
 * @author Sowmya H M
 *
 */
public class TC_02Credits extends BaseTest
{
	@Test
	public void editCredit() throws InterruptedException
	{
		HomePage home=new HomePage(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement link = home.getCreditsButton();
		js.executeScript("arguments[0].click();", link);
		Assert.assertEquals(driver.getTitle(),"Credits | Invoice Ninja");
		Reporter.log("Credit page is displayed",true);
		
		//---------------Navigate to the CreditPage---------//
		
		CreditsPage credit=new CreditsPage(driver);
		credit.getStatusTextfield().sendKeys("active",Keys.ENTER);
		Reporter.log("Selected Active status",true);
		credit.getclientNameSelect().click();
		Reporter.log("selected clientName",true);
		WebElement edit =credit.geteditCreditButton();
		js.executeScript("arguments[0].click();", link);
		Assert.assertEquals(driver.getTitle(), "Credits | Invoice Ninja");
		Thread.sleep(5000);
		Reporter.log("Edit Credit page is displayed",true);
		
		//-------------Navigate to the EditCreditPage-----//
	   
		WebElement save = credit.getsubmitButton();
		js.executeScript("arguments[0].click();", save);
		Reporter.log("save the credits",true);
	
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

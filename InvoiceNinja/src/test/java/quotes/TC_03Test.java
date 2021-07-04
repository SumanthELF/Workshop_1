package quotes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.QuotesPage;
/***
 * 
 * @author swarnaLakshmi
 *
 */
public class TC_03Test extends BaseTest {


	@Test()
	public void TC_03QuotesTest()  {
		WebDriverWait wait = new WebDriverWait(driver,10);
		Actions actions = new Actions(driver);

		//=============================================================================================================================
		// Step 3:Click on "Quotes" button from the hamberger menu
		QuotesPage quotesPage = new QuotesPage(driver);
		quotesPage.getQuotesButton().click();
		Assert.assertEquals(driver.getTitle(),"Quotes | Invoice Ninja","Quotes page is not displayed");
		Reporter.log("Quotes page should be displayed",true);


        //=============================================================================================================================
		// Step 4:Click on "New quote" button
		quotesPage.getNewQuoteButton().click();
		Assert.assertEquals(driver.getTitle(),"New Quote | Invoice Ninja","Create page is not displayed");
		Reporter.log("Create page should be displayed",true);

		//==============================================================================================================================
		//Step 5:Enter Client name
		quotesPage.getClientTextField().sendKeys("Ty",Keys.ENTER);
		//quotesPage.getClientNameTextfield().sendKeys(readExcelData.readStringDataFromExcel("Quotes",1,0));
		Reporter.log("User should be able to Enter",true);

		//==============================================================================================================================
		//Step 6:click on "Edit Client" link
		quotesPage.getEditClientLink().click();
		actions.click(quotesPage.getEditClientLink()).perform();
		String actualClientText = quotesPage.getAddContactText().getText();
		String expectedClientText = "Add contact +";
		Assert.assertEquals(actualClientText, expectedClientText);
		Reporter.log("Client popup is displayed",true);


		HomePage homePage = new HomePage(driver);
		actions.click(quotesPage.getDoneButton()).perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement savedraftbutton = quotesPage.getSaveDraftButton();
		js.executeScript("arguments[0].click();",savedraftbutton);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getGuestDropDown()));

        }

}
package quotes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.QuotesPage;
/***
 * 
 * @author DevikaPatel
 *
 */
public class TC_01Test extends BaseTest{

	@Test()
	public void TC_01QuotesTest() {

		//=============================================================================================================================
		// Step 3:Click on "Quotes" button from the hamburger menu
		QuotesPage quotesPage=new QuotesPage(driver);
		quotesPage.getQuotesButton().click();
		Assert.assertEquals(driver.getTitle(),"Quotes | Invoice Ninja","Quotes page is not displayed");
		Reporter.log("Quotes page should be displayed",true);


		//=============================================================================================================================
		// Step 4:Click on "New quote" button

		quotesPage.getNewQuoteButton().click();
		Assert.assertEquals(driver.getTitle(),"New Quote | Invoice Ninja","Create page is not displayed");
		Reporter.log("Create page should be displayed",true);

	}


}

package quotes;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import genericLibrary.ListenerImplementationClass;
import pomRepository.QuotesPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;

@Listeners(ListenerImplementationClass.class)

/***
 *
 * @author vijay

 *
 */

public class TC_05Test  extends BaseTest{
	@Test()
	public void TC_05QuotesTest() throws InterruptedException  {

		//==========================================================================================
		//Step 3: Click on "Quotes" button available in the hamberger menu

		QuotesPage quotespage=new QuotesPage(driver);
		quotespage.getQuotesButton().click();
		Assert.assertEquals(driver.getTitle(),"Quotes | Invoice Ninja","Quotes page is not displayed");
		Reporter.log("Quotes page should be displayed",true);

		//=====================================================================================================
		//Step 4:Click on "New Quote" button

		quotespage.getNewQuoteButton().click();
		Assert.assertEquals(driver.getTitle(),"New Quote | Invoice Ninja","Create page is not displayed");
		Reporter.log("Create page should be displayed",true);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+700+","+800+")");

		//====================================================================================
		//Step 4:Click on "Save Draft" button

		quotespage.getSaveDraftButton().click();
		//Assert.assertEquals(driver.getTitle(),"New Quote | Invoice Ninja","client popup is not displayed");
		Reporter.log("client popup should be displayed",true);

		//=========================================================================
		//Step 5: Click on close link
		//quotespage.getCloseButton().click();
		//quotespage.getQuotesButton().click();
		quotespage.getCloseSymbol().click();
		quotespage.getQuotesButton().click();

	}
}
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

public class TC_06Test  extends BaseTest{
	JavascriptExecutor js =(JavascriptExecutor)driver;
	@Test()
	public void TC_06QuotesTest()  {

		//========================================================================
		//Step 3: Click on "Quotes" button available in the hamberger menu
		
		QuotesPage quotespage=new QuotesPage(driver);
		quotespage.getQuotesButton().click();
		Assert.assertEquals(driver.getTitle(),"Quotes | Invoice Ninja","Quotes page is not displayed");
		Reporter.log("Quotes page should be displayed",true);

		//========================================================================
		//Step 4: Click on quotes Number link

		quotespage.getQuoteNumber().click();
		String expectedEditQuotetNumberitle = "Edit Quote | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),expectedEditQuotetNumberitle , "quotes number details  is not displaed");
		Reporter.log("Quotes number details should be displayed",true);

	}
}
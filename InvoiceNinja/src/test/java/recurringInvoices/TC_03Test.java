package recurringInvoices;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.RecurringPage;

/***
 * 
 * @author Tuba
 *
 */

public class TC_03Test extends BaseTest{

	@Test()
	public void TC_04RecurringTest() {

		//================================================================================
		//Step 3: Navigate to "Recurring" module from hamburger menu. 

		RecurringPage recurringPage=new RecurringPage(driver);
		recurringPage.getRecurringButton().click();
		String expectedRecurringtitle = "Recurring Invoices | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),expectedRecurringtitle , "recurring page is not displayed");
		Reporter.log("Recurring page should be displayed",true);

		//===============================================================================================
		//Step 4:Select the required client by clicking on checkbox.

		recurringPage.getClientCheckBox().click();

		//============================================================================================
		//Step 5:Click on "select" dropdown.

		recurringPage.getselectDropdown().click();

		//==============================================================================================
		//Step 6:Select the "Recurring quote" from dropdown.

		recurringPage.getClonetoQuote().click();

		//===========================================================================================
		//Step 7: Click on DraftButton

		recurringPage.getSaveDraftButton().click();
		String ActualQuotesPageTitle = driver.getTitle();
		String expectedActualQuotesPageTitle = "Edit Quote | Invoice Ninja";
		Assert.assertEquals(ActualQuotesPageTitle,expectedActualQuotesPageTitle);
		Reporter.log("client Quotes page is displayed",true);

	}

}

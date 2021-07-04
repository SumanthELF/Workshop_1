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

public class TC_04Test extends BaseTest{

	@Test()
	public void TC_04RecurringTest() {

		//=============================================================================================
		//Step 3:Navigate to "Recurring" module from hamburger menu. 

		RecurringPage recurringpage=new RecurringPage(driver);
		recurringpage.getRecurringButton().click();
		String expectedRecurringtitle = "Recurring Invoices | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),expectedRecurringtitle , "recurring page is not displayed");
		Reporter.log("Recurring page should be displayed",true);

		//===========================================================================================
		//Step 4:Select the required client by clicking on checkbox.

		recurringpage.getClientCheckBox().click();

		//====================================================================================
		//Step 5: Click on "select" dropdown.

		recurringpage.getselectDropdown().click();

		//================================================================================================
		//Step 6:Select  "Clone To Invoice" from dropdown.

		recurringpage.getClonetoInvoice().click();

		//=====================================================================================
		//Step 7:Click on "Save Draft "Button

		recurringpage.getSaveDraftButton().click();
		String ActualQuotesPageTitle = driver.getTitle();
		String expectedActualQuotesPageTitle = "Edit Invoice | Invoice Ninja";
		Assert.assertEquals(ActualQuotesPageTitle,expectedActualQuotesPageTitle);
		Reporter.log("client Invoice page is displayed",true);

	}

}

package recurringInvoices;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.RecurringPage;

/***
 * 
 * @author Md Istiyak
 *
 */
public class TC_02Test extends BaseTest {

	@Test
	public void TC_02RecurringInvoicesTest() throws InterruptedException {
		//ExcelUtil excel=new ExcelUtil();
		//String clientName = excel.readAnyDataFromExcelInString("Recurring", 1, 0);
		//String firstName = excel.readAnyDataFromExcelInString("Recurring", 1, 1);
		//String lastName = excel.readAnyDataFromExcelInString("Recurring", 1, 2);
		//String email = excel.readAnyDataFromExcelInString("Recurring", 1, 3);
		//String phoneNo = excel.readAnyDataFromExcelInString("Recurring", 1, 4);
		//String currency = excel.readAnyDataFromExcelInString("Recurring", 1, 5);
		//navigate to Recurring page

		//==============================================================================================
		// Step 3:Navigate to "Recurring" module from hamburger menu. 

		RecurringPage recurring=new RecurringPage(driver);
		recurring.getRecurringButton().click();
		String expectedRecurringtitle = "Recurring Invoices | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),expectedRecurringtitle , "recurring page is not displayed");
		Reporter.log("Recurring page is displayed",true);
		//==============================================================================================
		// Step 4:Select the " New Recurring Invoices" button.

		recurring.getNewRecurringInvoice().click();
		String actualCreateTitle = driver.getTitle();
		String exceptedCreateTitle = "New Invoice | Invoice Ninja";
		Assert.assertEquals(actualCreateTitle,exceptedCreateTitle);
		Reporter.log("Recurring create page is displayed",true);
		//==============================================================================================
		// Step 5:Enter data into "Client","Item cost","Item quantity" textfield and click on "mark as ready" button

		recurring.getClientInputTextfield().sendKeys("TestYantra",Keys.ENTER);
		recurring.getItemCost().sendKeys("500");
		recurring.getItemQuantity().sendKeys("1");
		recurring.getMarkAsReadyButton().click();

		//=============================================================================================
		// Step 6:Click on "Invoice email" popup

		recurring.getInvoiceEmailPopup().click();
		String actualclientname = recurring.getSentClientNameText().getText();
		String exceptedclientname = "TestYantra";
		Assert.assertEquals(actualclientname,exceptedclientname);
		Reporter.log("client is marked to the invoiceEmail",true);
	}
}

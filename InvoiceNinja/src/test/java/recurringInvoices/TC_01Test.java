package recurringInvoices;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.RecurringPage;

/***
 * 
 * @author Md Istiyak
 *
 */
public class TC_01Test extends BaseTest {
	@Test
	public void TC_01RecurringInvoicesTest() {
		//ExcelUtil excel=new ExcelUtil();
		//String clientName = excel.readAnyDataFromExcelInString("Recurring", 0, 0);
		//String dueDate = excel.readAnyDataFromExcelInString("Recurring", 0, 1);
		//String PONumber = excel.readAnyDataFromExcelInString("Recurring", 0, 2);
		//String item = excel.readAnyDataFromExcelInString("Recurring", 0, 3);
		//String itemName = excel.readAnyDataFromExcelInString("Recurring", 0, 4);
		//String itemRate = excel.readAnyDataFromExcelInString("Recurring", 0, 5);
		//String itemQuantity = excel.readAnyDataFromExcelInString("Recurring", 0, 6);
		//navigate to Recurring page
		//==============================================================================================
		// Step 3:Navigate to "Recurring" module from hamburger menu. 

		RecurringPage recurring=new RecurringPage(driver);
		recurring.getRecurringButton().click();
		String expectedRecurringtitle = "Recurring Invoices | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),expectedRecurringtitle , "recurring page is not displayed");
		Reporter.log("Recurring page should be displayed",true);
		//==============================================================================================
		// Step 4:Click on "New Recurring Invoices" button.

		recurring.getNewRecurringInvoice().click();
		String actualCreateTitle = driver.getTitle();
		String exceptedCreateTitle = "New Invoice | Invoice Ninja";
		Assert.assertEquals(actualCreateTitle,exceptedCreateTitle);
		Reporter.log("Recurring create page is displayed",true);
		//==============================================================================================
		// Step 5:Enter data into "Client" textfield

		recurring.getClientInputTextfield().sendKeys("Chandana",Keys.ENTER);

		//==============================================================================================
		// Step 6:Select due date from "Due date" listbox

		SelectClassUtil select=new SelectClassUtil();
		select.selectDropDownByVisibleText(recurring.getRecurringDueDate(), "2nd day of month");

		//==============================================================================================
		// Step 7:Enter the po number,item cost and item quantity into the respective textfields

		recurring.getPoNumber().sendKeys("5");
		recurring.getItemCost().sendKeys("500");
		recurring.getItemQuantity().sendKeys("1");

		//==============================================================================================
		// Step 8:Click on "save draft" button

		recurring.getSaveDraftButton().click();
		String actualclientname = recurring.getEmailRecurringText().getText();
		String exceptedclientname = "Chandana";
		Assert.assertEquals(actualclientname,exceptedclientname);
		Reporter.log("client is moved to the sent page",true);
	}
}

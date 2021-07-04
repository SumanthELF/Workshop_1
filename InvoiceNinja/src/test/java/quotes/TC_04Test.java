package quotes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import pomRepository.QuotesPage;
/***
 * 
 * @author swarnaLakshmi
 *
 */
public class TC_04Test extends BaseTest {

	@Test()

	public void TC_03QuotesTest() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//======================================================================================================
		//Step 3:Click on "Quotes" button from the hamberger menu
		QuotesPage quotesPage = new QuotesPage(driver);
		quotesPage.getQuotesButton().click();
		Assert.assertEquals(driver.getTitle(),"Quotes | Invoice Ninja","Quotes page is not displayed");
		Reporter.log("Quotes page should be displayed",true);

		//======================================================================================================
		// Step 4:Click on "New quote" button
		quotesPage.getNewQuoteButton().click();
		Assert.assertEquals(driver.getTitle(),"New Quote | Invoice Ninja","Create page is not displayed");
		Reporter.log("Create page should be displayed",true);

		//======================================================================================================
		//Step 5:Enter number into Quote number text field
		quotesPage.getQuoteNumberTextfield().sendKeys("43");
		Reporter.log("user should be able to enter");

		//======================================================================================================
		//Step 6:click on "Save draft" button
		quotesPage.getSaveDraftButton().click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement savedraftbutton = quotesPage.getSaveDraftButton();
		js.executeScript("arguments[0].click();",savedraftbutton);
		String actualClientText = quotesPage.getClientText().getText();
		String expectedClientText = "Client";
		Assert.assertEquals(actualClientText, expectedClientText);
		Reporter.log("Client popup is displayed",true);
		quotesPage.getCloseSymbol().click();
		quotesPage.getQuotesButton().click();
		driver.switchTo().alert().accept();
	}

}
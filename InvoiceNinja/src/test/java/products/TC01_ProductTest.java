package products;
/***
 * @author Aditya
 */

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import pomRepository.ProductPage;

public class TC01_ProductTest extends BaseTest{
	@Test
	public void createNewProduct() throws EncryptedDocumentException, IOException, InterruptedException {

		ExcelUtil ex=new ExcelUtil();

		//=====================Step3.Click on Products module==========================================================

		HomePage homePage1 = new HomePage(driver);
		homePage1.getProductsLink().click();
		String Product_PageTitle="Products | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product Page is not displayed");

		//=====================Step4.Click on New Product Button========================================================


		ProductPage productPage = new ProductPage(driver);
		productPage.getCreateNewProductButton().click();
		String New_Product_PageTitle="Add Product | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),New_Product_PageTitle,"New Product Page is not displayed");

		//======================Step5.Enter valid inputs to all the fields and click on "Cancel" button================

		String productName = ex.readStringDataFromExcel("Products", 0, 0);
		productPage.getProductNameTextfield().sendKeys(productName);
		Assert.assertEquals(productPage.getProductNameTextfield().getAttribute("value"),productName,"Product Name is not enterded correctly");		

		String note = ex.readStringDataFromExcel("Products", 0, 1);
		productPage.getNotesTextfield().sendKeys(note);
		Assert.assertEquals(productPage.getNotesTextfield().getAttribute("value"),note,"Note is not enterded correctly");

		int cost = (int) ex.readNumberDataFromExcel("Products", 0, 2);
		productPage.getCostTextfield().sendKeys(""+cost);
		Assert.assertEquals(productPage.getCostTextfield().getAttribute("value"),""+cost+"","Cost is not enterded correctly");

		Thread.sleep(3000);

		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		productPage.getCancelButtonLink().click();

		//========================Step6.Click Leave button on alert popup==============================================

		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product Page is not displayed");	}
}

package products;
/***
 *@author Aditya
 */
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductPage;

public class TC02_ProductsTest extends BaseTest {
	@Test
	public void DeleteCreatedProduct() throws InterruptedException {

		//===========Step3. Click on Products module.====================================================

		HomePage homePage1 = new HomePage(driver);
		homePage1.getProductsLink().click();
		String Product_PageTitle="Products | Invoice Ninja";
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product Page is not displayed");
		
		//============Step4. Select the newly created product.===========================================

		ProductPage productPage = new ProductPage(driver);
		productPage.getMobileCheckBox().click();
		Assert.assertEquals(productPage.getMobileCheckBox().isSelected(), true, "Check box is not selected.");
		
		//============Step5. Navigate to Archive dropdoun and click.======================================

		productPage.getArchiveDropdown().click();
		Assert.assertEquals(productPage.getDeleteSelectedProduct().isDisplayed(), true, "Not clicking on dropdown.");
		
		//============Step6. Click on Delect Product===================================================== 
		
		productPage.getDeleteSelectedProduct().click();
		String depetePopUpAlert ="Are you sure?";
		Assert.assertEquals(productPage.getAlertPopUp().getText(), depetePopUpAlert, "Delete PopUp is not displayed");
		
		//============Step7. Click Yes on popup alert.=====================================================

		productPage.getAlertYesButton().click();
		Assert.assertEquals(driver.getTitle(),Product_PageTitle,"Product Page is not deleted");		
	}

}

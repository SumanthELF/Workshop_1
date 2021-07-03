package products;
/***
 * @author Pradnya
 */

 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import genericLibrary.ListenerImplementationClass;
import pomRepository.HomePage;
import pomRepository.ProductPage;
@Listeners(ListenerImplementationClass.class)
public class TC04_ProductsTest extends BaseTest {

	@Test
	public void cloneProduct() throws InterruptedException {
		ExcelUtil ex=new ExcelUtil();
		
		//=========================Step 1: Click on Products Link==========================================================
		HomePage  homepage =new HomePage(driver);
		homepage.getProductsLink().click();
		
		ProductPage productPage=new ProductPage(driver);
		
		//=============Step 2 :move curser to created product============================================================
		Actions action=new Actions(driver);	
		action.moveToElement(productPage.getCreatedProduct()).perform();
		
		//=================Step 3:click on select button===================================================================
		productPage.getSelectButton().click();
		//============Step 4:click on clone product link=============================================================
		productPage.getCloneProductLink().click();
		

	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,100);");
		
	    //======================Step 5: Click on Save Button========================================================================
		productPage.getSaveButton().click();
		
		////=========================Step 6: Click on Products Link==========================================================
		homepage.getProductsLink().click();
		Reporter.log("Product Cloned Successfully",true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

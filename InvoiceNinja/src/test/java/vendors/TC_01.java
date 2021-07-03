package vendors;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import pomRepository.VendorPage;
/***
 * 
 * @author nayanrajanna
 *
 */

public class TC_01 extends BaseTest{
	@Test
	public void newVendor() throws InterruptedException, AWTException
	{
		ExcelUtil excel=new ExcelUtil();
		String value = excel.readStringDataFromExcel("Vendors", 0, 0);
		String value1 = excel.readStringDataFromExcel("Vendors", 1, 0);
		HomePage homepage=new HomePage(driver);
		WebElement search = homepage.getSearchBox();
		search.sendKeys(value,Keys.ENTER);
		VendorPage vendorpage=new VendorPage(driver);
		vendorpage.getNameTextBox().sendKeys(value1);
		vendorpage.getSaveButton().click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"page-content-wrapper\"]/div/div[2]")).getText(), "Successfully created vendor");









	}

}



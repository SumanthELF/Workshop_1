package vendors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.VendorPage;
/***
 * 
 * @author nayanrajanna
 *
 */

public class TC_02 extends BaseTest {
	@Test
	public void editVendor() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		WebElement search = homepage.getSearchBox();
		search.sendKeys("new vendor",Keys.ENTER);
		VendorPage vendorpage=new VendorPage(driver);
		vendorpage.getNameTextBox().sendKeys("Nayan");
		vendorpage.getSaveButton().click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"page-content-wrapper\"]/div/div[2]")).getText(), "Successfully created vendor");
		Thread.sleep(5000);
		driver.navigate().back();
		vendorpage.getNameTextBox().clear();
		vendorpage.getNameTextBox().sendKeys("kumar");
		vendorpage.getSaveButton().click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"page-content-wrapper\"]/div/div[2]")).getText(), "Successfully created vendor");

	}

}

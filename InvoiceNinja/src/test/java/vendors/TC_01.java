package vendors;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.VendorPage;

public class TC_01 extends BaseTest{
	@Test
	public void newVendor() throws InterruptedException, AWTException
	{
		HomePage homepage=new HomePage(driver);
		WebElement search = homepage.getSearchBox();
		//WebElement search1 = homepage.getVendorsButton();
		search.sendKeys("new vendor",Keys.ENTER);
		VendorPage vendorpage=new VendorPage(driver);
		//vendorpage.getNewVendorButton().click();
		vendorpage.getNameTextBox().sendKeys("Nayan");
		vendorpage.getSaveButton().click();
		
		
		
		
	
		
			
				
			}
		
	}



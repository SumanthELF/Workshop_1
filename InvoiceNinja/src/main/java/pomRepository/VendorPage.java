package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author nayanrajanna
 *
 */

public class VendorPage extends BasePage {
	
	public VendorPage( WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[.='New Vendor ']")
	private WebElement VendorButton;
	
	@FindBy(id = "name")
	private WebElement nameTextBox;
	
	@FindBy(xpath = "//button[.='Save ']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[.='Edit Vendor']")
	private WebElement editButton;

	public WebElement getEditButton() {
		return editButton;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getNameTextBox() {
		return nameTextBox;
	}


	public WebElement getNewVendorButton() {
		return newVendorButton;
	}
	

}

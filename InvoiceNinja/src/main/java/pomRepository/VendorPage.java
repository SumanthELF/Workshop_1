package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage extends BasePage {
	
	public VendorPage( WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[.='New Vendor ']")
	private WebElement newVendorButton;
	
	@FindBy(id = "name")
	private WebElement nameTextBox;
	
	@FindBy(xpath = "//button[.='Save ']")
	private WebElement saveButton;

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

package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***
 * 
 * @author Aditya
 *
 */
public class ProductPage  extends BasePage{
	public ProductPage(WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//a[text()='New Product ']")
	private WebElement createNewProductButton;

	@FindBy(id="product_key")
	private WebElement productNameTextfield;

	@FindBy(name="notes")
	private WebElement notesTextfield;

	@FindBy(id="cost")
	private WebElement costTextfield;

	@FindBy(xpath="//button[text()='Save ']")
	private WebElement saveButton;

	@FindBy(xpath="//a[text()='Iphone 12']")
	private WebElement createdProduct;

	@FindBy(xpath="(//button[contains(.,' Select ')])[2]")
	private WebElement selectButton;

	@FindBy(xpath="(//a[text()='Clone Product'])[2]")
	private WebElement cloneProductLink;

	@FindBy(xpath="//a[text()='Cancel ']")
	private WebElement cancelButtonLink;

	@FindBy(xpath="//a[text()='Mobile']/../..//input[@type='checkbox']")
	private WebElement mobileCheckBox;

	@FindBy(xpath="//button[text()='Archive (1)']/..//button[@data-toggle='dropdown']")
	private WebElement archiveDropdown;

	@FindBy(xpath="//ul[@aria-labelledby='dLabel']//a[text()='Delete Product']")
	private WebElement deleteSelectedProduct;

	@FindBy(xpath="//button[text()='Yes']")
	private WebElement alertYesButton;

	@FindBy(xpath="//h2[text()='Are you sure?']")
	private WebElement alertPopUp;

	public WebElement getAlertPopUp() {
		return alertPopUp;
	}

	public WebElement getAlertYesButton() {
		return alertYesButton;
	}

	public WebElement getDeleteSelectedProduct() {
		return deleteSelectedProduct;
	}

	public WebElement getArchiveDropdown() {
		return archiveDropdown;
	}

	public WebElement getMobileCheckBox() {
		return mobileCheckBox;
	}

	public WebElement getCancelButtonLink() {
		return cancelButtonLink;
	}

	public WebElement getCloneProductLink() {
		return cloneProductLink;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getCreatedProduct() {
		return createdProduct;
	}

	public WebElement getCreateNewProductButton() {
		return createNewProductButton;
	}

	public WebElement getProductNameTextfield() {
		return productNameTextfield;
	}

	public WebElement getNotesTextfield() {
		return notesTextfield;
	}

	public WebElement getCostTextfield() {
		return costTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
}
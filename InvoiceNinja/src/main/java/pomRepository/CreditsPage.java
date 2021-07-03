package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author shraddha
 *
 */

public class CreditsPage {
	public CreditsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement statusTextfield;

	public WebElement getStatusTextfield() {
		return statusTextfield;
	}
	
	@FindBy(partialLinkText="Enter Credit")
	private WebElement enterCreditButton;

	@FindBy(xpath="//span[@data-dropdown='dropdown']")
	private WebElement selectClientDropdown;

	@FindBy(xpath="//button[text()='Save ']")
	private WebElement saveButton;

	@FindBy(id="myAccountButton")
	private WebElement myaccountButton;

	@FindBy(linkText="Log Out")
	private WebElement logOutButton;

	@FindBy(name="ids[]")
	private WebElement checkbox;

	@FindBy(xpath="//button[@class='btn btn-xs btn-default dropdown-toggle'][1]")
	private WebElement selectButton;

	@FindBy(linkText="Delete Credit")
	private WebElement deleteCreditButton;

	@FindBy(linkText="//button[text()='Yes']")
	private WebElement alert;

	@FindBy(xpath="//li[@data-value='aaaa bbbb'][1]")
	private WebElement selectClient;

	@FindBy(xpath="//button[text()='Yes']")
	private WebElement okButton;

	@FindBy(id="amount")
	private WebElement amountTextfield;

	@FindBy(id="balance")
	private WebElement balanceTextfield;

	@FindBy(id="credit_date")
	private WebElement creditDateTextfield;

	public WebElement getAmountTextfield() {
		return amountTextfield;
	}

	public WebElement getBalanceTextfield() {
		return balanceTextfield;
	}

	public WebElement getCreditDateTextfield() {
		return creditDateTextfield;
	}

	public WebElement getPublicnotesTextfield() {
		return publicnotesTextfield;
	}

	public WebElement getPrivatenotesTextfield() {
		return privatenotesTextfield;
	}

	public WebElement getSave1Button() {
		return save1Button;
	}

	public WebElement getClientTextField() {
		return clientTextField;
	}

	@FindBy(id="public_notes")
	private WebElement publicnotesTextfield;

	@FindBy(id="private_notes")
	private WebElement privatenotesTextfield;

	@FindBy(xpath="//button[@class='btn btn-success btn-lg' and @type='submit']")
	private WebElement save1Button;

	@FindBy(xpath="//input[@class='form-control' and @required='required']")
	private WebElement clientTextField;
	
	public WebElement getSelectClientDropdown() {
		return selectClientDropdown;
	}

	public WebElement getOkButton() {
		return okButton;
	}

	public WebElement getSelectClient() {
		return selectClient;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getDeleteCreditButton() {
		return deleteCreditButton;
	}

	public WebElement getAlert() {
		return alert;
	}
	public WebElement getEnterCreditButton() {
		return enterCreditButton;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getMyaccountButton() {
		return myaccountButton;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}
}

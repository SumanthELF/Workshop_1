package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author DevikaPatel
 *
 */
public class RecurringPage {

	public RecurringPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="saveButton")
	private WebElement markAsReadyButton;

	public WebElement getMarkAsReadyButton() {
		return markAsReadyButton;
	}

	@FindBy(xpath="//span[@data-bind='text: getClientDisplayName(ko.toJS(client()))']")
	private WebElement emailRecurringText;

	public WebElement getEmailRecurringText() {
		return emailRecurringText;
	}

	@FindBy(xpath="//button[text()='Yes']")
	private WebElement invoiceEmailPopup;

	public WebElement getInvoiceEmailPopup() {
		return invoiceEmailPopup;
	}

	@FindBy(name="ids[]")
	private WebElement clientCheckBox;

	public WebElement getClientCheckBox() {
		return clientCheckBox;
	}

	@FindBy(xpath="//button[contains(.,'Select')]")
	private WebElement selectDropdown;

	public WebElement getselectDropdown() {
		return selectDropdown;
	}

	@FindBy(xpath="//a[.='Clone To Quote']")
	private WebElement clonetoQuote;

	public WebElement getClonetoQuote() {
		return clonetoQuote;
	}

	@FindBy(xpath="//a[.='Clone To Invoice']")
	private WebElement clonetoInvoice;

	public WebElement getClonetoInvoice() {
		return clonetoInvoice;
	}

	@FindBy(xpath="//a[contains(.,'Recurring')]//following::a[contains(.,'Recurring')]")
	private WebElement recurringButton;

	public WebElement getRecurringButton() {
		return recurringButton;
	}

	@FindBy(xpath="//a[text()='New Recurring Invoice ']")
	private WebElement newRecurringInvoice;

	public WebElement getNewRecurringInvoice() {
		return newRecurringInvoice;
	}

	@FindBy(xpath="//span[@data-bind='text: getClientDisplayName(ko.toJS(client()))']")
	private WebElement sentclientNameText;

	public WebElement getSentClientNameText() {
		return sentclientNameText;
	}

	@FindBy(name="po_number")
	private WebElement poNumber;

	public WebElement getPoNumber() {
		return poNumber;
	}

	@FindBy(id="recurring_due_date")
	private WebElement recurringduedate;

	public WebElement getRecurringDueDate() {
		return recurringduedate;
	}

	@FindBy(xpath="//span[text()='Chandana']")
	private WebElement clientNameTextfield;

	public WebElement getClientNameTextfield() {
		return clientNameTextfield;
	}

	@FindBy(xpath="//input[@class='client-input form-control']")
	private WebElement clientinputtextfield;

	public WebElement getClientInputTextfield() {
		return clientinputtextfield;
	}

	@FindBy(name="invoice_items[0][cost]")
	private WebElement itemCost;

	public WebElement getItemCost() {
		return itemCost;
	}

	@FindBy(name="invoice_items[0][qty]")
	private WebElement itemQuantity;

	public WebElement getItemQuantity() {
		return itemQuantity;
	}

	@FindBy(xpath="//button[.='Save Draft ']")
	private WebElement saveDraftButton;

	public WebElement getSaveDraftButton() {
		return saveDraftButton;

	}
}


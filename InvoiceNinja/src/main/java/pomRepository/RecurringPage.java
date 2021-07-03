package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringPage {
	
	public RecurringPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[contains(.,'Recurring')]//following::a[contains(.,'Recurring')]")
	private WebElement archievedRecurring;

	public WebElement getArchievedRecurring() {
		return archievedRecurring;
	}

	@FindBy(partialLinkText="Got it!")
	private WebElement cookiesButton;

	public WebElement getCookiesButton() {
		return cookiesButton;
	}

	@FindBy(xpath="//input[@type='checkbox']//following::input[@type='checkbox']")
	private WebElement clientCheckBox;

	public WebElement getClientCheckBox() {
		return clientCheckBox;
	}

	@FindBy(xpath="//span[@class='caret']//following::span[@class='caret']")
	private WebElement archiveDropdown;

	public WebElement getArchiveDropdown() {
		return archiveDropdown;
	}

	@FindBy(partialLinkText="Archive Recurring Invoice")
	private WebElement archiveRecurringInvoice;

	public WebElement getArchiveRecurringInvoice() {
		return archiveRecurringInvoice;
	}

	@FindBy(xpath="//button[@data-toggle=\"dropdown\"]//following::button[@data-toggle=\"dropdown\"]//following::button[@data-toggle=\"dropdown\"]")
	private WebElement selectDropdown;

	public WebElement getSelectDropdown() {
		return selectDropdown;
	}

	@FindBy(partialLinkText="Clone To Invoice")
	private WebElement cloneToInvoice;

	public WebElement getCloneToInvoice() {
		return cloneToInvoice;
	}

	@FindBy(xpath="//input[@name='invoice_items[1][product_key]']")
	private WebElement products;

	public WebElement getProducts() {
		return products;
	}

	@FindBy(id="saveButton")
	private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
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

	@FindBy(xpath="//input[@class='client-input form-control']")
	private WebElement clientTextField;

	public WebElement getClientTextField() {
		return clientTextField;
	}

	@FindBy(xpath="//span[@class='glyphicon glyphicon-calendar']")
	private WebElement startDateCalendar;

	public WebElement getStartDateCalendar() {
		return startDateCalendar;
	}

	@FindBy(xpath="//td[.='5']")
	private WebElement startDate;

	public WebElement getStartDate() {
		return startDate;
	}


	@FindBy(xpath="//span[@class='glyphicon glyphicon-calendar']//following::span[@class='glyphicon glyphicon-calendar']//following::span[@class='glyphicon glyphicon-calendar']//following::span[@class='glyphicon glyphicon-calendar']")
	private WebElement endDateCalendar;

	public WebElement getEndDateCalendar() {
		return endDateCalendar;
	}


	@FindBy(xpath="//th[@class='next']")
	private WebElement nextCalendar;

	public WebElement getNextCalendar() {
		return nextCalendar;
	}

	@FindBy(name="po_number")
	private WebElement poNumber;

	public WebElement getPoNumber() {
		return poNumber;
	}

	@FindBy(id="recurring_due_date")
	private WebElement recurringduedate;

	public WebElement getRecurringduedate() {
		return recurringduedate;
	}

	@FindBy(xpath="//span[text()='Chandana']")
	private WebElement clientNameTextfield;

	public WebElement getClientNameTextfield() {
		return clientNameTextfield;
	}

	@FindBy(id="createClientLink")
	private WebElement createClientLink;

	public WebElement getCreateClientLink() {
		return createClientLink;
	}

	@FindBy(id="email0")
	private WebElement emailtextfield;

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	@FindBy(id="phone")
	private WebElement phonetextfield;

	public WebElement getPhonetextfield() {
		return phonetextfield;
	}

	@FindBy(id="client[currency_id]")
	private WebElement currencylistbox;

	public WebElement getCurrencylistbox() {
		return currencylistbox;
	}

	@FindBy(xpath="//input[@class='client-input form-control']")
	private WebElement clientinputtextfield;

	public WebElement getClientinputtextfield() {
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


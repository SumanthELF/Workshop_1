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
public class QuotesPage {

	public QuotesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[contains(.,'Quotes')]//following::a[contains(.,'Quotes')]")
	private WebElement quotesButton;

	public WebElement getQuotesButton() {
		return quotesButton;
	}
	
	@FindBy(linkText="Add contact +")
	private WebElement addContactText;

	public WebElement getAddContactText() {
		return addContactText;
	}

	public WebElement getSentClientNameText() {
		return sentClientNameText;
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

	@FindBy(id="saveButton")
	private WebElement markAsReadyButton;

	public WebElement getMarkAsReadyButton() {
		return markAsReadyButton;
	}

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement newQuoteButton;

	public WebElement getNewQuoteButton() {
		return newQuoteButton;
	}

	@FindBy(id="client[name]")
	private WebElement clientNameTextfield;

	public WebElement getClientNameTextfield() {
		return clientNameTextfield;
	}

	@FindBy(id="clientDoneButton")
	private WebElement doneButton;

	public WebElement getDoneButton() {
		return doneButton;
	}

	@FindBy(xpath="//a[text()='Edit Client']")
	private WebElement editClientLink;

	public WebElement getEditClientLink() {
		return editClientLink;
	}

	@FindBy(xpath="//a[text()='0037']")
	private WebElement quoteNumber;

	public WebElement getQuoteNumber() {
		return quoteNumber;
	}

	@FindBy(id="draftButton")
	private WebElement saveDraftButton;

	public WebElement getSaveDraftButton() {
		return saveDraftButton;
	}

	@FindBy(xpath="//*[@id=\"clientModal\"]/div[2]/div/div[3]/button[1]")
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}

	@FindBy(xpath="//input[@class='client-input form-control']")
	private WebElement clientTextField;

	public WebElement getClientTextField() {
		return clientTextField;
	}

	@FindBy(xpath="//span[@data-bind='text: getClientDisplayName(ko.toJS(client()))']")
	private WebElement sentClientNameText;

	public WebElement getsentClientNameText() {
		return sentClientNameText;
	}

	@FindBy(xpath="//input[@class='client-input form-control']")
	private WebElement clientInputTextfield;

	public WebElement getClientInputTextfield() {
		return clientInputTextfield;
	}

	@FindBy(id="clientModalLabel")
	private WebElement clientText;

	public WebElement getClientText() {
		return clientText;
	}

	@FindBy(id="saveButton")
	private WebElement markSentButton;

	public WebElement getMarkSentButton() {
		return markSentButton;
	}

	@FindBy(xpath="//input[@id='invoice_number']")
	private WebElement quoteNumberTextfield;

	public WebElement getQuoteNumberTextfield() {
		return quoteNumberTextfield;
	}

	@FindBy(xpath="//button[text()='×']")
	private WebElement closeSymbol;

	public WebElement getCloseSymbol() {
		return closeSymbol;
	}

}


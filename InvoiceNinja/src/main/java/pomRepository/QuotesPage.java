package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage {

	public QuotesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='nav-link active']")
	private WebElement quotesButton;

	public WebElement getQuotesButton() {
		return quotesButton;
	}

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement newQuoteButton;

	public WebElement getNewQuoteButton() {
		return newQuoteButton;
	}

	@FindBy(id="createClientLink")
	private WebElement createNewClientLink;

	public WebElement getCreateNewClientLink() {
		return createNewClientLink;
	}

	@FindBy(id="//input[@class='client-input form-control']")
	private WebElement clientNameTextfield;

	public WebElement getClientName() {
		return clientNameTextfield;
	}

	@FindBy(id="first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(id="last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
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

	@FindBy(xpath="//a[text()='view Client']")
	private WebElement viewClientLink;

	public WebElement getViewClientLink() {
		return viewClientLink;
	}

	@FindBy(xpath="//a[text()='0002']")
	private WebElement quoteNumber;

	public WebElement getQuoteNumber() {
		return quoteNumber;
	}

	@FindBy(id="draftButton")
	private WebElement saveDraftButton;

	public WebElement getSaveDraftButton() {
		return saveDraftButton;
	}

	@FindBy(xpath="//*[@id=\\\"clientModal\\\"]/div[2]/div/div[1]/button")
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}

	@FindBy(id="clientModalLabel")
	private WebElement clientText;

	public WebElement getClientText() {
		return clientText;
	}



}


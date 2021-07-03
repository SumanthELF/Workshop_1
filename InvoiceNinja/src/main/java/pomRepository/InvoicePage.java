package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***
 * 
 * @author Dhanraj MV
 *
 */
public class InvoicePage extends BasePage{

	public InvoicePage(WebDriver driver) {
		super(driver); 
	}
	
	@FindBy(partialLinkText="New Invoice")
	private WebElement newInvoice;
	
	@FindBy(name="invoice_items[0][product_key]")
	private WebElement itemTextField;
	
	@FindBy(name="invoice_items[0][notes]")
	private WebElement itemDescription;
	
	@FindBy(name="invoice_items[0][cost]")
	private WebElement costTextField;
	
	@FindBy(name="invoice_items[0][qty]")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@id='draftButton']")
	private WebElement saveDraft;
	
	@FindBy(xpath="(//th[text()='»'])[1]")
	private WebElement forwardButton;
	
	public WebElement getForwardButton() {
		return forwardButton;
	}
	@FindBy(xpath="(//label[contains(text(),'Due Date')]/..//span[@class='input-group-addon'])[1]")
	private WebElement dueIcon;
	
	public WebElement getDueIcon() {
		return dueIcon;
	}

	@FindBy(xpath="//th[text()='September 2021']/../../..//td[text()='15']")
	private WebElement dueDate;
	
	public WebElement getDueDate() {
		return dueDate;
	}

	@FindBy(id="client[name]")
	private WebElement client;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="email0")
	private WebElement email;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(linkText="Got it!")
	private WebElement gotit;
	
	@FindBy(xpath="//button[contains(.,'Done')]")
	private WebElement done;

	public WebElement getNewInvoice() {
		return newInvoice;
	}

	public WebElement getItemTextField() {
		return itemTextField;
	}

	public WebElement getItemDescription() {
		return itemDescription;
	}

	public WebElement getCostTextField() {
		return costTextField;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSaveDraft() {
		return saveDraft;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGotit() {
		return gotit;
	}

	public WebElement getDone() {
		return done;
	}
	
			
}

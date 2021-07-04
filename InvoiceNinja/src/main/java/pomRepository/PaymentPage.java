package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
	public PaymentPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath ="//Li[@class='nav-payments ']")
			private WebElement paymentTextfield;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus-sign']")
	private WebElement paymenticon;
	
	@FindBy(id="saveButton")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class=\"glyphicon glyphicon-remove-circle\"]")
	private WebElement cancelButton;

	@FindBy(id="myAccountButton")
	private WebElement accountButton;
	
	@FindBy(xpath = "//a[text()='Add Company']")
	private WebElement addcompanytextfield;
	
	@FindBy(id="terms_checkbox")
	private WebElement termscheckbox;
	
	@FindBy(id="privacy_checkbox")
	private WebElement privacycheckbox;
	 
	@FindBy(id="new_first_name")
	private WebElement firstnametextfield;
	
	@FindBy(name="new_last_name")
	private WebElement lastnametextfield;
	
	@FindBy(id="new_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="saveSignUpButton")
	private WebElement savebutton;

	public WebElement getPaymentTextfield() {
		return paymentTextfield;
	}

	public WebElement getPaymenticon() {
		return paymenticon;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getAddcompanytextfield() {
		return addcompanytextfield;
	}

	public WebElement getTermscheckbox() {
		return termscheckbox;
	}

	public WebElement getPrivacycheckbox() {
		return privacycheckbox;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	}
	


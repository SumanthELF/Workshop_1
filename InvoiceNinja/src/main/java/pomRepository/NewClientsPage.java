package pomRepository;
/***
 * @author Aditya
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewClientsPage {
	public NewClientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="name")

	private WebElement name;

	public WebElement getName() {
		return name;

	}
	@FindBy(id="id_number")
	private WebElement idNumber;

	public WebElement getIdNumber() {
		return idNumber;

	}
	@FindBy(id="vat_number")
	private WebElement vatNumber;

	public WebElement getVatNumber() {
		return vatNumber;
	}
	@FindBy(id="website")
	private WebElement website;

	public WebElement getWebsite() {
		return vatNumber;
	}
	@FindBy(id="work_phone")
	private WebElement workPhone;

	public WebElement getWorkPhone() {
		return workPhone;

	}
	@FindBy(id="first_name")
	private WebElement firstName;

	public WebElement getfirstName() {
		return firstName;
	}
	@FindBy(id="last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id="email0")
	private WebElement email;

	public WebElement getEmail() {
		return email;

	}
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone1;

	public WebElement getphone1() {
		return phone1;
	}
	@FindBy(xpath="//button[text()='Save ']")
	private WebElement saveButton;

	@FindBy(id="currency_id")
	private WebElement currency;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getPhone1() {
		return phone1;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getPaymentTerms() {
		return paymentTerms;
	}

	public WebElement getTaskRate() {
		return taskRate;
	}

	@FindBy(id="language_id")
	private WebElement language;

	@FindBy(id="payment_terms")
	private WebElement paymentTerms;

	@FindBy(id="task_rate") 
	private WebElement taskRate;

	public WebElement getSaveButton() {
		return saveButton;

	}
}
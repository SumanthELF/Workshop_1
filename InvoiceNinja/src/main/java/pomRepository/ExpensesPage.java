package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage extends BasePage {
	
	public ExpensesPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="vendor_name")
	private WebElement vendor;
	
	@FindBy(id="expense_category_name")
	private WebElement category;
	
	@FindBy(xpath="//input[@placeholder='US Dollar']")
	private WebElement currency;
	
	public WebElement getCurrency() {
		return currency;
	}

	@FindBy(id="amount")
	private WebElement amount;
	
	@FindBy(xpath="//label[text()='Client']/..//input[@autocomplete='off'] 	")
	private WebElement Client;
	
	@FindBy(xpath="//label[text()='Mark billable']")
	private WebElement Markbillable;
	
	@FindBy(xpath="//label[text()='Mark paid']")
	private WebElement Markpaid ;
	
	@FindBy(id="private_notes")
	private WebElement privatenotes ;
	
	@FindBy(id="payment_date")
	private WebElement payment_date ;
	

	@FindBy(xpath="//td[text()='17']")
	private WebElement Date ;

	@FindBy(id="search")
	private WebElement searchTextField;
	
	@FindBy(xpath="//a[text()='Enter Expense ']")
	private WebElement ExpenseLink;
	
	@FindBy(id="vendor_name")
	private WebElement vendorNmaeTextField;
	
	@FindBy(id="expense_category_name")
	private WebElement CatogariTextField;
	
	@FindBy(id="amount")
	private WebElement amountTextField;
	
	@FindBy(xpath="//input[@placeholder='US Dollar']") 
	private WebElement USDollarTextField;
	
	@FindBy(xpath="//i[@class='glyphicon glyphicon-calendar']") 
	private WebElement SelectCalender;
	
	@FindBy(xpath="//td[@class='today active day']")
	private WebElement SelectDate;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveButton;
	
	@FindBy(xpath="//a[text()='vinod kinagi'")
	private WebElement SelectExpenses;

	@FindBy(xpath="//td[@class='today active day']") 
	private WebElement SelectDate1;
	
	public WebElement getSelectExpenses() {
		return SelectExpenses;
	}
	
	public WebElement getSelectDate1() {
		return SelectDate1;}


	
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public WebElement getExpenseLink() {
		return ExpenseLink;
	}
	public WebElement getVendorNmaeTextField() {
		return vendorNmaeTextField;
	}
	public WebElement getCatogariTextField() {
		return CatogariTextField;
	}
	public WebElement getAmountTextField() {
		return amountTextField;
	}
	public WebElement getUSDollarTextField() {
		return USDollarTextField;
	}
	public WebElement getSelectCalender() {
		return SelectCalender;
	}
	public WebElement getSelectDate() {
		return SelectDate;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	

	@FindBy(xpath="//th[text()='July 2021']")
	private WebElement monthyear;
	
	public WebElement getPayment_date() {
		return payment_date;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getMonthyear() {
		return monthyear;
	}

	@FindBy(id="public_notes")
	private WebElement  publicnotes;
	
	@FindBy(id="transaction_reference")
	private WebElement  transaction_reference;
	
	@FindBy(xpath="//label[text()='Payment Type']/../..//input[@autocomplete='off']")
	private WebElement  paymentType;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement  savebutton;

	public WebElement getVendor() {
		return vendor;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getAmount() {
		return amount;
	}

	
	public WebElement getClient() {
		return Client;
	}

	public WebElement getMarkbillable() {
		return Markbillable;
	}

	public WebElement getMarkpaid() {
		return Markpaid;
	}

	public WebElement getPrivatenotes() {
		return privatenotes;
	}

	public WebElement getPublicnotes() {
		return publicnotes;
	}

	public WebElement getTransaction_reference() {
		return transaction_reference;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	
}

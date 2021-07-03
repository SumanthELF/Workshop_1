package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***
 * 
 * @author Sumanth
 *
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver){
		super(driver);
	}
	@FindBy(partialLinkText="Projects")
	private WebElement projectsTab;
	
	@FindBy(linkText="Clients")
	private WebElement ClientsButton;
	
	@FindBy(linkText="Credits")
	private WebElement CreditsButton;
	
	public WebElement getClientsButton() {
		return ClientsButton;
	}

	public WebElement getCreditsButton() {
		return CreditsButton;
	}

	public WebElement getProjectsTab() {
		return projectsTab;
	}
	@FindBy(id="myAccountButton")
	private WebElement guestDropDown;
	
	@FindBy(linkText="Log Out")
	private WebElement logOut;
	
	@FindBy(xpath="//button[contains(text(),'Delete Account')]")
	private WebElement logOutDeleteButton;

	@FindBy(id="closeSignUpButton")
	private WebElement closeSignUpButton;
	

	@FindBy(xpath = "//li[@class='nav-vendors ']")
	private WebElement vendorsButton;
	
	@FindBy(xpath="//a[text()='Enter Expense ']")
	private WebElement EnterExpenses;
	
	@FindBy(id = "search")
	private WebElement searchBox;
	
	@FindBy(xpath="(//a[contains(.,'Invoices')])[2]")
	private WebElement invoice; 
	
  	@FindBy(linkText="Clients")
	private WebElement clientLink;
	
	@FindBy(linkText="Products") 
	private WebElement productsLink;
	
	
	public WebElement getEnterExpenses() {
		return EnterExpenses;
	}
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getVendorsButton() {
		return vendorsButton;
	}
	
  
	public WebElement getInovice() {
		return invoice;
	}
	
	public WebElement getClientLink() {
		return clientLink;
	}

	public WebElement getProductsLink() {
		return productsLink;

	}

	public WebElement getGuestDropDown() {
		return guestDropDown;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLogOutDeleteButton() {
		return logOutDeleteButton;
	}
	
	public WebElement getCloseSignUpButton() {
		
		return closeSignUpButton;
	}

	//Business Logics
	public void logOut() {
		getGuestDropDown().click();
		getLogOut().click();
	}
}

	


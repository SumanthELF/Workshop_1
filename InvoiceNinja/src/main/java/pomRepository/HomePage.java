package pomRepository;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
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
	
	
	public WebElement getEnterExpenses() {
		return EnterExpenses;
	}
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getVendorsButton() {
		return vendorsButton;
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

	


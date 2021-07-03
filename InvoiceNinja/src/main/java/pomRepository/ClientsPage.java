package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {
	public ClientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'New Client ')] ")

	private WebElement newClients;

	public WebElement getnewClients() {
		return newClients;
	}
	
	@FindBy(xpath="//button[contains(text(),'Select ')]")
	private WebElement editClientDropdown;

	public WebElement getEditClientDropdown() {
		return editClientDropdown;
	}
	@FindBy(xpath="//button[contains(text(),'Select ')]")
	private WebElement selectDropdown;

	public WebElement getselectDropdown() {
		return selectDropdown;
	}
	
	@FindBy(linkText="Edit Client")
	private WebElement editClient;

	public WebElement geteditClient() {
		return editClient;
	}

}
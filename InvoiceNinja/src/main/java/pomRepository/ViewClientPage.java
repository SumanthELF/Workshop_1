package pomRepository;
/***
 *@author Aditya
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewClientPage {
	public ViewClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='View Statement ']")
	private WebElement viewStatement;

	public WebElement getViewStatement() {
		return viewStatement;

	}

	@FindBy(linkText="Edit Client")
	private WebElement editClient;

	public WebElement geteditClient() {
		return editClient;
	}
}
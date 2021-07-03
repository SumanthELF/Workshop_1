package pomRepository;
/***
 * @author Aditya
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductPage {
	public NewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="product_key")
	private WebElement productTextField;
	
	@FindBy(id="notes") 
	private WebElement notesTextAreaField;
	
	@FindBy(id="cost")
	private WebElement costTextField;
	
	@FindBy(linkText="Cancel ")
	private WebElement cancelButton;
	
	@FindBy(xpath="//button[text()='Save ']")
	private WebElement savelButton;

	public WebElement getProductTextField() {
		return productTextField;
	}

	public WebElement getNotesTextAreaField() {
		return notesTextAreaField;
	}

	public WebElement getCostTextField() {
		return costTextField;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getSavelButton() {
		return savelButton;
	}
}

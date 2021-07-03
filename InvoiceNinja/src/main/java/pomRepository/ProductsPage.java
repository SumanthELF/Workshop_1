package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="New Product ")
	private WebElement newProductLink;
	
	@FindBy(xpath="//ul[@class='select2-selection__rendered']")
	private WebElement status;
	
	@FindBy(xpath="//input[@class='selectAll']")
	private WebElement elementCheckBox;

	public WebElement getNewProductLink() {
		return newProductLink;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getElementCheckBox() {
		return elementCheckBox;
	}
}

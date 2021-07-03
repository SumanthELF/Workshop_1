package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatusPage {
	public StatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='View Client']/..//button[@class='btn btn-default']")
	private WebElement viewStatus;

	public WebElement getViewStatement() {
		return viewStatus;
 }
}
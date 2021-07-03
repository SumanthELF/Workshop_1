package invoices;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pomRepository.HomePage;
import pomRepository.InvoicePage;
import pomRepository.LoginPage;
/***
 * 
 * @author Aisha
 *
 */
public class TC_03InvoiceTest  {

	@Test
	public void login() throws Exception {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://app.invoiceninja.com/dashboard");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.getUsernameTextField().sendKeys("sumanth.l@testyantra.com");;
	loginpage.getPasswordTextField().sendKeys("admin@123");
	loginpage.getLoginButton().click();
	
	HomePage homepage =new HomePage(driver);
	homepage.getInovice().click();
		
	InvoicePage invoice=new InvoicePage(driver);
	invoice.getNewInvoice().click();
	invoice.getDiscountButton().click();
	
	WebElement saveDraftButton = invoice.getSaveDraft();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",saveDraftButton);	
	invoice.getClient().sendKeys("aisha");
	invoice.getFirstName().sendKeys("123");
	invoice.getLastName().sendKeys("naz");
	invoice.getEmail().sendKeys("nazaisha150@gmail.com");
	invoice.getPhone().sendKeys("15454545");
	invoice.getGotit().click();
	invoice.getDone().click();
	invoice.getSaveDraft().click();
	
	homepage.getGuestDropDown().click();
	homepage.getLogOut().click();
	}
}

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
 * @author Dhanraj MV
 *
 */
public class TC_02InvoiceTest  {

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
	invoice.getDueIcon().click();
	for (;;) {
		try {
			invoice.getDueDate().click();
			break;
		}catch (Exception e) {
			invoice.getForwardButton().click();
		}
	}
	WebElement saveDraftButton = invoice.getSaveDraft();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",saveDraftButton);	
	invoice.getClient().sendKeys("DannyDhanraj");
	invoice.getFirstName().sendKeys("danny");
	invoice.getLastName().sendKeys("Dhanraj");
	invoice.getEmail().sendKeys("dhanrajmurthyv@gmail.com");
	invoice.getPhone().sendKeys("1234545");
	invoice.getGotit().click();
	invoice.getDone().click();
	invoice.getSaveDraft().click();
	
	homepage.getGuestDropDown().click();
	homepage.getLogOut().click();
	}
}

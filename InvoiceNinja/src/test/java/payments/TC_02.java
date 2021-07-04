package payments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.PaymentPage;

public class TC_02 {

	
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
//	homepage.getPaymentTextfield().click();
	//
	
	
	PaymentPage payment=new PaymentPage(driver);
	payment.getAccountButton().click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();",addcompanytextfield);
	WebElement addcompanytextfield = payment.getAddcompanytextfield();
	js.executeScript("arguments[0].click();",addcompanytextfield);
	WebElement termsCheckBox = payment.getTermscheckbox();
	js.executeScript("arguments[0].click();", termsCheckBox);
	WebElement privacyCheckBox = payment.getPrivacycheckbox();
	js.executeScript("arguments[0].click();", privacyCheckBox);
	payment.getFirstnametextfield().sendKeys("Tanu");
	payment.getLastnametextfield().sendKeys("sha");
	payment.getEmailtextfield().sendKeys("tanu24@gmail.com");
	payment.getPasswordtextfield().sendKeys("admin@123");
	payment.getCancelButton().click();
	payment.getPaymentTextfield().click();
	payment.getPaymenticon().click();
	homepage.getGuestDropDown().click();
	homepage.getLogOut().click();
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,1000)");
	payment.getCancelButton().click();
        homepage.getGuestDropDown().click();
	homepage.getLogOut().click();
}
}

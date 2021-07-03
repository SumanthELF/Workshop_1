package projects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProjectPage;

public class TC_04Projects extends BaseTest{
	@Test
	public void projectspage(){
		HomePage homepage = new HomePage(driver);
		ProjectPage project = new ProjectPage (driver);
		homepage.getProjectsTab().click();
		project.getNewProjectButton().click();
		project.getClientTextField().sendKeys("tyss",Keys.ENTER);
		project.getProjectNametextfield().sendKeys("dinga");
		project.getEnterduedate().sendKeys(Keys.ENTER);
		project.getEnterbudgethours().sendKeys("2");
		project.getEntertaskrate().sendKeys("20.20");
		project.getEnterprivatenotes().sendKeys("hello");
		WebElement cancel = project.getClickcancelbutton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancel);
	}
}

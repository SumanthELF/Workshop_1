package projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import pomRepository.ProjectPage;

public class TC_004Test extends BaseTest {
	public void ClickNewProjects(){
		ExcelUtil read = new ExcelUtil();
		HomePage home = new HomePage(driver);
		home.getProjectsTab();
		ProjectPage project = new ProjectPage(driver);
		project.getClientTextField().sendKeys(readExcelData.readStringDataFromExcel("Projects",0,0));
		project.getProjectNametextfield().sendKeys(readExcelData.readStringDataFromExcel("Projects",0,1));
		project.getEnterduedate().sendKeys(readExcelData.readAnyDataFromExcelInString("Projects", 1, 0));
		project.getEnterbudgethours().sendKeys(readExcelData.readAnyDataFromExcelInString("Projects", 1, 1));
		project.getEntertaskrate().sendKeys(readExcelData.readAnyDataFromExcelInString("Projects", 1,2));
		project.getEnterprivatenotes().sendKeys(readExcelData.readAnyDataFromExcelInString("Projects", 0, 2));
		WebElement cancel = project.getClickcancelbutton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancel);
	}

}

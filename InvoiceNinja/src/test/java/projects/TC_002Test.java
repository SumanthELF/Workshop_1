package projects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import pomRepository.ProjectPage;
/***
 * 
 * @author shraddha
 *
 */

public class TC_002Test extends BaseTest {
	@Test
	public void resumeTaskAndStopAndCancel() {
		HomePage home=new HomePage(driver);
		ProjectPage project=new ProjectPage(driver);
		ExcelUtil excelData=new ExcelUtil();
		//Click on projects tab
		//=======================================================================================================================================================================================
		home.getProjectsTab().click();
		//Create new project
		//=======================================================================================================================================================================================
		project.getNewProjectButton().click();
		project.getClientTextField().sendKeys(excelData.readStringDataFromExcel("Projects",0,0),Keys.ENTER);
		project.getProjectNametextfield().sendKeys(excelData.readStringDataFromExcel("Projects",0,1));
		WebElement save = project.getSaveButton();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",save);
		//Create new task set the timer and stop the timer and resume
		//=======================================================================================================================================================================================
		project.getNewTaskButton().click();
		project.getDescriptionTextfield().sendKeys(excelData.readStringDataFromExcel("Projects",0,2));
		project.getStartButton().click();
		WebElement stop = project.getStoputton();
		js.executeScript("arguments[0].click();", stop);
		WebElement resume = project.getResumeButton();
		js.executeScript("arguments[0].click();", resume);		
			
	}

}


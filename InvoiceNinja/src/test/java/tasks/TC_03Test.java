package tasks;

	/***
	 * @Author Chandana
	 * @Reviewed by NayanKumar
	 */
	import org.openqa.selenium.Keys;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import genericLibrary.BaseTest;
	import genericLibrary.ExcelUtil;
	import pomRepository.TaskPage;

	public class TC_03Test extends BaseTest {
		TaskPage taskPage;
		ExcelUtil exelUtil;

		/**
		 * This method is used to creat the new task under "ready to do"
		 */

		@Test
		public void tasks() {
			taskPage=new TaskPage(driver);
			//	String ModuleName=exelUtil.readStringDataFromExcel(Tasks, 0, 0);
			taskPage.getSearchBar().sendKeys("Tasks",Keys.ENTER);
			Assert.assertEquals(driver.getTitle(), "Tasks | Invoice Ninja", "Tasks page not displayed");
			Reporter.log("Task page is dispalyed successfully",true);
			taskPage.getKanbanlink().click();
			Assert.assertEquals(driver.getTitle(), "Kanban | Invoice Ninja", "kanban page not displayed");
			Reporter.log("kanban page is dispalyed successfully",true);
			taskPage.getClickNewTask().click();
			exelUtil=new ExcelUtil();
			//String taskName=exelUtil.readStringDataFromExcel(Tasks, 0, 1);
			taskPage.getNewtasksendvalue().sendKeys("health");
			taskPage.getSaveButton().click();
		}
	}





	package tasks;
	/***
	 * @Author Chandana
	 * @reviewed by NayanKumar
	 */
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import genericLibrary.BaseTest;
	import genericLibrary.ExcelUtil;
	import pomRepository.TaskPage;

	public class TC_04Test extends BaseTest {
		TaskPage taskPage;
		ExcelUtil exelUtil;
		/**
		 * This method is used to drag and drop the task from one status to another status
		 */
		@Test
		public void tasks() {
			taskPage=new TaskPage(driver);
			//String ModuleName=exelUtil.readStringDataFromExcel(Tasks, 0, 0);
			//taskPage.getSearchBar().sendKeys(ModuleName,Keys.ENTER);
			taskPage.getSearchBar().sendKeys("Tasks",Keys.ENTER);
			Assert.assertEquals(driver.getTitle(), "Tasks | Invoice Ninja", "Tasks page not displayed");
			Reporter.log("Task page is dispalyed successfully",true);
			taskPage.getKanbanlink().click();
			Assert.assertEquals(driver.getTitle(), "Kanban | Invoice Ninja", "kanban page not displayed");
			Reporter.log("kanban page is dispalyed successfully",true);
			Actions act=new Actions(driver);
			act.dragAndDrop(taskPage.getDragfromBacklog(),taskPage.getDropToDone()).perform();
		}
	}



package tasks;

	import org.openqa.selenium.Keys;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	import genericLibrary.BaseTest;
import pomRepository.TaskPage;
import pomRepository.TaskPage;
	/***
	 * 
	 * @author Savita
	 *
	 */
	public class TC_01TasksTest extends BaseTest{
		@Test
		public void Tasks() throws InterruptedException{
			TaskPage tasks=new TaskPage(driver);
			tasks.getSearchtextFiled().sendKeys("Tasks",Keys.ENTER);
			Assert.assertEquals(driver.getTitle(), "Tasks | Invoice Ninja","tasks page not displayed");
			Reporter.log("tasks page is displayed ",true);
			tasks.getNewtasklink().click();
			Assert.assertEquals(driver.getTitle(),"New Task | Invoice Ninja","Create new task page not displayed ");
			Reporter.log("Create new task page is displayed", true);
			tasks.getClienttextfield().sendKeys("abc",Keys.ENTER);
			Thread.sleep(2000);
			tasks.getProjecttextfield().sendKeys("book",Keys.ENTER);
			Thread.sleep(7000);
			tasks.getDescription().sendKeys("it is CRM Project",Keys.ENTER);
			tasks.getStartbutton().click();
			Assert.assertEquals(driver.getTitle(), "Edit Task | Invoice Ninja","task is not created");
			Reporter.log("task is successfully created ",true);
			tasks.getSaveButton().click();
			Assert.assertEquals(driver.getTitle(), "Edit Task | Invoice Ninja","task is not updated");
			Reporter.log("task is successfully updated ",true);


		}


}

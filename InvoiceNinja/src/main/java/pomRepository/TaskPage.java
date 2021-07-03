package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage {

	public TaskPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[text()='Backlog']/../../..//textarea[contains(@data-bind,'value: descripti')]") 
	private WebElement newtasksendvalue;
	
	@FindBy(xpath="//a[contains(text(),'Kanban')] ")
	private WebElement kanbanlink;
	
	@FindBy(xpath="//div[text()='Backlog']/../../..//a[contains(text(),'New Task...')]")
	private WebElement clickNewTask;
	
	@FindBy(xpath="//div[text()='Backlog']/../../..//button[contains(text(),'Save')]") 
	private WebElement saveButton;
	
	@FindBy(id="search")
	private WebElement searchBar;
	
	@FindBy(xpath="//div[text()='Backlog']/../../..//div[text()='health']")
	private WebElement DragfromBacklog;
	
	@FindBy(xpath="//div[text()='Done']/../../..//a[contains(text(),'New Task...')]")
	private WebElement DropToDone; 
	
	public WebElement getDragfromBacklog() {
		return DragfromBacklog;
	}

	public WebElement getDropToDone() {
		return DropToDone;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getKanbanlink() {
		return kanbanlink;
	}
	public WebElement getClickNewTask() {
		return clickNewTask;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getNewtasksendvalue() {
		return newtasksendvalue;
	
}
}

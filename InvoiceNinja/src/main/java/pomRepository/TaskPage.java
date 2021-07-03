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
	

	//@FindBy(id="search")
	//private WebElement searchtextFiled;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	private WebElement taskslink;
	
	@FindBy(linkText="New Task")
	private WebElement Newtasklink;
	
	@FindBy(id="client")
	private WebElement clienttextfield;
	
	@FindBy(xpath=("//span[@data-dropdown='dropdown']"))
	private WebElement clientdropdown;
	
	public WebElement getTaskslink() {
		return taskslink;
	}

	public WebElement getNewtasklink() {
		return Newtasklink;
	}

	public WebElement getClienttextfield() {
		return clienttextfield;
	}

	public WebElement getClientdropdown() {
		return clientdropdown;
	}

	public WebElement getProjectname() {
		return projectname;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getTimerradiobutton() {
		return timerradiobutton;
	}

	public WebElement getStartbutton() {
		return startbutton;
	}

	public WebElement getManualradiobutton() {
		return manualradiobutton;
	}

	public WebElement getStarttime() {
		return starttime;
	}
	@FindBy(id="project_name")
	private WebElement projectname;
	
	@FindBy(id="description")
	private WebElement description;
	
	@FindBy(xpath="//label[contains(text(),'Timer')]")
	private WebElement timerradiobutton;
	
	@FindBy(id="start-button")
	private WebElement startbutton;
	
	@FindBy(xpath="//label[contains(text(),'Manual')]")
	private WebElement manualradiobutton;
	
	@FindBy(xpath="//input[@placeholder='Start Time']")
	private WebElement starttime;
	
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

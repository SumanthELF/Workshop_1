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
	private WebElement taskslink1;
	
	@FindBy(linkText="New Task")
	private WebElement Newtasklink1;
	
	@FindBy(id="client")
	private WebElement clienttextfield1;
	
	@FindBy(xpath=("//span[@data-dropdown='dropdown']"))
	private WebElement clientdropdown;
	@FindBy(id="search")
	private WebElement searchtextFiled;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	private WebElement taskslink;

	@FindBy(linkText="New Task")
	private WebElement Newtasklink;

	@FindBy(xpath="//label[text()='Client']/..//input[@autocomplete='off']")
	private WebElement clienttextfield;

	@FindBy(id="project_name")
	private WebElement projecttextfield;
	
	@FindBy(id="description")
	private WebElement description1;
	
	@FindBy(xpath="//label[contains(text(),'Timer')]")
	private WebElement timerradiobutton1;
	
	@FindBy(id="start-button")
	private WebElement startbutton1;
	
	@FindBy(xpath="//label[contains(text(),'Manual')]")
	private WebElement manualradiobutton1;
	
	@FindBy(xpath="//input[@placeholder='Start Time']")
	private WebElement starttime1;
	
	@FindBy(xpath="//div[text()='1:15 PM']")
	private WebElement starttimepop;
	
	@FindBy(xpath="//div[text()='1:45 PM']")
	private WebElement endtimepop;
	
	@FindBy(id="resume-button")
	private WebElement resumebutton;
	
	@FindBy(id="stop-button")
	private WebElement stopbutton;
	
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
	
	public WebElement getTaskslink1() {
		return taskslink1;
	}

	public WebElement getNewtasklink1() {
		return Newtasklink1;
	}

	public WebElement getClienttextfield1() {
		return clienttextfield1;
	}

	public WebElement getDescription1() {
		return description1;
	}

	public WebElement getTimerradiobutton1() {
		return timerradiobutton1;
	}

	public WebElement getStartbutton1() {
		return startbutton1;
	}

	public WebElement getManualradiobutton1() {
		return manualradiobutton1;
	}

	public WebElement getStarttime1() {
		return starttime1;
	}

	public WebElement getResumebutton() {
		return resumebutton;
	}

	public WebElement getStopbutton() {
		return stopbutton;
	}

	public WebElement getSearchtextFiled() {
		return searchtextFiled;
	}

	public WebElement getProjecttextfield() {
		return projecttextfield;
	}

	public WebElement getStarttimepop() {
		return starttimepop;
	}

	public WebElement getEndtimepop() {
		return endtimepop;
	}

	public WebElement getTaskslink() {
		return taskslink1;
	}

	public WebElement getNewtasklink() {
		return Newtasklink1;
	}

	public WebElement getClienttextfield() {
		return clienttextfield1;
	}

	public WebElement getClientdropdown() {
		return clientdropdown;
	}

	public WebElement getProjectname() {
		return projectname;
	}

	public WebElement getDescription() {
		return description1;
	}

	public WebElement getTimerradiobutton() {
		return timerradiobutton1;
	}

	public WebElement getStartbutton() {
		return startbutton1;
	}

	public WebElement getManualradiobutton() {
		return manualradiobutton1;
	}

	public WebElement getStarttime() {
		return starttime1;
	}
	
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

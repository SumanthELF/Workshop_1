package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author shraddha
 *
 */
public class ProjectPage {
	WebDriver driver;
	public ProjectPage(WebDriver driver){
		PageFactory.initElements( driver,this);
		this.driver=driver;
		
	}
	
	@FindBy(linkText="New Project")
	private WebElement newProjectButton;
	
	@FindBy(xpath="//input[@class='form-control' and @required='required']")
	private WebElement clientTextField;
	
	@FindBy(id="name")
	private WebElement projectNametextfield;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-lg' and @type='submit']")
	private WebElement saveButton;
	
	@FindBy(linkText="New Task")
	private WebElement newTaskButton;
	
	@FindBy(id="description")
	private WebElement descriptionTextfield;
	
	@FindBy(id="start-button")
	private WebElement startButton;
	
	@FindBy(id="stop-button")
	private WebElement stoputton;
	
	@FindBy(id="save-button")
	private WebElement taskSaveButton;
	
	@FindBy(id="resume-button")
	private WebElement resumeButton;
	
	@FindBy(id="Cancel")
	private WebElement cancelButton;
	
	@FindBy(id="due_date")
	private WebElement enterduedate;
	
	@FindBy(id="budgeted_hours")
	private WebElement enterbudgethours;
	
	@FindBy(id="task_rate")
	private WebElement entertaskrate;
	
	@FindBy(id="private_notes")
	private WebElement enterprivatenotes;
	
	@FindBy(xpath="//a[text()='Cancel ']")
	private WebElement clickcancelbutton;
	

	public WebElement getEnterduedate() {
		return enterduedate;
	}


	public WebElement getEnterbudgethours() {
		return enterbudgethours;
	}


	public WebElement getEntertaskrate() {
		return entertaskrate;
	}


	public WebElement getEnterprivatenotes() {
		return enterprivatenotes;
	}


	public WebElement getClickcancelbutton() {
		return clickcancelbutton;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getNewProjectButton() {
		return newProjectButton;
	}

	public WebElement getClientTextField() {
		return clientTextField;
	}

	public WebElement getProjectNametextfield() {
		return projectNametextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getNewTaskButton() {
		return newTaskButton;
	}

	public WebElement getDescriptionTextfield() {
		return descriptionTextfield;
	}

	public WebElement getStartButton() {
		return startButton;
	}

	public WebElement getStoputton() {
		return stoputton;
	}

	public WebElement getTaskSaveButton() {
		return taskSaveButton;
	}

	public WebElement getResumeButton() {
		return resumeButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
}

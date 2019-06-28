package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTaskType {
	
	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="(//div[text()='b'])[1]") private WebElement select;
	@FindBy(xpath="//div[@class='typeOfWorkButton editable']") private WebElement type;
	@FindBy(xpath="//div[text()='Billable: programming']") private WebElement workType;
	
	public EditTaskType(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTasks()
	{
		tasks.click();
	}
	public void clickSelect()
	{
		select.click();
	}
	public void clickType()
	{
		type.click();
	}
	public void clickWorkType()
	{
		workType.click();
	}
}

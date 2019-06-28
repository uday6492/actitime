package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Description 
{
	
	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="(//div[text()='b'])[1]") private WebElement select;
	@FindBy(xpath="//textarea[@placeholder='Enter task description...']") private WebElement description;
	
	public Description(WebDriver driver)
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
	public void clickDescription()
	{
		description.click();
		description.sendKeys("This is Description");
	}
	
	

}

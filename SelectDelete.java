package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDelete {

	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="(//div[@class='img'])[7]") private WebElement select;
	@FindBy(xpath="//span[text()='Delete']") private WebElement delete;
	
	public SelectDelete(WebDriver driver)
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
	public void clickDelete()
	{
		delete.click();
	}
}

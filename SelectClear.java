package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectClear {
	
	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="(//div[@class='img'])[6]") private WebElement select;
	@FindBy(xpath="//span[text()='clear selection']") private WebElement clear;
	
	public SelectClear(WebDriver driver)
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
	public void clickClear()
	{
		clear.click();
	}

}

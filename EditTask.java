package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTask {
	
	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="(//div[text()='b'])[1]") private WebElement select;
	@FindBy(xpath="//div[@id='ext-gen101']") private WebElement deadline;
	@FindBy(xpath="//button[@id='ext-gen48']") private WebElement date;
	@FindBy(xpath="//a[text()='Aug']") private WebElement month;
	@FindBy(xpath="//a[text()='2019']") private WebElement year;
	@FindBy(xpath="//button[@class='x-date-mp-ok']") private WebElement ok;
	@FindBy(xpath="//span[text()='15']") private WebElement day;
	
	public EditTask(WebDriver driver)
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
	public void clickDeadline()
	{
		deadline.click();
	}
	public void clickDate()
	{
		date.click();
	}
	public void clickMonth()
	{
		month.click();
	}
	public void clickYear()
	{
		year.click();
	}
	public void clickOk()
	{
		ok.click();
	}
	public void clickDay()
	{
		day.click();
	}
}

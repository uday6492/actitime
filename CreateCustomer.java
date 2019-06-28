package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	@FindBy(xpath="//div[text()='TASKS']") private WebElement tasks;
	@FindBy(xpath="//div[text()='Add New']") private WebElement addNew;
	@FindBy(xpath="//div[text()='+ New Customer']") private WebElement newCustomer;
	@FindBy(xpath="//input[@id='customerLightBox_nameField']") private WebElement customerName;
	@FindBy(xpath="//textarea[@id='customerLightBox_descriptionField']") private WebElement textArea;
	@FindBy(xpath="//button[@id='ext-gen118']") private WebElement selectActiveCustomer;
	@FindBy(xpath="//a[@id='ext-gen163']") private WebElement selectCustomer;
	@FindBy(xpath="//span[text()='Create Customer']") private WebElement createCustomer;
	
	public CreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTasks()
	{
		tasks.click();
	}
	public void clickAddNew()
	{
		addNew.click();
	}
	public void clickNewCustomer()
	{
		newCustomer.click();
	}
	public void setCustomerName(String name)
	{
		customerName.sendKeys(name);
	}
	public void setTextArea(String area)
	{
		tasks.sendKeys(area);
	}
	public void clickSelectActiveCustomer()
	{
		selectActiveCustomer.click();
	}
	public void clickSelectCustomer()
	{
		selectCustomer.click();
	}
	public void clickCreateCustomer()
	{
		createCustomer.click();
	}

}

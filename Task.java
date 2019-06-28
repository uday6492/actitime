package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {
	
	@FindBy(xpath="//span[text()='New']") private WebElement newtask;
	@FindBy(xpath="//table[@id='ext-comp-1060']") private WebElement selectCustomer;
	@FindBy(xpath="//a[@id='ext-gen218']") private WebElement customer;
	@FindBy(xpath="//table[@id='ext-comp-1070']") private WebElement selectProject;
	@FindBy(xpath="//a[@id='ext-gen323']") private WebElement project;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]") private WebElement task1;
	@FindBy(xpath="//span[text()='Create Tasks']") private WebElement createTask;
	
	     public Task(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	
	     public void clickNewTask()
	 	{
	 		newtask.click();
	 	}
	     public void clickSelectCustomer()
	     {
	    	 selectCustomer.click();
	     }
	     public void clickCustomer()
	     {
	    	 customer.click();
	     }
	     public void clickSelectproject()
	     {
	    	 selectProject.click();
	     }
	     public void clickproject()
	     {
	    	 project.click();
	     }
	     public void setTask1(String t1) 
	     {
	    	 task1.sendKeys(t1);
	     }
	     public void clickCreateTask()
	     {
	    	 createTask.click();
	     }

}

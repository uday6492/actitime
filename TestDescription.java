package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.Description;
import page.EditTaskType;
import page.LoginPage;

public class TestDescription extends BaseTest
{
	
	@Test(priority=9)
	public void testEditTaskType() throws InterruptedException
	{
		String un = Fwutils.getXlData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Fwutils.getXlData(XL_PATH, "ValidLogin", 1, 1);
		LoginPage l=new LoginPage(driver);
		//enter valid user name
		l.setUserName(un);
		//enter valid password
		l.setPassword(pw);
		//click on login button
		l.clickLoginBtn();
		Thread.sleep(8000);
		
		Description d=new Description(driver);
		d.clickTasks();
		Thread.sleep(1000);
		d.clickSelect();
		Thread.sleep(1000);
		d.clickDescription();
	}

}

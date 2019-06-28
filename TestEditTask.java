package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.EditTask;
import page.LoginPage;

public class TestEditTask extends BaseTest
{
	@Test(priority=7)
	public void testEditTask() throws InterruptedException
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
		
		EditTask et=new EditTask(driver);
		et.clickTasks();
		Thread.sleep(1000);
		et.clickSelect();
		Thread.sleep(1000);
		et.clickDeadline();
		Thread.sleep(1000);
		et.clickDate();
		Thread.sleep(1000);
		et.clickMonth();
		Thread.sleep(1000);
		et.clickYear();
		Thread.sleep(1000);
		et.clickOk();
		Thread.sleep(1000);
		et.clickDate();
	}
	

}

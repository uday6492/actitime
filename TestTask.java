package script;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.LoginPage;
import page.Task;

public class TestTask extends BaseTest
{
	@Test(priority=1)
	public void testTask() throws InterruptedException
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
		
		Task t=new Task(driver);
		t.clickNewTask();
		Thread.sleep(3000);
		t.clickSelectCustomer();
		Thread.sleep(2000);
		t.clickCustomer();
		Thread.sleep(2000);
		t.clickSelectproject();
		Thread.sleep(2000);
		t.clickproject();
		Thread.sleep(2000);
		t.setTask1("T1");
		Thread.sleep(2000);
		t.clickCreateTask();
	}

}

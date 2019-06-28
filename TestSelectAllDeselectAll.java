package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.LoginPage;
import page.SelectAllDeselectAll;

public class TestSelectAllDeselectAll extends BaseTest
{
	@Test(priority=3)
	public void testAll() throws InterruptedException
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
	
	SelectAllDeselectAll sa=new SelectAllDeselectAll(driver);
	Thread.sleep(3000);
	sa.clickTasks();
	Thread.sleep(3000);
	sa.clickSelect();
	Thread.sleep(3000);
	sa.clickSelect();
	
	
	}

}

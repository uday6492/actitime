package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.LoginPage;
import page.SelectClear;
import page.SelectDelete;

public class TestSelectDelete extends BaseTest
{
	@Test(priority=5)
	public void testSelectClear() throws InterruptedException
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
	
	SelectDelete sc=new SelectDelete(driver);
	Thread.sleep(3000);
	sc.clickTasks();
	Thread.sleep(3000);
	sc.clickSelect();
	Thread.sleep(3000);
	sc.clickDelete();
	}

}

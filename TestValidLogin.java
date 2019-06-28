package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.LoginPage;

public class TestValidLogin extends BaseTest
{
	@Test(priority=0)
	public void testValidLogin()
	{
		String un = Fwutils.getXlData(XL_PATH, "ValidLogin", 1, 0);
		String pw = Fwutils.getXlData(XL_PATH, "ValidLogin", 1, 1);
		String title = Fwutils.getXlData(XL_PATH, "ValidLogin", 1, 2);
		//enter valid user name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//enter valid password
		l.setPassword(pw);
		//click on login button
		l.clickLoginBtn();
		
	}

}

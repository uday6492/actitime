package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Fwutils;
import page.CreateCustomer;
import page.LoginPage;

public class TestCreateCustomer extends BaseTest
{
	
	@Test(priority=2)
	public void testCreateCustomer() throws InterruptedException 
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
		
		CreateCustomer cc=new CreateCustomer(driver);
		cc.clickTasks();
		cc.clickAddNew();
		cc.clickNewCustomer();
		Thread.sleep(3000);
		String cn = Fwutils.getXlData(XL_PATH, "CreateCustomer", 1, 0);
		Thread.sleep(3000);
		cc.setCustomerName(cn);
		Thread.sleep(3000);
		String ta = Fwutils.getXlData(XL_PATH, "CreateCustomer", 1, 1);
		Thread.sleep(3000);
		cc.setTextArea(ta);
		Thread.sleep(3000);
		cc.clickSelectActiveCustomer();
		Thread.sleep(3000);
		cc.clickSelectCustomer();
		Thread.sleep(3000);
		cc.clickCreateCustomer();
	}

}

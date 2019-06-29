package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

/**
 * This is a configuration class
 * This class is having pre condition and post condition
 * @author UDAY
 *
 */
public abstract class BaseTest implements IAutoConstant
{

	public WebDriver driver;
	public int failcount=0, passcount=0;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	/**
	 * This method is used to open the browser
	 */
	@BeforeMethod
	public void openApp() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	/**
	 * This method is used to close the browser and take a screen shot if any method fails
	 */
	@AfterMethod
	public void closeApp(ITestResult itres)
	{
		int status = itres.getStatus();
		String nm = itres.getName();
		if(status==2)
		{
			failcount++;
			String sc = PHOTO_PATH + nm;
			Fwutils.takesScreenShot(driver, sc+".png");
		}
		else
		{
			passcount++;
		}
		driver.close();
	}
	
	/**
	 * This method is used to generate the Report.. ....
	 */
	
	@AfterSuite
	public void generateReport()
	{
		Reporter.log("passcount:" + passcount, true);
		Reporter.log("failcount:" + failcount, true);
		Fwutils.setXlData(XL_REPORT_PATH, "RS", 1, 0, passcount);
		Fwutils.setXlData(XL_REPORT_PATH, "RS", 1, 1, failcount);
	}

}

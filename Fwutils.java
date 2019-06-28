package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Fwutils
{
	public WebDriver driver;
	
	public static String getXlData(String path, String sheet,int r, int c)
	{
		String s="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		s=wb.getSheet("ValidLogin").getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}

	public static int xlRowCount(String path,String sheet)
	{
		int s=0;
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		s=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	public static void  setXlData(String path, String sheet, int r, int c,int s)
	{
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet("RS").getRow(r).getCell(c).setCellValue(s);
		
		wb.write(new FileOutputStream(path));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void takesScreenShot(WebDriver driver, String path)
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileUtils.copyFile(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}

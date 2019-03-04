package helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonLibrary {
	
	
	//code for dropdown
	public static void  selectDropDownByIndex(WebElement dropdownAddres,int indexNum)
	{
		Select s1=new Select(dropdownAddres);
		s1.selectByIndex(indexNum);
	}
	
	public static void  selectDropDownByVisibleText(WebElement dropdownAddres,String visibleText)
	{
		Select s1=new Select(dropdownAddres);
		s1.selectByVisibleText(visibleText);
	}
	public static void  selectDropDownByValue(WebElement dropdownAddres,String value)
	{
		Select s1=new Select(dropdownAddres);
		s1.selectByValue(value);
	}
	
	
	//code for PopUp
	public static void clickOnOkButtonInThePopUp()
	{
		Alert a1 = SuperTestScript.driver.switchTo().alert();
		a1.accept();
	}
	
	public static void clickOnCancelButtonInThePopUp()
	{
		Alert a2 = SuperTestScript.driver.switchTo().alert();
		a2.dismiss();
	}
	public static String retriveTextFromPopUp()
	{
		Alert a3 = SuperTestScript.driver.switchTo().alert();
		return a3.getText();
	}
	
	public static void takeScreenshot(String ScreenshotName) throws IOException
	{
		EventFiringWebDriver efw=new EventFiringWebDriver(SuperTestScript.driver);
		File f1=efw.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\java\\TCCA5\\ScreenShorts\\"+ScreenshotName+".jpg");
		FileUtils.moveFile(f1, f2);

	}
	
	
	
	
	
	

}

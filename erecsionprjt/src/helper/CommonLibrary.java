package helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
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
	
	
	
	
	
	
	
	

}

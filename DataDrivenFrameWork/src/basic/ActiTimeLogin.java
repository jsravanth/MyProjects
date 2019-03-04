package basic;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String url=ExcelOperation.readData("LoginLogout",1,2);
		String un=ExcelOperation.readData("loginLogout",2,2);
		String pwd=ExcelOperation.readData("LoginLogout",3,2);
		String etitle=ExcelOperation.readData("LoginLogout",1,3);
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get(url);
		ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//login using handling keyboard actions 
		ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.TAB+Keys.ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String atitle=ff.getTitle(); //retriving title of webpage
		System.out.println(atitle); //printing title in console
		//for printinng actual result title
		ExcelOperation.writeData("LoginLogout",1,4,atitle);
		//validation of title
		if(etitle.equals(atitle))	
		{
			ExcelOperation.writeData("LoginLogout",1,5,"pass");
		}
		else
		{
			ExcelOperation.writeData("LoginLogout",1,5,"fail");	
		}
		
	}
}

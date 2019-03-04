package basic;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewUserProgUsingDDF {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		String url=ExcelOperation.readData("LoginLogout",1,2);
		String un=ExcelOperation.readData("LoginLogout",2,2);
		String psw=ExcelOperation.readData("LoginLogout",3,2);
		String uname=ExcelOperation.readData("LoginLogout",4,2);
		String upsw=ExcelOperation.readData("LoginLogout",5,2);
		String fname=ExcelOperation.readData("LoginLogout",6,2);
		String lname=ExcelOperation.readData("LoginLogout",7,2);
		System.out.println(url);
		System.out.println(un);
		System.out.println(psw);
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get(url);
		ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//login using handling keyboard actions 
		ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+psw+Keys.TAB+Keys.ENTER);

		ff.findElement(By.linkText("Users")).click();
		ff.findElement(By.xpath("//input[@value='Add New User']")).click();
		ff.findElement(By.name("username")).sendKeys(uname);
		ff.findElement(By.name("passwordText")).sendKeys(upsw);
		ff.findElement(By.name("passwordTextRetype")).sendKeys(upsw);
		ff.findElement(By.name("firstName")).sendKeys(fname);
		ff.findElement(By.name("lastName")).sendKeys(lname);
		ff.findElement(By.xpath("//input[contains(@value,'Create User')]")).click(); //xpath By contains
		
		ff.findElement(By.className("logoutImg")).click(); 
	
	}


	

}

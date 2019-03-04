package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RestoreCustomerProg {
	public static void main(String[] args) {
		
	
	String url=ExcelOperation.readData("LoginLogout",1,2);
	String un=ExcelOperation.readData("loginLogout",2,2);
	String pwd=ExcelOperation.readData("LoginLogout",3,2);
	String ersmg=ExcelOperation.readData("LoginLogout",9,3);
	
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	System.out.println(ersmg);
	
	System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
	FirefoxDriver ff=new FirefoxDriver();
	ff.get(url);
	ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//login using handling keyboard actions 
	ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.TAB+Keys.ENTER);
	
	ff.findElement(By.linkText("Archives")).click();
	ff.findElement(By.linkText("goutham")).click();
	ff.findElement(By.xpath("//input[@value='Restore This Customer From Archives']")).click();
	Alert rv1 = ff.switchTo().alert();
	rv1.accept();
	
	WebElement msg=ff.findElement(By.className("successmsg"));
	String arsmg=msg.getText();
	System.out.println(arsmg);
	ExcelOperation.writeData("LoginLogout",9,4,arsmg);

	ff.findElement(By.className("LogoutImg")).click();
	if(ersmg.equals(arsmg))	
	{
		ExcelOperation.writeData("LoginLogout",9,5,"pass");
	}
	else
	{
		ExcelOperation.writeData("LoginLogout",9,5,"fail");	
	}
}
}
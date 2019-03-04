package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewProject {

	public static void main(String[] args) {
		String url=ExcelOperation.readData("LoginLogout",1,2);
		String un=ExcelOperation.readData("loginLogout",2,2);
		String pwd=ExcelOperation.readData("LoginLogout",3,2);
		String pname=ExcelOperation.readData("LoginLogout",6,2);
		String pdes=ExcelOperation.readData("LoginLogout",7,2);
		String epsmg=ExcelOperation.readData("LoginLogout",7,3);
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(pname);
		System.out.println(pdes);
		System.out.println(epsmg);
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get(url);
		ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login using handling keyboard actions 
		ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.TAB+Keys.ENTER);
		
		
		//Projects and cutomer link
		ff.findElement(By.linkText("Projects & Customers")).click();   //clicking on link
		//project button 
		ff.findElement(By.cssSelector("input[value='Add New Project']")).click();
		WebElement we1=ff.findElement(By.name("customerId"));
		Select s1=new Select(we1);
		s1.selectByIndex(1);
		ff.findElement(By.name("name")).sendKeys(pname);
		ff.findElement(By.name("description")).sendKeys(pdes);
		ff.findElement(By.name("createProjectSubmit")).click();
	
		WebElement msg=ff.findElement(By.className("successmsg"));
		String apsmg=msg.getText();
		System.out.println(apsmg);
		ExcelOperation.writeData("LoginLogout",7,4,apsmg);
		
		ff.findElement(By.className("LogoutImg")).click();
		if(epsmg.equals(apsmg))	
		{
			ExcelOperation.writeData("LoginLogout",7,5,"pass");
		}
		else
		{
			ExcelOperation.writeData("LoginLogout",7,5,"fail");	
		}
	}

}

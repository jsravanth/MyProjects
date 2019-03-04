package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddNewCustomerProg {

	public static void main(String[] args) {
		String url=ExcelOperation.readData("LoginLogout",1,2);
		String un=ExcelOperation.readData("loginLogout",2,2);
		String pwd=ExcelOperation.readData("LoginLogout",3,2);
		String cname=ExcelOperation.readData("LoginLogout",4,2);
		String cdes=ExcelOperation.readData("LoginLogout",5,2);
		String ecsmg=ExcelOperation.readData("LoginLogout",5,3);
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(cname);
		System.out.println(cdes);
		System.out.println(ecsmg);
		
		System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get(url);
		ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login using handling keyboard actions 
		ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.TAB+Keys.ENTER);
		//Projects and cutomer link
				ff.findElement(By.linkText("Projects & Customers")).click();   //clicking on link
		
		//cutomer button
		ff.findElement(By.cssSelector("input[type='button']")).click(); //click on customer button
		ff.findElement(By.name("name")).sendKeys(cname); //enter customer name
		ff.findElement(By.name("description")).sendKeys(cdes); //enter desc
		ff.findElement(By.name("createCustomerSubmit")).click(); // click on createCustomer buttpon
		WebElement msg=ff.findElement(By.className("successmsg"));
		String acsmg=msg.getText();
		System.out.println(acsmg);
		ExcelOperation.writeData("LoginLogout",5,4,acsmg);

		ff.findElement(By.className("LogoutImg")).click();
		if(ecsmg.equals(acsmg))	
		{
			ExcelOperation.writeData("LoginLogout",5,5,"pass");
		}
		else
		{
			ExcelOperation.writeData("LoginLogout",5,5,"fail");	
		}

	}

}

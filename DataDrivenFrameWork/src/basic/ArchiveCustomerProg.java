package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArchiveCustomerProg {

	public static void main(String[] args) {
		
			String url=ExcelOperation.readData("LoginLogout",1,2);
			String un=ExcelOperation.readData("loginLogout",2,2);
			String pwd=ExcelOperation.readData("LoginLogout",3,2);
			String easmg=ExcelOperation.readData("LoginLogout",8,3);
			
			System.out.println(url);
			System.out.println(un);
			System.out.println(pwd);
			System.out.println(easmg);
			
			System.setProperty("webdriver.gecko.driver", "D:\\java\\qsp\\64bitAutomationSW\\driver\\geckodriver.exe");
			FirefoxDriver ff=new FirefoxDriver();
			ff.get(url);
			ff.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//login using handling keyboard actions 
			ff.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.TAB+Keys.ENTER);
			//Projects and cutomer link
					ff.findElement(By.linkText("Projects & Customers")).click();   //clicking on link
			
					
					ff.findElement(By.linkText("goutham")).click();
					ff.findElement(By.xpath("//input[@value='Archive This Customer']")).click();
					Alert rv1 = ff.switchTo().alert();
					rv1.accept();
					
					WebElement msg=ff.findElement(By.className("successmsg"));
					String aasmg=msg.getText();
					System.out.println(aasmg);
					ExcelOperation.writeData("LoginLogout",8,4,aasmg);

					ff.findElement(By.className("LogoutImg")).click();
					if(easmg.equals(aasmg))	
					{
						ExcelOperation.writeData("LoginLogout",8,5,"pass");
					}
					else
					{
						ExcelOperation.writeData("LoginLogout",8,5,"fail");	
					}

					
			

	}

}

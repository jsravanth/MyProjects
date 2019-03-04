package script;

import org.testng.annotations.Test;

import helper.ExcelOperation;
import helper.SuperTestScript;
import helper.ValidationOperation;
import page.LoginPage;
import page.SetupPage;

public class LoginLogoutTC_01 extends SuperTestScript {

	
	@Test
	public void testLoginLogout() {
		
		//Step 1 :fetch all neccessary data
				String un = ExcelOperation.readData("LoginPage", 1, 2);
				String pwd= ExcelOperation.readData("LoginPage", 2, 2);
				String er=ExcelOperation.readData("LoginPage", 2, 3);
				System.out.println(un);
				System.out.println(pwd);
				System.out.println(er);
				
				//Step 2:create all neccessary page objects
				LoginPage lp= new LoginPage();
				lp.enterUserName(un);
				lp.enterPassword(pwd);
				lp.clickOnLogin();
				
				SetupPage sp=new SetupPage();
				String title = sp.retriveTitleOfPage();
				System.out.println(title);
				sp.clickOnLogout();
				
				ExcelOperation.writeData("LoginPage", 2, 4, title);
				String status = ValidationOperation.verify(er, title);
				ExcelOperation.writeData("LoginPage", 2, 5, status);
		
	}
}

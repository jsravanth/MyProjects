package script;

import org.testng.annotations.Test;

import helper.ExcelOperation;
import helper.SuperTestScript;
import helper.ValidationOperation;
import page.LoginPage;
import page.SetupPage;
import page.UserCardPage;
import page.UsersAndGroupPage;

public class CreateNewUserTC_02 extends SuperTestScript {
	@Test
	public void testCreateNewUserTC_02()
	{
		String un=ExcelOperation.readData("Newuser", 7, 2);
		String pwd=ExcelOperation.readData("Newuser", 8, 2);
		String lastname = ExcelOperation.readData("Newuser", 1, 2);
		String name = ExcelOperation.readData("Newuser", 2, 2);
		String loginName = ExcelOperation.readData("Newuser", 3, 2);
		String password = ExcelOperation.readData("Newuser", 4, 2);
		String email = ExcelOperation.readData("Newuser", 5, 2);
		String mobilenum = ExcelOperation.readData("Newuser", 6, 2);
		String er=ExcelOperation.readData("Newuser", 6, 3);
		
		System.out.println(lastname);
		System.out.println(name);
		System.out.println(loginName);
		System.out.println(password);
		System.out.println(email);
		System.out.println(mobilenum);
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickOnLogin();
		
		SetupPage sp=new SetupPage();
		sp.clickOnUsersAndGroups();
		
		UsersAndGroupPage ugp=new UsersAndGroupPage();
		ugp.clickOnNewUser();
		
		UserCardPage ucp=new UserCardPage();
		ucp.enterLastName(lastname);
		ucp.enterName(name);
		ucp.enterLoginName(loginName);
		ucp.enterPassword(password);
		ucp.enterEmailId(email);
		ucp.enterMobileNumbwe(mobilenum);
		ucp.clickOnCreateButton();
		
		String ar = ucp.retriveUserTitleOfPage();
		System.out.println(ar);
		
		ExcelOperation.writeData("Newuser", 6, 4, ar);
		String status = ValidationOperation.verify(er, ar);
		ExcelOperation.writeData("Newuser", 6, 5, status);
		
		
	}
	
	
	
	
	
	
	
	

}

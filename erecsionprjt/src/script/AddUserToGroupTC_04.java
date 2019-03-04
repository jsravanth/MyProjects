package script;

import org.testng.annotations.Test;

import helper.ExcelOperation;
import helper.SuperTestScript;
import helper.ValidationOperation;
import page.GroupCardPage;
import page.GroupPage;
import page.LoginPage;
import page.SetupPage;
import page.UsersAndGroupPage;

public class AddUserToGroupTC_04 extends SuperTestScript{
	@Test
	public void testAddUserToGroupTC_04()
	{
		String un = ExcelOperation.readData("Groups", 1, 2);
		String pwd = ExcelOperation.readData("Groups", 2, 2);
		String er = ExcelOperation.readData("Groups", 2, 3);
		
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(er);
		
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickOnLogin();
		
		SetupPage sp=new SetupPage();
		sp.clickOnUsersAndGroups();
		
		UsersAndGroupPage ugp=new UsersAndGroupPage();
		ugp.clickOnGroup();
		
		GroupPage gp=new GroupPage();	
		gp.selectSalesModule();
		
		
		GroupCardPage gcp=new GroupCardPage();
		gcp.selectnameFromDropdown(1);
		gcp.clickOnAddButton();
		
		String ar = gcp.retriveGroupTitleOfPage();
		System.out.println(ar);
		sp.clickOnLogout();
		ExcelOperation.writeData("Groups", 2, 4, ar);
		String status = ValidationOperation.verify(er, ar);
		ExcelOperation.writeData("Groups", 2, 5, status);
		
		
		
	}
	
	

}

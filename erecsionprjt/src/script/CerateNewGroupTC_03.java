package script;

import org.testng.annotations.Test;

import helper.ExcelOperation;
import helper.SuperTestScript;
import helper.ValidationOperation;
import page.GroupCardPage;
import page.LoginPage;
import page.SetupPage;
import page.UsersAndGroupPage;

public class CerateNewGroupTC_03 extends SuperTestScript{

	@Test
	public void testCerateNewGroupTC_03()
	{
		String un=ExcelOperation.readData("Newgroup", 1, 2);
		String pwd=ExcelOperation.readData("Newgroup", 2, 2);
		String name=ExcelOperation.readData("Newgroup", 3, 2);
		String er=ExcelOperation.readData("Newgroup", 3, 3);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(er);
		
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickOnLogin();
		
		SetupPage sp=new SetupPage();
		sp.clickOnUsersAndGroups();
		
		UsersAndGroupPage ugp=new UsersAndGroupPage();
		ugp.clickOnNewGroup();
		
		GroupCardPage gcp=new GroupCardPage();
		gcp.enterGroupName(name);
		gcp.clickOnCreateGroupe();
		String ar = gcp.retriveGroupTitleOfPage();
		System.out.println(ar);
		sp.clickOnLogout();
		
		ExcelOperation.writeData("Newgroup", 3, 4, ar);
		String status=ValidationOperation.verify(er, ar);
		ExcelOperation.writeData("Newgroup", 3, 5, status);
		
		
		
		
	}
}

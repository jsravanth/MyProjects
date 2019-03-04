package script;

import org.testng.annotations.Test;

import helper.ExcelOperation;
import helper.SuperTestScript;
import helper.ValidationOperation;
import page.GroupCardPage;
import page.GroupPage;
import page.LoginPage;
import page.PermissionsPage;
import page.SetupPage;
import page.UsersAndGroupPage;

public class AddPermissionsToGroupTC_05 extends SuperTestScript{

	@Test
	public void testAddPermissionsToGroupTC_05()
	{
		String un=ExcelOperation.readData("Permissions", 1, 2);
		String pwd=ExcelOperation.readData("Permissions", 2, 2);
		String er=ExcelOperation.readData("Permissions", 2, 3);
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
		gcp.clickOnGroupPermissionsButton();
		
		PermissionsPage pp=new PermissionsPage();
		pp.clickOnCustomerOrderPermissions();
		pp.clickOnContractPermissions();
		pp.clickOnShipmentsPermissions();
		pp.clickOnInvoicePermissions();
		pp.clickOnProductsPermissions();
		pp.clickOnProposalPermissions();
		pp.clickOnServicesPermissions();
		pp.clickOnThirdPartiesPermissions();
		pp.clickOnStocksPermissions();
		String ar=pp.retrivePermissionsTitleOfPage();
		System.out.println(ar);
		ExcelOperation.writeData("Permissions", 2, 4, ar);
		String ststus=ValidationOperation.verify(er, ar);
		ExcelOperation.writeData("Permissions",2,5, ststus);
		
	}
}

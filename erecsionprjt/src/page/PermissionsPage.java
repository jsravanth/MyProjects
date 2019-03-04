package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class PermissionsPage
{
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[2]/td[2]/a[1]")
	private WebElement membersPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[10]/td[2]/a[1]")
	private WebElement agendaPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[17]/td[2]/a[1]")
	private WebElement bankAndCashPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[27]/td[2]/a[1]")
	private WebElement customerOrderPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[35]/td[2]/a[1]")
	private WebElement accountingPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[40]/td[2]/a[1]")
	private WebElement contractPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[59]/td[2]/a[1]")
	private WebElement shipmentsPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[71]/td[2]/a[1]")
	private WebElement invoicePermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[109]/td[2]/a[1]")
	private WebElement productsPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[121]/td[2]/a[1]")
	private WebElement proposalPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[128]/td[2]/a[1]")
	private WebElement servicesPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[133]/td[2]/a[1]")
	private WebElement thirdPartiesPermissions;
	
	@FindBy(xpath="//*[@id='undertopmenu']/tbody/tr/td[2]/div/div[2]/table[2]/tbody/tr[143]/td[2]/a[1]")
	private WebElement stocksPermissions;
	
	
	
	public PermissionsPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnMembersPermissions()
	{
		membersPermissions.click();
	}
	public void clickOnAgendaPermissions()
	{
		agendaPermissions.click();
	}
	public void clickOnBankAndCashPermissions()
	{
		bankAndCashPermissions.click();
	}
	public void clickOnCustomerOrderPermissions()
	{
		customerOrderPermissions.click();
	}
	public void clickOnAccountingPermissions()
	{
		accountingPermissions.click();
	}
	public void clickOnContractPermissions()
	{
		contractPermissions.click();
	}
	public void clickOnShipmentsPermissions()
	{
		shipmentsPermissions.click();
	}
	public void clickOnInvoicePermissions()
	{
		invoicePermissions.click();
	}
	public void clickOnProductsPermissions()
	{
		productsPermissions.click();
	}
	public void clickOnProposalPermissions()
	{
		proposalPermissions.click();
	}
	public void clickOnServicesPermissions()
	{
		servicesPermissions.click();
	}
	public void clickOnThirdPartiesPermissions()
	{
		thirdPartiesPermissions.click();
	}
	public void clickOnStocksPermissions()
	{
		stocksPermissions.click();
	}
	
	public String retrivePermissionsTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
	}
}

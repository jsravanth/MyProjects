package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class SetupPage {
	
	@FindBy(xpath="//*[@id='mainbody']/div[2]/table/tbody/tr/td[2]/a/img")
	private WebElement logoutButton;
	@FindBy(linkText="Users & Groups")
	private WebElement usersandgroupsLink;	
	
	
	public SetupPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	

	public void clickOnUsersAndGroups()
	{
		usersandgroupsLink.click();
	}
	
	public String retriveTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
	}
	public void clickOnLogout()
	{
		logoutButton.click();
	}
	
	
}

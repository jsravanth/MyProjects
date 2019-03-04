package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class UsersAndGroupPage {
	
	
	@FindBy(linkText="New user")
	private WebElement newUserLink;
	@FindBy(linkText="New group")
	private WebElement newGroupLink;
	@FindBy(linkText="Groups")
	private WebElement grouplink;
	@FindBy(linkText="Users")
	private WebElement userslink;
	
	
	public  UsersAndGroupPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnNewUser() {
		newUserLink.click();
	}
	public void clickOnNewGroup() {
		newGroupLink.click();
	}
	public void clickOnUser() {
		userslink.click();
	}
	public void clickOnGroup() {
		grouplink.click();
	}
	
}

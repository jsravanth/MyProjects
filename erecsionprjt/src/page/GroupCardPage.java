package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.CommonLibrary;
import helper.SuperTestScript;

public class GroupCardPage {
	@FindBy(name="nom")
	private WebElement nameTextField;
	@FindBy(xpath="//input[@value='Create group']")
	private WebElement createGroupButton;
	@FindBy(id="user")
	private WebElement dropdownAddress;
	@FindBy(className="button")
	private WebElement addButton;
	@FindBy(linkText="Group permissions")
	private WebElement groupsPermissionsButton;
	
	public  GroupCardPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterGroupName(String name)
	{
		nameTextField.sendKeys(name);
	}
	public void clickOnCreateGroupe()
	{
		createGroupButton.click();
	}
	public void selectnameFromDropdown(int indexNum)
	{
		CommonLibrary.selectDropDownByIndex(dropdownAddress, indexNum);
	}
	public void clickOnAddButton()
	{
		addButton.click();
	}
	public void clickOnGroupPermissionsButton()
	{
		groupsPermissionsButton.click();
	}
	public String retriveGroupTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
	}
	

}

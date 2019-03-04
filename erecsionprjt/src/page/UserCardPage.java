package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class UserCardPage {
	
	@FindBy(name="nom")
	private WebElement lastNameTextField;
	@FindBy(name="prenom")
	private WebElement nameTextField;
	@FindBy(name="login")
	private WebElement loginNameTextField;
	@FindBy(name="password")
	private WebElement passwordTextField;
	@FindBy(name="email")
	private WebElement emailTextField;
	@FindBy(name="user_mobile")
	private WebElement mobileNumberTextField;
	@FindBy(xpath="//input[@value='Create user']")
	private WebElement createUserButton;
	
	public UserCardPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	
	public void enterLastName(String lastname)
	{
		lastNameTextField.sendKeys(lastname);
	}
	
	public void enterName(String name)
	{
		nameTextField.sendKeys(name);	
	}
	
	public void enterLoginName(String loginName) 
	{
		loginNameTextField.sendKeys(loginName);
	}
	
	public void  enterPassword(String pasword) 
	{
		passwordTextField.clear();
		passwordTextField.sendKeys(pasword);
	}
	
	public void enterEmailId(String emailid) 
	{
		emailTextField.sendKeys(emailid);		
	}
	
	public void enterMobileNumbwe(String mobilenumber) 
	{
		mobileNumberTextField.sendKeys(mobilenumber);
		
	}
	
	public String retriveUserTitleOfPage()
	{
		return SuperTestScript.driver.getTitle();
	}
	
	public void clickOnCreateButton()
	{
		createUserButton.click();
	}
	
}

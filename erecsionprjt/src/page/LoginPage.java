package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class LoginPage {
	
	
	@FindBy(name="username")
	private WebElement usernameTextField;
	@FindBy(name="password")
	private WebElement passwordTextField;
	@FindBy(className="button")
	private WebElement Connection;
	
	public  LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUserName(String username)
	{
		usernameTextField.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	public void clickOnLogin()
	{
		Connection.click();
	}


}

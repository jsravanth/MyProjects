package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SuperTestScript;

public class GroupPage {
	
	@FindBy(linkText="Sales")
	private WebElement salesModule;

	
	
	public GroupPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	
	public void selectSalesModule()
	{
		salesModule.click();
	}
}

package com_ActiTime_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class ActiTIMEEnterTimeTrackPage extends BasePage
{
	@FindBy(id = "logoutLink")
	private WebElement lgout;
	
	
	public ActiTIMEEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogoutButton()
	{
		lgout.click();
	}
}

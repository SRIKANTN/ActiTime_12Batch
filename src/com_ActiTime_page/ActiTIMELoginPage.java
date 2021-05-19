package com_ActiTime_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class ActiTIMELoginPage extends BasePage
{
	//Declaration
	@FindBy(id = "username")
	private WebElement unTB;
	
	@FindBy(name = "pwd")
	private WebElement pwTB;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgBT;
	
	@FindBy(xpath = "//span[.='Username or Password is invalid. Please try again.']")
	private WebElement error;
	
	@FindBy(xpath = "//nobr[contains(text(),'actiTIME ')]")
	private WebElement version;

	//Intilization
	public ActiTIMELoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void enterusername(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnLoginButton()
	{
		lgBT.click();
	}
	public String verifyErrorMessage()
	{
		verifyElement(error);
		String aErrorMessage = error.getText();
		return aErrorMessage;
	}
	
	public String verifyVersion()
	{
		verifyElement(version);
		String aVersion = version.getText();
		return aVersion;
	}
}

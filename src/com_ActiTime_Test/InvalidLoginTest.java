package com_ActiTime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_page.ActiTIMELoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i = 1;i<=rc; i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("The User name = "+un,true);
			lp.enterusername(un);
			Reporter.log("The Password = "+pw,true);
			lp.enterPassword(pw);
			lp.clickOnLoginButton();
			String aErrormessage = lp.verifyErrorMessage();
			String eErrormessage = ExcelData.getData(file_path, "TC02", 1, 2);
			Assert.assertEquals(aErrormessage, eErrormessage);
			Reporter.log("===================================",true);
			Thread.sleep(1000);
		}
	}

}

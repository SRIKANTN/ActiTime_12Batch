package com_ActiTime_Test;
import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_page.ActiTIMEEnterTimeTrackPage;
import com_ActiTime_page.ActiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void validLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String epTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		ActiTIMEEnterTimeTrackPage ep =new ActiTIMEEnterTimeTrackPage(driver);
		//Login page should be displayed
		lp.verifyTitle(lgTitle);
		//Enter valid username
		lp.enterusername(un);
		//Enter valid password
		lp.enterPassword(pw);
		//click on Login
		lp.clickOnLoginButton();
		//Enter Time Track page should be displayed
		lp.verifyTitle(epTitle);
		//click on Logout
		ep.clickOnLogoutButton();
		//Login page should be displayed
		lp.verifyTitle(lgTitle);
	}

}

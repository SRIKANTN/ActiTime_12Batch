package com_ActiTime_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_page.ActiTIMELoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority = 3)
	public void verifyVersion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		lp.verifyTitle(title);
		String aVersion = lp.verifyVersion();
		String eVersion = ExcelData.getData(file_path, "TC03", 1,0);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aVersion, eVersion);
		Reporter.log("The actual version = "+aVersion,true);
		sa.assertAll();		
	}

}

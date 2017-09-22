package com.actitime.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class ValidaLoginLogout extends BaseTest {

	@Test(priority = 1)
	public void testValidLoginLogout() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidaLoginLogout", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidaLoginLogout", 1, 1);
		String hp = UtilityLib.getCellValue(INPUT_PATH, "ValidaLoginLogout", 1, 2);
		String lp = UtilityLib.getCellValue(INPUT_PATH, "ValidaLoginLogout", 1, 3);
		

		// Enter valid user name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		// Enter valid password
		l.setPassword(pw);
		// click on login btn
		l.clickLogin();
		// Verify that home page is displayed
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyTitle(hp);
		// Click on logout
		e.clickLogout();
		// Verify that login page is displayed
		l.verifyTitle(lp);
	}

}

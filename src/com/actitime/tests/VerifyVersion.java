package com.actitime.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LicensesPage;
import com.actitime.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class VerifyVersion extends BaseTest {

	@Test(priority = 3)
	public void testVerifyVersion() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		
		String un = UtilityLib.getCellValue(INPUT_PATH, "VerifyVersion", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "VerifyVersion", 1, 1);

		LoginPage l = new LoginPage(driver);

		// Get the actitime version

		String version = l.getVersion();

		// Enter valid user name

		l.setUserName(un);

		// Enter valid password

		l.setPassword(pw);

		// Click on login

		l.clickLogin();

		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		// click on settings
		e.clickSettings();

		// click on liceses link

		e.clicklicenses();

		// get the product version and verify with login page version

		LicensesPage lc = new LicensesPage(driver);
		lc.verifyProductEdition(version);
		
		//click on logout
		e.clickLogout();

	}

}

package com.actitime.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class InvalidLogin extends BaseTest {
	
	/*//Why iam getting error
	String un = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", 1, 0);
	String pw = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", 1, 1);*/

	@Test(priority = 2)
	public void testInvalidLogin()
			throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException {

		int rc = UtilityLib.getRowCount(INPUT_PATH, "InvalidLogin");
		Reporter.log("Number of rows"+rc,true);
		
		for (int i = 1; i <= rc; i++) {
			
			String un = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", i, 0);
			String pw = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", i, 1);

			LoginPage l = new LoginPage(driver);
			//Thread.sleep(2000);
			// enter invalid username
			l.setUserName(un);

			// enter invalid password
			l.setPassword(pw);

			// click on login
			l.clickLogin();

			// verify error msg is displayed
			l.verifyErrorMessageIsDisplayed();

		}
	}

}

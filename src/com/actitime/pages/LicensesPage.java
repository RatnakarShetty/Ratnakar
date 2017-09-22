package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import generics.BasePage;

public class LicensesPage extends BasePage {

	@FindBy(xpath = "//b[contains(.,'actiTIME')]")
	private WebElement productEdition;

	public LicensesPage(WebDriver driver) {
		super(driver);
	}

	public void verifyProductEdition(String eValue) {
		String aValue = productEdition.getText();
		try {
			Assert.assertEquals(aValue, eValue);
			Reporter.log("Version Matched", true);
		} catch (Exception e) {
			Reporter.log("Version not Matched", true);
		}
	}

}

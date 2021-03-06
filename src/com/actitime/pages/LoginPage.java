package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class LoginPage extends BasePage {

	@FindBy(id = "username")
	private WebElement unTXB;

	@FindBy(name = "pwd")
	private WebElement pwTXB;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN;

	@FindBy(xpath = "//span[contains(.,'invalid')]")
	private WebElement errMsg;

	@FindBy(xpath = "//nobr[contains(text(),'actiTIME')]")
	private WebElement actiTIMEVertion;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void setUserName(String un) {
		unTXB.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwTXB.sendKeys(pw);
	}

	public void clickLogin() {
		loginBTN.click();
	}

	public void verifyErrorMessageIsDisplayed() {
		verifyElementIsPresent(errMsg);
	}

	public String getVersion() {
		return actiTIMEVertion.getText();
	}

}

package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class EnterTimeTrackPage extends BasePage {

	@FindBy(id = "logoutLink")
	private WebElement logoutBTN;

	@FindBy(linkText = "Licenses")
	private WebElement licenses;

	@FindBy(xpath = "//div[@class='popup_menu_icon warning_icon']")
	private WebElement setting;

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}

	public void clickLogout() {
		logoutBTN.click();
	}

	public void clickSettings() {
		setting.click();
	}

	public void clicklicenses() {
		licenses.click();
	}

}

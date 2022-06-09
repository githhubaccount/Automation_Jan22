package com.DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogOutPage {

	@FindBy(xpath = " //button[contains(text(),'Logout')]")
	private WebElement logOut;

	public KiteLogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickKiteLogOutPageLogOutBtn() {
		logOut.click();
	}
}

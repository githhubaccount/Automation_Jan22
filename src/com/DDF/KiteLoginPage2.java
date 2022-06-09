package com.DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 {
	@FindBy(xpath = "//input[@id='pin'] ")
	private WebElement PIN;
	@FindBy(xpath = " //button[contains(text(),'Continue ')]")
	private WebElement contBtn;

	public KiteLoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void KiteLoginPage2Pin(String pin) {
		PIN.sendKeys(pin);
	}

	public void KiteLoginPage2continueBtn() {
		contBtn.click();

	}
}

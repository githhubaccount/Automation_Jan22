package com.DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {

	@FindBy(xpath = "//input[@id='userid'] ")
	private WebElement UN;
	@FindBy(xpath = "//input[@id='password'] ")
	private WebElement PWD;
	@FindBy(xpath = "//button[contains(text(),'Login')] ")
	private WebElement login;

	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void KiteLoginPage1Username(String username) {
		UN.sendKeys(username);
	}

	public void KiteLoginPage1Password(String password) {
		PWD.sendKeys(password);
	}

	public void KiteLoginPage1LoginBtn() {
		login.click();
	}
}

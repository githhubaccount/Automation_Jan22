package com.DDF;

import java.io.IOException;
import org.testng.Assert;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class KiteLoginTest extends BaseClass {
	KiteLoginPage1 login1;
	KiteLoginPage2 login2;
	KiteHomePage home;
	KiteLogOutPage logOut;

	@BeforeClass
	public void openBrowser() throws IOException {
		browserOpen();
		login1 = new KiteLoginPage1(driver);
		login2 = new KiteLoginPage2(driver);
		home = new KiteHomePage(driver);
		logOut = new KiteLogOutPage(driver);
	}
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException{
		login1.KiteLoginPage1Username(UtilityClass.getTestData(0,0));
		login1.KiteLoginPage1Password(UtilityClass.getTestData(0,1));
		login1.KiteLoginPage1LoginBtn();
		login2.KiteLoginPage2Pin(UtilityClass.getTestData(0,2));
		login2.KiteLoginPage2continueBtn();
	}
	
	@Test
	public void test() throws EncryptedDocumentException, IOException{
		String expResult=UtilityClass.getTestData(0, 3);
		String actualResult = home.verifyKiteHomePageProfileName();
		Assert.assertEquals(actualResult, expResult);
	}
	
	@AfterMethod
	public void logoutToKite(){
		
	}
	
	@AfterClass
	public void closeBrowser(){
		
	}
	
}


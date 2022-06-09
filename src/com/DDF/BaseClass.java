package com.DDF;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	static WebDriver driver;

	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\New_Shraddha\\Software\\chromedriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();// notification

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// synchronization/wait

		driver.get(UtilityClass.getPropertyFileData("url"));

	}

}
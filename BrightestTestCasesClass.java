package com.BrightestTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.BrightestPages.BrightestLoginPage;

public class BrightestTestCasesClass {
	@Test
    public void CheckValidUser() {
		   WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://profile.brightest.org/accounts/signup/");
		   BrightestLoginPage logineasycal = PageFactory.initElements(driver, BrightestLoginPage.class);
		   logineasycal.LoginEasyCal("xyz123@gmail.com", "xyz123@gmail.com","pass123","pass123");
		   
	   }
}

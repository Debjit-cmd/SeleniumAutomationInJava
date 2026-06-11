package com.EasycalculationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.TestCases.LoginEasyCal;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
   public void CheckValidUser() {
	   WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
	   LoginEasyCal logineasycal = PageFactory.initElements(driver, LoginEasyCal.class);
	   logineasycal.Login_Easy_Cal("8373838333", "dnwdbqd123@");
	   
   }
}

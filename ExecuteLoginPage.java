package com.ChaseTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ChasePOMPages.PomChaseLoginPage;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {

    @Test
    public void CheckValidUser() throws InterruptedException 
    {

        WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.chase.com/");

        PomChaseLoginPage page =
                PageFactory.initElements(driver, PomChaseLoginPage.class);
        
        Thread.sleep(5000);
        
        page.LoginEasyCal("student","Password123");
    }
}
package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCal {
	
   WebDriver driver;
 public LoginEasyCal( WebDriver driver) { //no return type
	this.driver = driver;
 }
 
 @FindBy(id="log_email")
 WebElement Email;
 
 @FindBy(id="log_password")
 WebElement pass;
 
 @FindBy(xpath ="//input[@name='log_submit']")
 WebElement loginbtn;
 
 public void Login_Easy_Cal(String email , String password) {
	 Email.sendKeys(email);
	 pass.sendKeys(password);
	 loginbtn.click();
 }
	
}

package com.ChasePOMPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class PomChaseLoginPage {
		
	   WebDriver driver;
	 public PomChaseLoginPage( WebDriver driver) { //no return type
		this.driver = driver;
	 }
	 
	 @FindBy(id="userId-text-input-field")
	 WebElement Username;
	 
	 @FindBy(id="password-text-input-field")
	 WebElement pass;
	 
	 @FindBy(xpath ="//button[@id='signin-button']")
	 WebElement signinbtn;
	 
	 public void LoginEasyCal(String username , String password) {
		 Username.sendKeys(username);
		 pass.sendKeys(password);
		 signinbtn.click();
	 }
		
	}


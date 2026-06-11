package com.PracticeAutomationPOMPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LoginPomPages {
		
	   WebDriver driver;
	 public LoginPomPages( WebDriver driver) { //no return type
		this.driver = driver;
	 }
	 
	 @FindBy(id="username")
	 WebElement Username;
	 
	 @FindBy(id="password")
	 WebElement pass;
	 
	 @FindBy(xpath ="//button[@id='submit']")
	 WebElement submitbtn;
	 
	 public void Login_Easy_Cal(String username , String password) {
		 Username.sendKeys(username);
		 pass.sendKeys(password);
		 submitbtn.click();
	 }
		
	}


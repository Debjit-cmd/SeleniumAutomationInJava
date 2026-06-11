package com.BrightestPages;
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class BrightestLoginPage {

		
	   WebDriver driver;
	 public BrightestLoginPage( WebDriver driver) { //no return type
		this.driver = driver;
	 }
	 
	 @FindBy(name="email")
	 WebElement email;
	 
	 @FindBy(name="email2")
	 WebElement confirmemail;
	 
	 @FindBy(name = "password1")
	 WebElement pass;
	 
	 @FindBy(name = "password2")
	 WebElement confirmpass;
	 
	 @FindBy(name = "i_agree")
	 WebElement checkbox;
	 
	 
	 @FindBy(xpath ="//button[@aria-label='Create Account']")
	 WebElement CreateAccbtn;
	 
	 public void LoginEasyCal(String Email , String Email2, String password1, String password2) {
		 email.sendKeys(Email);
		 confirmemail.sendKeys(Email2);
		 pass.sendKeys(password1);
		 confirmpass.sendKeys(password2);
		 checkbox.click();
		 CreateAccbtn.click();
	 }
		
	}


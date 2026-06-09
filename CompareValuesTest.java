package com.LocatorsCaseStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompareValuesTest {
	  WebDriver driver;
		String url = "https://practicetestautomation.com/practice-test-login/";
	    @BeforeTest
	    public void Setup() {
	    	driver = new ChromeDriver();
	    	driver.navigate().to(url);
	    	driver.manage().window().maximize();
	    }
	    @Test
	    public void LocatorsTest() {
	    	driver.findElement(By.id("username")).sendKeys("student");
	 	   driver.findElement(By.id("password")).sendKeys("Password123");
	 	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	 	  String title = driver.getTitle();
	 	  System.out.println(title);
	 	 if(title.equals("Logged In Successfully | Practice Test Automation")) {
			   System.out.println("Test Passes Successfully");
		   }
		   else {
			   System.out.println("Test Fails");
		   }
	    }
	    @AfterTest
	    public void tearDown() {
	    	driver.quit();
	    }
  }

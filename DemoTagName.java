package com.LocatorsCaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTagName {
	
    @Test
    public void findElementById() throws Exception {
    	WebDriver driver = new ChromeDriver();
    	String url = "https://www.hollandandbarrett.com/";
    	driver.get(url);
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    	
    	List<WebElement> links = driver.findElements(By.tagName("a"));
    	System.out.println(links.size());
    	
    	
    	for(WebElement ele: links) {
    		System.out.println(ele.isDisplayed());
    		System.out.println(ele.isEnabled());
    		System.out.println(ele.getAttribute("href"));
    	}
    	//Click on 4th link
    	WebElement ele = links.get(3);
        

      String expectedUrl = ele.getAttribute("href");
      System.out.println("Expected URL: " + expectedUrl);
      ele.click();
      String currentUrl = driver.getCurrentUrl();
      System.out.println("Current URL:" + currentUrl);
      if(expectedUrl.equals(currentUrl)) {
    	  System.out.println("Test Passed");
      }
      else {
    	  System.out.println("Test Failed");
      }
 	  
    }
   
}

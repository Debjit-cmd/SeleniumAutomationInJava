package com.LocatorsCaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// WAP using Selenium web driver. Count no. of links in Holland & Barrett Application Test NG Framework

public class PartialLinkTextDemo {
	WebDriver driver;
	int Total = 0;
	String url = "https://www.hollandandbarrett.com/";
	@BeforeTest
	public void Setup() {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to(url);
    }
    @Test
    public void findElementById() throws Exception {
    	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    	Thread.sleep(20000);
    	driver.findElement(By.partialLinkText("Supplements")).click();
    	
    	List<WebElement> links = driver.findElements(By.xpath("//a"));
    	int nolinks = links.size();
    	
    	System.out.println("No. of Links:"+nolinks);
    	
    	for(int i=1;i<links.size();i++) {
    		System.out.println(links.get(i).getText());
    		String str = links.get(i).getText();
    		String str1 = "Supplements";
    		if(str == str1) {
    			driver.findElement(By.linkText("Supplements")).click();
    			driver.findElement(By.xpath("//a[contains(@type,'button')])[4]")).click();
    		}
    	}
    	
 	  
    }
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
}

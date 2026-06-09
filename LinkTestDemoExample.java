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

public class LinkTestDemoExample {
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
    	driver.findElement(By.linkText("Vitamins & Supplements")).click();
    	
    	List<WebElement> links = driver.findElements(By.xpath("//a"));
    	int linkCount = links.size();
    	Total = Total + linkCount;
    	
    	System.out.println("No. of Links:"+linkCount);
    	
    	for(int i=1;i<links.size();i++) {
    		System.out.println(links.get(i).getText());
    	}
    	
 	  
    }
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
}

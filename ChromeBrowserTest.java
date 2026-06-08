package com.SeleniumWebDriver;
//  import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) throws Exception {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev/downloads/"); //links
	    // driver.manage().window().maximize();
	    // Thread.sleep(3000);
	    driver.manage().window().minimize();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
//	    String pagesource = driver.getPageSource();  
//	    System.out.println(pagesource);
	    driver.quit();
	}

}

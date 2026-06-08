package com.BrowserTestDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdgeBrowser {
	@Test(priority=0)
	public void ChromeBrowserTestOrangeHRM() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // OrangeHRM
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=1)
	public void ChromeBrowserTestOpenCart() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/"); // OpenCart
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=2)
	public void ChromeBrowserTestBing() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/"); // Bing
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=3)
	public void ChromeBrowserTestFreeCRM() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.freecrm.com/"); // FreeCRM
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=4)
	public void ChromeBrowserTestChase() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.chase.com/"); // Chase
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=5)
	public void ChromeBrowserTestAltoro() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://altoro.testfire.net/"); // Altoro
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=6)
	public void ChromeBrowserTestAutomation() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/"); // Test Automation Practice
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=7)
	public void ChromeBrowserPracticeTestAutomation() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/"); // Practice Test Automation Practice
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
	@Test(priority=8)
	public void ChromeBrowserTestDemoBlaze() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/index.html"); // DemoBlaze
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	}
}

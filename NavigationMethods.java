package com.navigationtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NavigationMethods {
	WebDriver driver; 
	@Test
	public void NavigationMethod() {
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}
	@Test
	public void navigateBackDemo() {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	@Test 
	public void RefreshMethod() {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

}


package com.WebDriverActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDown {

	WebDriver driver;

	//String url = "https://www.nopcommerce.com/en";

	@Test(priority=0)
	public void Test() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
		Thread.sleep(2000);

	}
	@Test(priority=1)
	public void Test2() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
		Thread.sleep(2000);

	}
	@Test(priority=2)
	public void Test3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
		Thread.sleep(2000);

	}
	@Test(priority=3)
	public void Test4() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("scrollBy(0,-1000)");
		Thread.sleep(2000);

	}
	@Test(priority=4)
	public void Test5() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");
		Thread.sleep(2000);

		driver.quit();
	}
}

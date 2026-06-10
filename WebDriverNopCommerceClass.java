package com.WebDriverNopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebDriverNopCommerceClass {

    @Test
    public void Test() throws InterruptedException {

        WebDriver driver;

        String url = "https://www.nopcommerce.com/en";

        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement support = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));

        Actions act = new Actions(driver);
        act.moveToElement(support).perform();

        Thread.sleep(2000);
        
        WebElement training = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
        training.click();

        Thread.sleep(3000);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total Images: " + images.size());

        driver.quit();
    }
}
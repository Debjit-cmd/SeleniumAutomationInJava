package SeleniumSpicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumSpicejetClass {
    
    WebDriver driver;

    @BeforeTest
    public void Setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.spicejet.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void RadioButtonTest() throws InterruptedException {
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
        String text = driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).getText();
        System.out.println("Selected Text: " + text);
        
    }
}

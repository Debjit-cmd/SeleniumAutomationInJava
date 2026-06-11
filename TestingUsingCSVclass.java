package com.TestingUsingCSV;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class TestingUsingCSVclass {
	WebDriver driver;
	String csvpath = "C:\\SeleniumJavaPrograms\\Coforge\\Values.csv";

    @BeforeTest
    public void Setup() throws Exception {
        driver = new ChromeDriver();
        driver.navigate().to("https://only-testing-blog.blogspot.com/2014/05/form.html");
        driver.manage().window().maximize();
        
    }
    
    @Test
    public void TestUsingCSV()throws Exception {
    	CSVReader reader = new CSVReader(new FileReader(csvpath)); //used to read csv file
    	String[]csvCell;
    	while((csvCell = reader.readNext())!= null) {
    		String FName = csvCell[0];
    		String LName = csvCell[1];
    		String Email = csvCell[2];
    		String MNumber = csvCell[3];
    		String CName = csvCell[4];
    		driver.findElement(By.name("FirstName")).sendKeys(FName);
    		driver.findElement(By.name("LastName")).sendKeys(LName);
    		driver.findElement(By.name("EmailID")).sendKeys(Email);
    		driver.findElement(By.name("MobNo")).sendKeys(MNumber);
    		driver.findElement(By.name("Company")).sendKeys(CName);
    		
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@value='Submit']")).click();
    		Thread.sleep(2000);
    		driver.switchTo().alert().accept();
    	}
    }
    
    
}

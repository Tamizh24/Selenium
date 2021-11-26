package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Flipkart_TestNG {

	
	public static WebDriver driver;
	
	@BeforeSuite
	private void setUp() {
      System.setProperty("webdriver.chrome.driver", 
    		  System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
      
	}
	@BeforeTest
	private void driver() {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	@BeforeClass
	private void url() throws Throwable {
      driver.get("https://www.flipkart.com/");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	
	@BeforeMethod
	private void home() {
       driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
	}
	
	@Test
   private void mensFasion() {
      driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
      
    }
	
	@Test
	private void glass() throws Throwable {
       driver.findElement(By.linkText("Eyevy")).click();
       Thread.sleep(2000);
	}
	@Test
	private void travel() {
      driver.findElement(By.xpath("//img[@alt='Travel']")).click();
	}
	@AfterMethod
	private void refresh() {
       driver.navigate().refresh();
	}
	
	@AfterClass
	private void signOut() {
         System.out.println("Signout");
	}
	
	@AfterTest
	private void close() {
        driver.quit();
	}
	
	@AfterSuite
	private void deleteCookies() {
       driver.manage().deleteAllCookies();
	}
}

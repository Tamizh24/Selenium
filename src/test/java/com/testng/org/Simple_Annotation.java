 package com.testng.org;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
    	
	@BeforeSuite
	private void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovol\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
	}
	
	@BeforeTest
	private void driverLaunch() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	private void url() {
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7358688614");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Tamizh@24");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	@BeforeMethod
	private void homePage() {
		
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		
		}
	
	@Test
	private void searchFunction() {
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	}
	
	
  	@Test(priority = 0) // priority goes to this scenario
  	private void Laptop() {
  		
  		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
  		//WebDriverWait wait = new WebDriverWait(driver, 20);
  		//wait.until(ExpectedConditions.visibilityOf(element));
  		element.sendKeys("Hp ChromeBook");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
	}
  	
  	@Test
  	private void headPhones() {
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wireless Headphones");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();

  	}
  	
  	@Test(invocationCount = 10) // to check the stability of the application
  	private void earPhones() {
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth EarPhones");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();

  	}
	
	@AfterMethod
	private void refresh() {
		driver.navigate().refresh();
	}
	
	@AfterClass
	private void close() throws AWTException, Throwable {
		WebElement logout = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		Thread.sleep(3000);
		logout.click();
		Thread.sleep(3000);
	    
	}
	
	@AfterTest
	    private void cookies() {
            driver.manage().deleteAllCookies();
		}
	
     @AfterSuite
     private void browserClose() {
		driver.quit();

	}
}

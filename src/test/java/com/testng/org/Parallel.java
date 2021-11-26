package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
     @Test
     private void browser() {
      
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovol\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.findElement(By.id("twotabsearchtextbox")).click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
     }
@Test
private void flipkart() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovol\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.findElement(By.id("twotabsearchtextbox")).click();

}

}

package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider { 
	
	@Test(dataProvider = "login_Credentails")
	private void facebook_Login(String username , String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovol\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}
	
	@DataProvider
	private Object[][] login_Credentails() {
		return new Object[][] {
			
			{"AAA" , "111"} , {"BBB" , "222"} , {"CCC" , "333"}
		};
	}

}

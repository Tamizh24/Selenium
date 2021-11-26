package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {

	@Parameters({ "username", "password" })
	@Test
	private void login_Credentials(String username, String password) {
		System.out.println("Enter a Login Credentials");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovol\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}

}

package com.testng.org;

import org.testng.annotations.*;

public class Demo {

	@BeforeSuite
	private void setUp() {
      System.out.println("SetUp");
	}
	
	@BeforeTest
	private void browser() {
       System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void url() {
      System.out.println("URL");
	}
   @BeforeMethod
   private void login() {
       System.out.println("Login");
  }
	@Test
	private void mobile() {
        System.out.println("Mobile");
	}
	
	@Test
	private void laptop() {
      System.out.println("Laptop");
	}
	
	@AfterMethod
	private void homePage() {
     System.out.println("HomePage");
	}
	
	@AfterClass
	private void logout() {
    System.out.println("Logout");
	}
	
	@AfterTest
	private void deleteCookies() {
		 System.out.println("Delete Cookies");
	}
	@AfterSuite
	private void closeBrowser() {
     System.out.println("Quit");
     
	}
}

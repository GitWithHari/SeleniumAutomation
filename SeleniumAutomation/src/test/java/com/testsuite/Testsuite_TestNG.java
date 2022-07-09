package com.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.libraries.automation.CommonLibraries;

public class Testsuite_TestNG {
	CommonLibraries cl =new CommonLibraries();
	WebDriver driver = cl.selectBrowser();
@BeforeTest
	public void beforeTest() {
		System.out.println("I am inside BeforeTest");
	}
@Test	
public void TC1() throws InterruptedException {
	driver.get("https://google.com");
	Thread.sleep(5000);
}
@Test
public void TC2() throws InterruptedException {
	driver.get("https://yahoo.com");
	Thread.sleep(5000);
}
@AfterTest
public void afterTest() {

	driver.close();
	driver.quit();
}
}

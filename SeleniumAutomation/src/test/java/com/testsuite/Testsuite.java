package com.testsuite;

import org.openqa.selenium.WebDriver;

import com.libraries.automation.CommonLibraries;

public class Testsuite {
	static CommonLibraries cl =new CommonLibraries();
	static WebDriver driver = cl.selectBrowser();
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
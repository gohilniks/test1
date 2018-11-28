package com.test.n1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nikunj-QA\\Downloads\\Selenium_Ref\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() {
		try {
			driver.get("http://gmail.com");
			String title = driver.getTitle();
			driver.findElement(By.id("identifierId")).sendKeys("a@test.com");

			Thread.sleep(3000);
			
//			Adding new comments
			
			

			driver.findElement(By.id("identifierNex")).click();
			System.out.println("Title is " + title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}

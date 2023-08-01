package org.testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	ChromeDriver chrome;
@BeforeTest
public void systemproperties() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivar\\OneDrive\\Eclipse Workspaces\\830PMBatch\\SeleniumProject\\chromedriver.exe" );
    chrome = new ChromeDriver();
    chrome.manage().window().maximize();
}
@Test(priority = 1)
public void openURL() {
	chrome.get("https://login.yahoo.com");
	chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String Actual =chrome.getTitle();
	String Expected = "Yahoo";
	Assert.assertEquals(Actual,Expected);
}
@Test(priority = 2)
public void login() {
	WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(60));
	//WebElement inputbox = 
	wait.until(ExpectedConditions.visibilityOf(chrome.findElement(By.name("usename"))));
	chrome.findElement(By.name("username")).sendKeys("agileit2023@yahoo.com");
    chrome.findElement(By.id("login-signin")).click(); 
    
}
@AfterTest
public void aftertest() {
	//chrome.close();
}
}

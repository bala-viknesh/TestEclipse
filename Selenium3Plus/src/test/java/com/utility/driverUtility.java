package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverUtility {
	
	public static WebDriver getDriver(String browser)
	{
	if(browser.equals("chrome"))
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\My Data\\Software\\Driver Files\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	return new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
	//System.setProperty("webdriver.gecko.driver", "C:\\My Data\\Software\\Driver Files\\xyz.exe");
	WebDriverManager.firefoxdriver().setup();
	return new FirefoxDriver();
	}
	else if(browser.equals("ie"))
	{
	//System.setProperty("webdriver.ie.driver", "C:\\My Data\\Software\\Driver Files\\abc.exe");
	WebDriverManager.iedriver().setup();
	return new InternetExplorerDriver();
	}
	else
	{
	return null;
	}
	}



	}



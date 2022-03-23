package com.A.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public WebDriver setDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
		this.driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return this.driver;
	}

	public WebDriver getDriver()
	{
		return driver;
	}
	public void Browser()
	{
		driver.get("https://www.tickertape.in/");
	}



}


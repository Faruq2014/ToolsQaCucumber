package com.shopToolsQA.Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hooks {
	
	public static WebDriver driver=null;
	

	public static void Chrome_launch() throws InterruptedException
	{
	  ChromeOptions options=new ChromeOptions();

		options.addArguments("disable-infobars");
		//options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver(options);	
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
	

	public static void Firefox_launch() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver=new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
	}
	
	public static void IE_launch() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

}

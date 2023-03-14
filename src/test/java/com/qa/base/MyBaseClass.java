package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.utilitie.AppConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyBaseClass {
	public WebDriver driver;
	@Parameters("browser")
	//@BeforeTest
	
	public WebDriver initializeDriver(String br) throws NumberFormatException,IOException, InterruptedException{
		if(br.equalsIgnoreCase("chrome")){
			//customize and configure a ChromeDriver session
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			//options.addArguments("--headless");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
		}
		else if(br.equalsIgnoreCase("firefox")){
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--incognito");
			//options.addArguments("--headless");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(options);
		}
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.get("https://odette.in/");
		driver.get("https://www.wynisco.com/apply.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
		
		
		public void closeDriver(){
			driver.close();
		}
		public void closeAllDriver(){
			driver.quit();
		}
	
	}



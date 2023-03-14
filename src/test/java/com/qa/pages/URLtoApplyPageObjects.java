package com.qa.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class URLtoApplyPageObjects {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='More']")
	public WebElement moreButton;
	
	@FindBy(xpath="//a[text()='Apply']")
	public WebElement applyButton;
	
	
	//constructor
	public URLtoApplyPageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public void launchApplyPage() throws InterruptedException{
			
			moreButton.click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			applyButton.click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*Thread.sleep(5000);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(applyButton)).click();*/
			
			
		}
	}



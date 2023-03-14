package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ApplyPage {
	WebDriver driver;
	
	//========page object repository===========================
	
	
	//Elements to submit forms
	
	//@FindBy(xpath="//input[@id='First_Name']")
	@FindBy(xpath="//input[@name='First Name']")
	public WebElement firstNameTextbox;
	
	@FindBy(xpath="//input[@id='Last_Name']")
	public WebElement lastNameTextbox;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement emailTextbox;
	
	@FindBy(xpath="//input[@id='Mobile']")
	public WebElement mobileTextbox;
	
	@FindBy(xpath="//select[@id='LEADCF9']")
	public WebElement courseDropDown;

	@FindBy(xpath="//select[@id='LEADCF14']")
	public WebElement residentCountryDropdown;
	
	@FindBy(xpath="//input[@title='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//input[@title='Reset']")
	public WebElement resetButton;
	
	// Page class constructor

			public ApplyPage(WebDriver driver) {

				this.driver = driver;
				
				PageFactory.initElements(driver, this);
			}
			
		//operation#1
		public void hardcode() throws InterruptedException{
			Thread.sleep(5000);
			firstNameTextbox.click();
			firstNameTextbox.sendKeys("aa");
			lastNameTextbox.sendKeys("aa");
			emailTextbox.sendKeys("aa");
			mobileTextbox.sendKeys("123");
			courseDropDown.sendKeys("Quality Assurance");
			residentCountryDropdown.sendKeys("Canada");
		}
		
		
		//operation#2
		
		public void submitData(String firstName, String lastName, String email, 
				String mobile) throws InterruptedException{
			Thread.sleep(5000);
			firstNameTextbox.sendKeys(firstName);
			lastNameTextbox.sendKeys(lastName);
			emailTextbox.sendKeys(email);
			mobileTextbox.sendKeys(mobile);
			courseDropDown.sendKeys("Quality Assurance");
			residentCountryDropdown.sendKeys("Canada");
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		submitButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//operation #3
		
}


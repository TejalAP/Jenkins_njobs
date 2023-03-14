package com.qa.testCases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qa.base.MyBaseClass;
import com.qa.pages.ApplyPage;

public class ApplyPageTest extends MyBaseClass {
	
	public ApplyPage objApplyPage;
	
	@BeforeSuite
	public void fillForm() throws NumberFormatException, IOException, InterruptedException{
		driver=initializeDriver("chrome");
		objApplyPage=new ApplyPage(driver);
	}
	
	/*@Test
	public void reachApplyform() throws InterruptedException{
	URLtoApplyTest objReachtoApply=new URLtoApplyTest();
	objReachtoApply.loadPage();
	}*/

@Test
	public void callhardcode() throws InterruptedException{
	
		objApplyPage.hardcode();
	}
	
	@Test
	public void submitForm() throws InterruptedException{
		objApplyPage.submitData("firstName", "lastName", "email", "mobile");	
		}

	/*	@Test
	public void test(){
	driver.switchTo(driver.findElement(By.xpath("//iframe[@id='wigzo_onsite_temp006']")));
	}*/
}

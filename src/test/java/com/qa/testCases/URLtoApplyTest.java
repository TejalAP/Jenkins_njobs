package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.base.MyBaseClass;
import com.qa.pages.URLtoApplyPageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class URLtoApplyTest  extends MyBaseClass{
	public URLtoApplyPageObjects objURLtoApplyPageObjects;
	@BeforeSuite
	public void startapp() throws NumberFormatException, IOException, InterruptedException{
		driver=initializeDriver("chrome");
		objURLtoApplyPageObjects=new URLtoApplyPageObjects(driver);
		//driver.findElement(By.xpath("//a[text()='More']")).click();
		//driver.findElement(By.xpath("//a[text()='Apply']")).click();
	}
	
	
 
 @Test(priority=1)
 public void loadPage() throws InterruptedException{
	 objURLtoApplyPageObjects.launchApplyPage();
 }
/*@Test(priority=2)
public void closePage(){
	closeAllDriver();
}*/

}

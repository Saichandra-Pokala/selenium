package com.Mavenproject.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Mavenproject.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(userName);
		
		Thread.sleep(5000);
		
		lp.setPassword(password);
		
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		lp.dropDown();
		lp.communityUser();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		lp.enquiry();
		
		lp.clickNew();
		lp.textPopUp();
		lp.firstName();
		lp.lastName();
		lp.middleName();
		lp.addressLine();
		lp.addressLine2();
		lp.addressLine3();
		lp.customerComments();
		lp.enqName();
		lp.email();
		lp.mobile();
		lp.numberofPeople();
		lp.office();
		
		lp.genderDropDown();
		
		lp.closeDate();
		Thread.sleep(5000);
		lp.stateDropDown();
		Thread.sleep(5000);
		lp.city();
		
		
	}
	
	

}

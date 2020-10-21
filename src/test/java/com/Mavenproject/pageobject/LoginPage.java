package com.Mavenproject.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	WebElement txtUserName;
	
	@FindBy(name ="pw")
	WebElement txtpassword;
	
	@FindBy(id ="Login")
	WebElement btnLogin;
	
	@FindBy(id ="workWithPortalButton")
	WebElement manageDropDown;
	
	@FindBy(linkText="Log in to Community as User")
	WebElement Community;
	
	@FindBy(xpath="//*[contains(@title,'MSDS Enquiries')]")
	WebElement enquirylink;
	
	@FindBy(xpath="//*[@title='New']")
	WebElement btnNew;
	
	@FindBy(xpath="//h2[@class='title slds-text-heading--medium slds-hyphenate']")
	WebElement popUpText;
	
	@FindBy(xpath="//div/label/span[text()='First Name']/../following::input[1]")
	WebElement txtFirstName;
	
	@FindBy(xpath="//div/label/span[text()='Middle Name']/../following::input[1]")
	WebElement txtMiddleName;
	
	@FindBy(xpath="//div/label/span[text()='Last Name']/../following::input[1]")
	WebElement txtLastName;
	
	@FindBy(xpath="//div/label/span[text()='Address Line']/../following::input[1]")
	WebElement txtAddressLine;
	
	@FindBy(xpath="//div/label/span[text()='Address Line 2']/../following::input[1]")
	WebElement txtAddressLine2;
	
	@FindBy(xpath="//div/label/span[text()='Address Line 3']/../following::input[1]")
	WebElement txtAddressLine3;
	
	@FindBy(xpath="//div/label/span[text()='Customer Comments']/../following::input[1]")
	WebElement txtCustomerComments;
	
	@FindBy(xpath="//div/label/span[text()='Enq Name']/../following::input[1]")
	WebElement txtEnqName;
	
	@FindBy(xpath="//div/label/span[text()='Mobile']/../following::input[1]")
	WebElement txtMobile;
	
	@FindBy(xpath="//div/label/span[text()='Email']/../following::input[1]")
	WebElement txtEmail;
	
	@FindBy(xpath="//div/label/span[text()='Number of People']/../following::input[1]")
	WebElement txtNumberofPeople;
	
	@FindBy(xpath="//div/label/span[text()='Office No.']/../following::input[1]")
	WebElement txtOffice;
	
	@FindBy(xpath="//div/span/span[text()='Gender']/../following::a[1]")
	WebElement dropdownGender;
	
	
	@FindBy(xpath="//a[contains(text(),'Female')]")
	WebElement dropDownGenderValue;
	
	@FindBy(xpath="//div/span/span[text()='State']/../following::a[1]")
	WebElement dropdownState;
	
	
	@FindBy(xpath="//a[contains(text(),'Telangana')]")
	WebElement dropDownStateValue;
	
	@FindBy(xpath="//div/span/span[text()='Mode of Communication']/../following::a[1]")
	WebElement dropdownCommunication;
	
	
	@FindBy(xpath="//a[contains(text(),'Email')]")
	WebElement dropDownCommunicationValue;
	
	@FindBy(xpath="//div/span/span[text()='Enq Stage']/../following::a[1]")
	WebElement dropdownEnqStage;
	
	
	@FindBy(xpath="//a[contains(text(),'Enquiry')]")
	WebElement dropDownEnqStageValue;
	
	@FindBy(xpath="//div/span/span[text()='Profession Type']/../following::a[1]")
	WebElement dropdownProfessionType;
	
	
	@FindBy(xpath="//a[contains(text(),'Agriculturist/ Farmer')]")
	WebElement dropDownProfessionTypeValue;
	
	@FindBy(xpath="//div/span/span[text()='Enq Status']/../following::a[1]")
	WebElement dropdownEnqStatus;
	
	
	@FindBy(xpath="//a[contains(text(),'Hot')]")
	WebElement dropDownEnqStatusValue;
	
	
	@FindBy(xpath="//div/label/span[text()='Close Date']/../following::a[1]")
	WebElement btncloseDate;
	
	@FindBy(xpath="//td/span[text()='17']")
	WebElement clickCloseDate;
	
	@FindBy(xpath="//label/span[text()='City']/../following::div[@class='contentWrapper slds-box--border'][1]")
	WebElement txtCity;

	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
				
	}
	
	public void dropDown()
	{
		manageDropDown.click();
				
	}
	
	public void communityUser()
	{
		Community.click();
				
	}
	
	public void enquiry()
	{
				
		WebElement element = enquirylink;
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
				
	}
	
	public void clickNew()
	{
	
	btnNew.click();
	}
	public void textPopUp()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		System.out.print(popUpText.getText());
		
		 
	}
	
	
	public void firstName(String fname)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
		
		 
	}
	
	public void middleName(String mname)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtMiddleName.sendKeys(mname);
		 
	}
	
	public void lastName(String lname)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtLastName.sendKeys(lname);
		 
	}
	
	public void addressLine(String adrsline)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtAddressLine.sendKeys(adrsline);
		 
	}
	
	public void addressLine2(String adrsline2)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtAddressLine2.sendKeys(adrsline2);
		 
	}
	
	public void addressLine3(String adrsline3)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtAddressLine3.sendKeys(adrsline3);
		 
	}
	
	public void customerComments(String Ccomments)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtCustomerComments.sendKeys(Ccomments);
		 
	}
	
	public void enqName(String enquiryName)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtEnqName.sendKeys(enquiryName);
		 
	}
	
	public void mobile(String cmobile)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtMobile.sendKeys(cmobile);
		 
	}
	
	public void numberofPeople(String npeople)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtNumberofPeople.sendKeys(npeople);
		 
	}

	public void office(String officeAddress)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtOffice.sendKeys(officeAddress);
		 
	}
	
	public void email(String cemail)
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtEmail.sendKeys(cemail);
		 
	}
	
	public void genderDropDown()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownGender);
		executor.executeScript("arguments[0].click();", dropDownGenderValue);
		
		
		 
	}
	
	public void modeOfCommunication()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownCommunication);
		executor.executeScript("arguments[0].click();", dropDownCommunicationValue);
		
		
		 
	}
	
	public void enqStage()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownEnqStage);
		executor.executeScript("arguments[0].click();", dropDownEnqStageValue);
		
		
		 
	}
	
	
	
	
	
	
	public void stateDropDown()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownState);
		executor.executeScript("arguments[0].click();", dropDownStateValue);
		
		
		 
	}
	
	public void enqStatus()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownEnqStatus);
		executor.executeScript("arguments[0].click();", dropDownEnqStatusValue);
		
		
		 
	}
	
	
	public void professionType()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",dropdownProfessionType);
		executor.executeScript("arguments[0].click();", dropDownProfessionTypeValue);
		
		
		 
	}
	
	public void closeDate()
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		btncloseDate.click();
		clickCloseDate.click();
		
		 
	}
	
	public void city() throws Exception
	{
		String handle=ldriver.getWindowHandles().toArray()[0].toString();
		ldriver.switchTo().window(handle);
		txtCity.sendKeys("Hyde");
		txtCity.click();
		
		 
	}
	
	
}

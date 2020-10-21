package com.Mavenproject.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mavenproject.pageobject.LoginPage;
import com.Mavenproject.utilities.XLUtils;

public class TC_Enquiry_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void newEnquiry(String fname,String mname,String lname,String adrsline,String adrsline2,String adrsline3,String Ccomments,String enquiryName,String cmobile,String npeople,String officeAddress,String cemail) throws Exception
	{
		LoginPage pl = new LoginPage(driver);
		pl.setUserName(userName);
		pl.setPassword(password);
		pl.clickSubmit();
		//pl.dropDown();
		//pl.communityUser();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		pl.enquiry();
		pl.clickNew();
		pl.textPopUp();
		pl.firstName(fname);
		pl.middleName(mname);
		pl.lastName(lname);
		pl.addressLine(adrsline);
		pl.addressLine2(adrsline2);
		pl.addressLine3(adrsline3);
		pl.customerComments(Ccomments);
		pl.enqName(enquiryName);
		pl.email(cemail);
		pl.mobile(cmobile);
		pl.numberofPeople(npeople);
		pl.office(officeAddress);
		pl.genderDropDown();
		pl.stateDropDown();
		pl.closeDate();
		pl.modeOfCommunication();
		pl.enqStage();
		pl.enqStatus();
		pl.professionType();
		pl.city();
		
	}

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/Mavenproject/Testdata/Enquiry.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String Enquirydata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				Enquirydata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
return Enquirydata;
	}
}

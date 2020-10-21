package com.Mavenproject.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;

import com.Mavenproject.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseUrl = readconfig.getAplicationURL();
	public String userName = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
	
	if(br.equals("Chrome"))	
	
	{
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	else if(br.equals("Firefox"))
	{
		
		driver = new FirefoxDriver();
		
	}
	
	else if(br.equals("IE"))
	{
		
		driver = new InternetExplorerDriver();
	}
	driver.get(baseUrl);
	
	
	
	}
	
	//@AfterClass
	//public void tearDown() {	
	//	driver.quit();		
	//}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
			

}

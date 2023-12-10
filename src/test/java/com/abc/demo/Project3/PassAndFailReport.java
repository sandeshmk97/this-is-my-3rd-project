package com.abc.demo.Project3;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PassAndFailReport {


	 ExtentReports extentReport;
	   static ChromeDriver driver;
		@BeforeTest
		public void CreateReport()
		{
			
			extentReport = new ExtentReports();
			ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("./reports/Report.html");
			extentReport.attachReporter(extentSparkReporter);
		}
		@AfterTest
		public void actuallyCreateReport()
		{
			extentReport.flush();
		}
		@SuppressWarnings("deprecation")
		@Test
		public void CheckEAseMyTrip()throws IOException 
		{
		ExtentTest extentTest =extentReport.createTest("Ease My Trip check","this test case checks the website Url with" + "valid Data");
		extentTest.assignAuthor("sandesh");
		extentTest.assignAuthor("windows Chrome 114");
		extentTest.assignCategory("Functional Testing");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		extentTest.log(Status.INFO,"chrome browser will get opened");
		driver=new ChromeDriver(options);
		extentTest.log(Status.PASS,"Chrome browser got opened");
		
		extentTest.log(Status.INFO,"Url will get opened");
		driver.get("https://www.easemytrip.com");
		extentTest.log(Status.PASS, "Url got opened");
		
		extentTest.log(Status.INFO,"Delhi City  will get Selected and clicked");
		driver.findElement(By.xpath("//div[@id='frmcity']")).click();
		extentTest.log(Status.PASS,"Delhi City got Selected and clicked");
		
		extentTest.log(Status.INFO,"Delhi City got Selected and clicked");
		driver.findElement(By.xpath("//span[@class='flsctrhead']")).click(); 
		extentTest.log(Status.PASS,"Delhi City got Selected and clicked");
		try
		{
		extentTest.log(Status.INFO,"Hyderabad City will be typed");
		driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Hyderabad");
		extentTest.log(Status.PASS,"Hyderabad City got typed");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
		}
		catch (StaleElementReferenceException e) 
		{
			extentTest.log(Status.INFO,"Hyderabad City will be typed");
			driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Hyderabad");
			extentTest.log(Status.PASS,"Hyderabad City got typed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		extentTest.log(Status.INFO,"Hyderabad City will get clicked");
		driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/ul/li[1]")).click();
		extentTest.log(Status.PASS,"Hyderabad City got clicked");
		
		driver.findElement(By.xpath("//li[@id='trd_0_10/12/2023']")).click();
		extentTest.log(Status.INFO,"December 10-12-2023 got clicked");
		
		extentTest.log(Status.INFO,"Passengers dropdown  will get clicked");
		driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
		extentTest.log(Status.PASS,"Passengers dropdown got clicked");
		
		driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
		extentTest.log(Status.PASS,"Children1 got selected");
		
		driver.findElement(By.id("traveLer")).click();
		extentTest.log(Status.PASS,"Passengers totaled and clicked on done");
		
		driver.findElement(By.className("srchBtnSe")).click();
		extentTest.log(Status.PASS,"Searching got flights");
		
		File myScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("./screenshots/Pass.png");
		FileUtils.copyFile(myScreenshot,destinationFile);
		}
}





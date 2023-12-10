package com.abc.demo.Project3;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@SuppressWarnings("unused")
public class EaseLogin 
{
	 ChromeDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void EaseLogin()
	{
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.easemytrip.com");
		
		driver.findElement(By.xpath("//div[@id='frmcity']")).click();
		 
		driver.findElement(By.xpath("//span[@class='flsctrhead']")).click();
		 
		driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Hyderabad");
		try 
		{
		driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/ul/li[1]")).click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/ul/li[1]")).click();
		    

		}
		
		driver.findElement(By.xpath("//li[@id='trd_0_10/12/2023']")).click();
		 
	
		driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
        
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
        
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[3]/div[2]/button[2]")).click();
        
        driver.findElement(By.id("traveLer")).click();
        driver.findElement(By.className("srchBtnSe")).click();
        

        driver.findElement(By.xpath("//*[@id=\"ResultDiv\"]/div/div/div[4]/div[3]/div[1]/div[1]/div[6]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/form/div[14]/div[6]/div[1]/div[4]/div[2]/div[2]/div[24]/div[3]/div[3]/label/span")).click();
        driver.findElement(By.id("txtEmailId")).sendKeys("Sagarg311997@gmail.com");
        driver.findElement(By.id("spnVerifyEmail")).click();
        

        WebElement myDropDown=driver.findElement(By.name("TitleAdult"));
		  myDropDown.click();
		  Select s=new Select(myDropDown);
		   s.selectByIndex(1);
		   
        driver.findElement(By.id("txtFNAdult0")).sendKeys("Sagar");
		driver.findElement(By.id("txtLNAdult0")).sendKeys("G");
		
		
		 
		WebElement myDropDown1=driver.findElement(By.name("TitleChild"));
		  myDropDown1.click();
		  Select s1=new Select(myDropDown1);
		   s1.selectByIndex(2);
		  
		 driver.findElement(By.id("txtFNChild0")).sendKeys("Goutham");
	     driver.findElement(By.id("txtLNChild0")).sendKeys("G");  
	     
	     driver.findElement(By.xpath("//*[@id=\"divTravlerEntry\"]/div[2]/div/a[2]")).click();
	     
	     
	     WebElement myDropDown2=driver.findElement(By.id("titleChild1"));
		  myDropDown2.click();
		  Select s2=new Select(myDropDown2);
		   s2.selectByIndex(2);
		  driver.findElement(By.id("txtFNChild1")).sendKeys("Sujith");
		   driver.findElement(By.id("txtLNChild1")).sendKeys("PN");  
		   
		   
		   WebElement myDropDown3=driver.findElement(By.name("TitleInfant"));
			  myDropDown3.click();
			  Select s3=new Select(myDropDown3);
			  s3.selectByIndex(1);
			  driver.findElement(By.id("txtFNInfant0")).sendKeys("Niveditha");
			   driver.findElement(By.id("txtLNInfant0")).sendKeys("PN");
			   
			   
		 WebElement myDropDown4=driver.findElement(By.name("InfantDay"));
		 myDropDown4.click();
	     Select s4=new Select(myDropDown4);
	     s4.selectByIndex(11);
	     
	     WebElement myDropDown5=driver.findElement(By.name("InfantMonth"));
		 myDropDown5.click();
	     Select s5=new Select(myDropDown5);
	     s5.selectByIndex(10);
	     
	     WebElement myDropDown6=driver.findElement(By.name("InfantYear"));
		 myDropDown6.click();
	     Select s6=new Select(myDropDown6);
	     s6.selectByIndex(2);
	     
	     driver.findElement(By.id("txtCPhone")).sendKeys("7259216978");
	     
	     driver.findElement(By.id("spnTransaction")).click();
	     driver.findElement(By.xpath("//*[@id=\"seatPo_0\"]/div[6]/a[2]")).click();
	     driver.findElement(By.xpath("//*[@id=\"DivContinueAncillary\"]/span")).click();
	     driver.findElement(By.xpath("//*[@id=\"DivContinueAncillary\"]/span")).click();
	     driver.findElement(By.xpath("//*[@id=\"DivContinueAncillary\"]/span")).click();
	     driver.findElement(By.xpath("//*[@id=\"DivContinueAncillary\"]/span")).click();
	     
	     
	
	///////////////////////NEW YORK TO BANGKOK WITH PASS SCREEN SHOT AND PASS REPORT/////////////////////////
	
	/*ExtentReports extentReport;
	@BeforeTest
	  public void CreateReport()
	   {
		extentReport = new ExtentReports();
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("./PASSANDFAILreports/passreport.html");
		extentReport.attachReporter(extentSparkReporter);
	   }
	 @AfterTest
	 public void actuallyCreateReport()
	   {
		extentReport.flush();
	   }
	 @SuppressWarnings("deprecation")
	 @Test
	 public void EaseLOgin() throws IOException 
	   {
	    ExtentTest extentTest =extentReport.createTest("Ease My Trip check","this test case checks the website Url with" + "valid Data");
	    extentTest.assignAuthor("Sagar G");
		extentTest.assignAuthor("windows Chrome 114");
		extentTest.assignCategory("Functional Testing");	
		
		extentTest.log(Status.INFO,"chrome browser will get opened");
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver.manage().window().maximize();
		extentTest.log(Status.PASS,"chrome browser got opened");
	
		extentTest.log(Status.INFO,"URL will will get opened");
		driver.get("https://www.easemytrip.com");
		extentTest.log(Status.PASS,"URL got opened");
		
		extentTest.log(Status.INFO,"From search prompt will get opened");
		driver.findElement(By.id("FromSector_show")).click();
		extentTest.log(Status.PASS,"From search prompt got opened");
		extentTest.log(Status.INFO," New YORK will get typed");
		driver.findElement(By.id("a_FromSector_show")).sendKeys("NEW YORK");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		try 
		{
		extentTest.log(Status.INFO," New YORK will get Selected and clicked");
		driver.findElement(By.id("spnNew York")).click();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		catch(StaleElementReferenceException e)
		{
		driver.findElement(By.id("spnNew York")).click();
		extentTest.log(Status.PASS," New YORK got Selected and clicked");
		}
		
		extentTest.log(Status.INFO," BANGKOK will get typed");
		driver.findElement(By.id("a_Editbox13_show")).sendKeys("BANGKOK");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		extentTest.log(Status.PASS," BANGKOK got typed");
		
		extentTest.log(Status.INFO,"BANGKOK will get Selected and clicked");
		driver.findElement(By.xpath("//span[@id='spnBangkok']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		extentTest.log(Status.PASS,"New YORK got Selected and clicked");
		
		extentTest.log(Status.INFO,"Departure date will get selected and clicked");
	    driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[2]/div/div[6]/ul/li[4]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	    extentTest.log(Status.PASS,"Departure date got selected and clicked");
	    
	    extentTest.log(Status.INFO,"return date will get selected and clicked");
		driver.findElement(By.xpath("//div[@id='divRtnCal']")).click();
		extentTest.log(Status.PASS,"Departure date got selected and clicked");
		
		driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div[7]/ul/li[4]")).click();
		
		extentTest.log(Status.INFO,"passengers dropdown will get selected");
		driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
		extentTest.log(Status.PASS,"passengers dropdown got selected");
		
		extentTest.log(Status.INFO,"children and infant will get incremented");
	    driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[3]/div[2]/button[2]")).click();
        extentTest.log(Status.PASS,"children and infant got incremented");
        
        extentTest.log(Status.INFO,"Done button will be clicked");
        driver.findElement(By.id("traveLer")).click();
        extentTest.log(Status.PASS,"Done button got clicked");
        
        extentTest.log(Status.INFO,"Search button will be clicked");
        driver.findElement(By.className("srchBtnSe")).click();
        extentTest.log(Status.PASS,"Done button got clicked");
        
        File myScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("./PassANDFailScreenshots/Pass.png");
		FileUtils.copyFile(myScreenshot,destinationFile);*/
	
		
///////////////////////NEW YORK TO BANGKOK WITH FAIL SCREEN SHOT AND FAIL REPORT/////////////////////////
		
		/*ExtentReports extentReport;
		@BeforeTest
		  public void CreateReport()
		   {
			extentReport = new ExtentReports();
			ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("./PASSANDFAILreports/failReport.html");
			extentReport.attachReporter(extentSparkReporter);
		   }
		 @AfterTest
		 public void actuallyCreateReport()
		   {
			extentReport.flush();
		   }
		 @SuppressWarnings("deprecation")
		 @Test
		 public void EaseLOgin() throws IOException 
		   {
		    ExtentTest extentTest =extentReport.createTest("Ease My Trip check","this test case checks the website Url with" + "valid Data");
		    extentTest.assignAuthor("Sagar G");
			extentTest.assignAuthor("windows Chrome 114");
			extentTest.assignCategory("Functional Testing");	
			extentTest.log(Status.INFO,"chrome browser will get opened");
			
			ChromeDriver driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver.manage().window().maximize();
			extentTest.log(Status.PASS,"chrome browser got opened");
		
			extentTest.log(Status.INFO,"URL will will get opened");
			driver.get("https://www.easemytrip.com");
			extentTest.log(Status.PASS,"URL got opened");
			
			extentTest.log(Status.INFO,"From search prompt will get opened");
			driver.findElement(By.id("FromSector_show")).click();
			extentTest.log(Status.PASS,"From search prompt got opened");
			
			extentTest.log(Status.INFO," New YORK will get typed");
			driver.findElement(By.id("a_FromSector_show")).sendKeys("NEW YORK");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			extentTest.log(Status.PASS,"NEW YORK got typed");
			try
			{
			extentTest.log(Status.INFO," New YORK will get Selected and clicked");
			driver.findElement(By.id("spnNew York")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			}
			catch(StaleElementReferenceException e) 
			{
			driver.findElement(By.id("spnNew York")).click();
			}
			extentTest.log(Status.PASS," New YORK got Selected and clicked");
			
			extentTest.log(Status.INFO," BANGKOK will get typed");
			driver.findElement(By.id("a_Editbox13_show")).sendKeys("BANGKOK");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			extentTest.log(Status.PASS," BANGKOK got typed");
			
			extentTest.log(Status.INFO,"BANGKOK will get Selected and clicked");
			driver.findElement(By.xpath("//span[@id='spnBangkok']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			extentTest.log(Status.PASS,"New YORK got Selected and clicked");
			
			extentTest.log(Status.INFO,"Departure date will get selected and clicked");
		    driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[2]/div/div[6]/ul/li[4]")).click();
		    extentTest.log(Status.PASS,"Departure date got selected and clicked");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		    try
		    {
		    extentTest.log(Status.INFO,"return date will get selected and clicked");
			driver.findElement(By.xpath("//div[@id='diRtnCal']")).click();
		    }
		    catch(NoSuchElementException e)
		    {
		    	extentTest.log(Status.FAIL,"Return Date locator couldnot be located");	
		    }
		    File myScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File destinationFile=new File("./PassANDFailScreenshots/Fail.png");
		    FileUtils.copyFile(myScreenshot,destinationFile);
			extentTest.log(Status.PASS,"Return date got selected and clicked");
			
			driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[4]/div[2]/div/div[1]/div/div[7]/ul/li[4]")).click();
			
			extentTest.log(Status.INFO,"passengers dropdown will get selected");
			driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
			extentTest.log(Status.PASS,"passengers dropdown got selected");
			
			extentTest.log(Status.INFO,"children and infant will get incremented");
		    driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[3]/div[2]/button[2]")).click();
	        extentTest.log(Status.PASS,"children and infant got incremented");
	        
	        extentTest.log(Status.INFO,"Done button will be clicked");
	        driver.findElement(By.id("traveLer")).click();
	        extentTest.log(Status.PASS,"Done button got clicked");
	        
	        extentTest.log(Status.INFO,"Search button will be clicked");
	        driver.findElement(By.className("srchBtnSe")).click();
	        extentTest.log(Status.PASS,"Done button got clicked");*/
	}

}


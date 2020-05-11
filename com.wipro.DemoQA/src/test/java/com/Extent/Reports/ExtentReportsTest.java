package com.Extent.Reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class ExtentReportsTest {
	
	@Test
	public void loginTest()
	{
		System.out.println("login to Tools QA");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/toolsQA.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger=extent.createTest("login test");
		
		logger.log(Status.INFO, "Login to Amazon");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
		
		ExtentTest logger2=extent.createTest("logoff test");
		
		logger2.log(Status.INFO, "Logoff to Amazon");
		logger2.log(Status.FAIL, "Title verified");
		//logger2.fail("failed because of invalid id",MediaEntityBuilder.createScreenCaptureFromPath("D:\\Wipro_SEL\\com.wipro.DemoQA\\Screenshots\\capture.JPG")).build();
		extent.flush();
		
	}

}

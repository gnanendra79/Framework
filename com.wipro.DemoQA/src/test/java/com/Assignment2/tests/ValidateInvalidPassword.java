package com.Assignment2.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Assignment2.Olay.LoginPage_Olay;
import com.Assignment2.Olay.RegisterPage;

import Utility.BrowserFactory;
import Utility.ExcelDataConfig;

public class ValidateInvalidPassword {

	@Test(dataProvider="OlayData")
	public void verifyOlayRegistration(String uid,String pwd)
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.olay.co.uk/en-gb/loginpage");
		
		
		LoginPage_Olay login_Uk=PageFactory.initElements(driver, LoginPage_Olay.class);
		
		
		
		login_Uk.validateInvalidPassword(uid,pwd);
		
		//login_Uk.forgotPassword();
	    
	}
	
	@DataProvider(name="OlayData")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("D:\\Wipro_SEL\\com.wipro.DemoQA\\TestData\\InputData.xlsx");
		
		int rows=config.getRowCount(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
		}
		return data;
	}
}

package com.Assignment2.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Assignment2.Olay.RegisterPage;

import Utility.BrowserFactory;
import Utility.ExcelDataConfig;

public class VerifyOlayRegister {

	@Test(dataProvider="OlayRegisterData")
	public void verifyOlayRegistration(String usr_name,String pwd_pass)
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.olay.co.uk/en-gb/createprofilepage");
		
		
		RegisterPage reg=PageFactory.initElements(driver, RegisterPage.class);
		
		reg.registerMethod(usr_name,pwd_pass);
	    
	
//		WebElement day=driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][day]\"]"));
//		
//		Select day_dd=new Select(day);
//		day_dd.selectByVisibleText("5");
	}
	
	@DataProvider(name="OlayRegisterData")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("D:\\Wipro_SEL\\com.wipro.DemoQA\\TestData\\InputData.xlsx");
		
		int rows=config.getRowCount(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(1, i, 0);
			data[i][1]=config.getData(1, i, 1);
		}
		return data;
	}
}

package com.wipro.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;

public class DatePicker {
	
	@Test
	public void checkDatePicker() throws Exception
	{
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://demoqa.com/datepicker/");
		
		DatePicker_DOB date_pick=PageFactory.initElements(driver, DatePicker_DOB.class);
		
		date_pick.verifyDatePicker();
		
	}

}

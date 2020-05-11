package com.wipro.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Assignment2.Olay.LoginPage_Olay;

import Utility.BrowserFactory;

public class VerifyRentalCarBooking {
	
	@Test
	public void verifyCarBook()
	{
	
	WebDriver driver=BrowserFactory.startBrowser("chrome", "https://demoqa.com/controlgroup/");
	
	RentalCarPage rental_car=PageFactory.initElements(driver, RentalCarPage.class);
	
	rental_car.rentalCarBook();
	
	}
	

}

package com.wipro.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;

public class SelectMenuOptions {
	@Test
	public void checkMenuOptions() throws Exception
	{
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://demoqa.com/selectmenu/");
		
		SelectMenu select_menu=PageFactory.initElements(driver, SelectMenu.class);
		
		select_menu.VerifySelect_Speed();
		select_menu.VerifySelect_File();
		select_menu.VerifySelect_Number();
		select_menu.VerifySelect_title();
		driver.quit();
	}
}

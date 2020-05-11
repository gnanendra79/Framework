package com.wipro.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;

public class OpenLink_NewTab {
	
	@Test
	public void checkHtmlContactForm()
	{
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://demoqa.com/html-contact-form/");
		
		HtmlContactForm contact_form=PageFactory.initElements(driver, HtmlContactForm.class);
		
		//contact_form.fill_htmlContactForm();
		contact_form.openLinkNewTab();
	}

}

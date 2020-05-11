package com.wipro.DemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePicker_DOB {
	
	@FindBy(how=How.XPATH,using="//input[@id='datepicker']")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div")
	WebElement monthyear;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
	WebElement leftClick;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a")
	WebElement days;
	
	String month="August 2019";
	String day="05";
	
	public void verifyDatePicker() throws Exception
	{
		date.click();
		
		Thread.sleep(2000);
	
		
		while(true)
		{
			String text=monthyear.getText();
			if(text.equals(month))
			{
				break;
			}else
			{
				leftClick.click();
			}
		}
		days.click();
		
		
	}
	
}

package com.wipro.DemoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[@id='speed-button']")
	WebElement  select_a_speed;
	
	@FindBy(how=How.XPATH,using="//span[@id='files-button']")
	WebElement  select_a_file;
	
	@FindBy(how=How.XPATH,using="//span[@id='number-button']")
	WebElement  select_a_number;
	
	@FindBy(how=How.XPATH,using="//span[@id='salutation-button']")
	WebElement  select_a_title;
	
	public SelectMenu(WebDriver driver1)
	{
		this.driver=driver1;
	}

	public void VerifySelect_Speed() throws Exception
	{
		select_a_speed.click();
		
		List<WebElement> dd_speed=driver.findElements(By.xpath("//ul[@id='speed-menu']//li/div"));
		for(WebElement element:dd_speed)
		{
			
			element.click();
			break;
			
		}
		
		
		
	}
	public void VerifySelect_File()
	{
		select_a_file.click();
		
		List<WebElement> dd_file=driver.findElements(By.xpath("//ul[@id='files-menu']//li/div"));
		for(WebElement element:dd_file)
		{
			
			element.click();
			break;
			
		}
		
	}
	
	public void VerifySelect_Number()
	{
		select_a_number.click();
		
		List<WebElement> dd_number=driver.findElements(By.xpath("//ul[@id='number-menu']//li/div"));
		for(WebElement element:dd_number)
		{
			
			element.click();
			break;
			
		}
		
	}
	public void VerifySelect_title()
	{
		select_a_title.click();
				
		List<WebElement> dd_title=driver.findElements(By.xpath("//ul[@id='salutation-menu']//li/div"));
		//String dd1=driver.findElement(By.xpath("//*[@id='ui-id-2']")).getText();
		for(WebElement element:dd_title)
		{
		
		element.click();
			break;
			
		}
		
	}
	
}

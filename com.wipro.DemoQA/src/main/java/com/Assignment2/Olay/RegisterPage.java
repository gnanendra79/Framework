package com.Assignment2.Olay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(id="phdesktopbody_0_grs_account[emails][0][address]")
	WebElement emailId;
	
	@FindBy(how=How.XPATH,using="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement confirm_password;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement day;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement month;
	
	@FindBy(xpath="//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_submit']")
	WebElement RegisterAndCreateProfile;
	
	
	public RegisterPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void day_Method()
	{
		day.click();
		Select day_sel=new Select(day);
		day_sel.selectByVisibleText("1");
	}
	
	public void month_Method()
	{
		
		Select month_sel=new Select(month);
		month_sel.selectByVisibleText("1");
	}
	
	public void year_Method()
	{
		
		Select year_sel=new Select(year);
		year_sel.selectByVisibleText("1990");
		
	}
	
	public void registerMethod(String usr, String pas)
	{
		//accept all cookies
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		emailId.sendKeys(usr);
		password.sendKeys(pas);
		confirm_password.sendKeys(pas);
		day_Method();
		month_Method();
		year_Method();
		RegisterAndCreateProfile.click();
		
	}
}

package com.Assignment2.Olay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage_Olay {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='phdesktopbody_0_username']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='phdesktopbody_0_password']")
	WebElement password;

	@FindBy(how=How.XPATH,using="//input[@id='phdesktopbody_0_SIGN IN']")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"phdesktopbody_0_forgotpassword\"]")
	WebElement forgot_password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"phdesktopbody_0_NEXT\"]")
	WebElement next;
	
	public LoginPage_Olay(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginMethod(String user_name,String pass)
	{
		email.sendKeys(user_name);
		password.sendKeys(pass);
		signin.click();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("View Profile"));
	}
	
	public void validateInvalidPassword(String user_name,String pass)
	{
		email.sendKeys(user_name);
		password.sendKeys(pass);
		signin.click();
		
		String actual_error=driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Message\"]")).getAttribute("innerHtml");
		
		Assert.assertTrue(actual_error.contains("The email and password combination you entered is incorrect."));
	}
//	public void forgotPassword()
//	{
//		forgot_password.click();
//		email.sendKeys("kpl@gmail.com");
//		next.click();
//		
//		//System.out.println(driver.getTitle());
//		String actual_error=driver.findElement(By.xpath("//*[@id='phdesktopbody_0_Message']")).getAttribute("innerHtml");
//		
//		Assert.assertTrue(actual_error.contains("We have sent an email to your email address, please click on the link in the email to reset your password."));
	
//	}
	
}

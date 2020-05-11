package com.wipro.DemoQA;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HtmlContactForm {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/input[1]")
	WebElement firstName;
	
	@FindBy(how=How.ID,using="lname")
	WebElement lastName;
	
	@FindBy(how=How.CSS,using="input[name='country']")
	WebElement country;
	
	@FindBy(how=How.LINK_TEXT,using="Google Link")
	WebElement googleLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="here")
	WebElement googleLinkIsHere;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='subject']")
	WebElement subject;
	
	@FindBy(how=How.XPATH,using="//div[@id=\"content\"]/div[2]/div/form/input[4]")
	WebElement submit;
	
	@FindBy(how=How.CSS,using="Body")
	WebElement newTab;
	
	public HtmlContactForm(WebDriver driver1) 
	{
		this.driver=driver1;
	}
	
	public void fill_htmlContactForm()
	{
		firstName.sendKeys("Gnanendra");
		lastName.sendKeys("Reddy");
		country.sendKeys("india");
		subject.sendKeys("Case Study1 Testing");
		submit.click();
		String actual_message=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertTrue(actual_message.contains("Demo Website to Practice Automation"), "Title is not matched");
		driver.quit();
	}
	
	public void openLinkNewTab()
	{
		String SelectLinkNewTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		googleLink.sendKeys(SelectLinkNewTab);
		ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title is not matched");
		driver.quit();
	}
	
}

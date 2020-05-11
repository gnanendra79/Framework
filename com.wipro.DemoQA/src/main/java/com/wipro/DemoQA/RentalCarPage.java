package com.wipro.DemoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class RentalCarPage {

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[@id='car-type-button']")
	WebElement car_type_button;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/label[1]")
	WebElement Standard_radio_button;
	
	@FindBy(how=How.XPATH,using="//div[@class='controlgroup ui-controlgroup ui-controlgroup-horizontal ui-helper-clearfix']//label[@class='ui-button ui-widget ui-checkboxradio-radio-label ui-checkboxradio-label ui-controlgroup-item'][contains(text(),'Automatic')]")
	WebElement automatic_radio_button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div[2]/div/fieldset[1]/div/label[3]")
	WebElement insurance_checkbox;
	
	@FindBy(how=How.XPATH,using="//input[@id='horizontal-spinner']")
	WebElement number_of_cars;
	
	@FindBy(how=How.XPATH,using="//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")
	WebElement book_now;
	
	public RentalCarPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void rentalCarBook()
	{
		car_type_button.click();
		carTypeDropdown();
		Standard_radio_button.click();
		insurance_checkbox.click();
		number_of_cars.sendKeys("2");
		System.out.println(book_now.getText());
		book_now.click();
		Assert.assertTrue(book_now.getText().contains("Book Now!"), "Text not matched");
		driver.quit();
	}
	
	public void carTypeDropdown()
	{
	List<WebElement> car_list=driver.findElements(By.xpath("//ul[@id='car-type-menu']//li/div"));
	for(WebElement element:car_list)
	{
		
		element.click();
		break;
		
	}
  }
	
	
}
	


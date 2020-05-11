package com.wipro.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Droppable {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='draggable']")
	WebElement drag;
	
	@FindBy(xpath="//*[@id='droppable']")
	WebElement drop;
	
	
	public void dragAndDropMethod() throws InterruptedException
	{
		
		Actions act=new Actions(driver);	
		Thread.sleep(5000);
		act.dragAndDrop(drag, drop).build().perform();
	}

}

package com.wipro.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;
import Utility.Screenshots;

public class VerifyDragAndDrop {
	
	@Test
	public void VerifyDoppler() throws Exception
	{
		
		WebDriver driver;
		
		driver=BrowserFactory.startBrowser("chrome", "https://demoqa.com/droppable/");
		
//		Droppable drag_obj=PageFactory.initElements(driver, Droppable.class);		
//		drag_obj.dragAndDropMethod();
		
		 
			 
		Actions act=new Actions(driver);	
		Thread.sleep(5000); 
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));

		act.dragAndDrop(drag, drop).build().perform();
		
		Screenshots screen_shot=new Screenshots();
		screen_shot.failed();
		driver.quit();
	}

}

package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	
	WebDriver driver;
	public void failed()
	{
		
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(SrcFile, new File("D:\\Wipro_SEL\\com.wipro.DemoQA\\Screenshots\\captur.jpg"));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}

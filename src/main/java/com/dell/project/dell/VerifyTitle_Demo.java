package com.dell.project.dell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		String ExpectedTitle= "Computers, Monitors & Technology Solutions | Dell USA";
		String ActualTitle = "";
		ActualTitle = driver.getTitle();
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			
			System.out.println("Test Case Pass");
			
			
		}
		else {
			
			System.out.println("Test Case Failed");
		}
		
		
		driver.close();
		
	}

}

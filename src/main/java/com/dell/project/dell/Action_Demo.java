package com.dell.project.dell;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action_Demo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.id("l1_5"))).build().perform();
		
		driver.findElement(By.linkText("Pay Bill & Manage Account")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
		
		

	}

}

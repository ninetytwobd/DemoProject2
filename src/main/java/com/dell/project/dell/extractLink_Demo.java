package com.dell.project.dell;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class extractLink_Demo {
	
	@Test
	
	public void extractDEmo() {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
		
	/*	
		List<WebElement> AllLink = driver.findElements(By.tagName("a"));
		
		
		for(int i = 0; i <AllLink.size();i ++) {
			
			
			System.out.println(AllLink.get(i).getAttribute("href"));*/
			
		List<WebElement> src = driver.findElements(By.tagName("a"));
		/*
		 * for(WebElement sp : src) {
		 * 
		 * 
		 * System.out.println("List "+sp);
		 * 
		 * }
		 */
		
		for(int i=0; i<src.size();i++) {
			
		 System.out.println("List "+src);
		}
		
		
			driver.close();
			
			
		}
	}


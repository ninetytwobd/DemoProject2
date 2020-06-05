package com.dell.project.dell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Emirats_Demo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.emirates.com/us/english/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' BOOK ']")).click();
		
		Thread.sleep(10000);
		
		driver.close();
	

	}

}

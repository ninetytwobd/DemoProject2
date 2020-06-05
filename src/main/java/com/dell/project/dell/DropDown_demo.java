package com.dell.project.dell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement bangladesh = driver.findElement(By.name("country"));
		
		Select sl= new Select(bangladesh);
		sl.selectByIndex(0);
		
		sl.selectByValue("4");
		
		sl.selectByVisibleText("ANTARCTICA ");
		
		Thread.sleep(10000);
		
		
		
		
	

	}

}

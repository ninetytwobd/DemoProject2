package com.dell.project.dell;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caledender_Demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).clear();
		driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("DFW");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).clear();
		
		driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("LGA");
		
		JavascriptExecutor date = (JavascriptExecutor) driver;
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='02/13/2020'");
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='02/20/2020'");
		
		
	driver.findElement(By.xpath("//button[@class='actionable actionable_button actionable_no-outline actionable_primary button submit-button form-container--search-button']")).click();
	
	Thread.sleep(10000);

	}

}

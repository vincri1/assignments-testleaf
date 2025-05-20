package com.org.testleaf.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("label")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Richard");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vincent");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestTaps");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("View Lead | opentaps CRM"))
			System.out.println("Title is displayed correctly");
		else
			System.out.println("Title is not displayed correctly");
		Thread.sleep(3000);
		driver.quit();

	}

}

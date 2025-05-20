package com.org.testleaf.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("accountName")).sendKeys("Richard Vincent");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("8");
		driver.findElement(By.name("officeSiteName")).sendKeys("TestTaps");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Account Details | opentaps CRM"))
			System.out.println("Title is displayed correctly");
		else
			System.out.println("Title is not displayed correctly");
		Thread.sleep(3000);
		driver.quit();

	}

}

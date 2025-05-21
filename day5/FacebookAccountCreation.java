package com.org.testleaf.week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");

		WebElement we = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(we);
		select.selectByValue("27");

		WebElement we2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select2 = new Select(we2);
		select2.selectByVisibleText("Jun");

		WebElement we3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select3 = new Select(we3);
		select3.selectByValue("1993");

		WebElement we4 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select4 = new Select(we4);
		select4.selectByValue("1993");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test.user@yopmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("UserTest@243");

		driver.quit();
	}

}

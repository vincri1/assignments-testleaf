package com.org.testleaf.week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		String name = "Richard V";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(name);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");

		WebElement we = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select select = new Select(we);
		select.selectByValue("IND_SOFTWARE");

		WebElement we2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select select2 = new Select(we2);
		select2.selectByVisibleText("S-Corporation");

		WebElement we3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select select3 = new Select(we3);
		select3.selectByValue("LEAD_EMPLOYEE");

		WebElement we4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select select4 = new Select(we4);
		select4.selectByIndex(6);

		WebElement we5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select select5 = new Select(we5);
		select5.selectByValue("TX");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String accountName = driver
				.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"))
				.getText();

		if (accountName.contains(name))
			System.out.println("Name is matching");
		else
			System.out.println("Name is not matching");
		driver.quit();
	}

}

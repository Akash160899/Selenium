package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.get("https://www.instagram.com/");
		a.manage().window().maximize();

		String t = a.getTitle();
		System.out.println(t);
		
		Thread.sleep(3000);
		
		WebElement b = a.findElement(By.name("username"));
		b.sendKeys("akash");
		
		TakesScreenshot c=(TakesScreenshot) a;
		File f = c.getScreenshotAs(OutputType.FILE);
	File m=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Screenshots\\pic1.png");

	FileHandler.copy(f, m);
	}
	
}

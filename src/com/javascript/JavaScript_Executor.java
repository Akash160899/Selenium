package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();
		a.get("https://twitter.com/?lang=en");
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement c = a.findElement(By.xpath("(//span[contains(@class,'o')])[14]"));
		

		JavascriptExecutor d = (JavascriptExecutor) a;
		d.executeScript("arguments[0].scrollIntoView();", c);
	

		d.executeScript("window.scrollBy(0,-2500);");//scroll up
		Thread.sleep(2000);

	//	d.executeScript("window.scrollBy(0,2000);");//scroll down

	

	}

}

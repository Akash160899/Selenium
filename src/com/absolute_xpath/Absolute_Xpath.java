package com.absolute_xpath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.selenium.Screenshots;

public class Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  WebDriver a = new ChromeDriver(); a.get("https://www.whatsapp.com/");
		  a.manage().window().maximize(); Thread.sleep(7000);
		  
		   a.findElement(By.xpath(
		  "/html/body/div/div/div/header/div/div[2]/span/a[4]/h5")).click();
		   Thread.sleep(5000);
		 

		a.navigate().to("https://www.instagram.com/");
		a.manage().window().maximize();
		Thread.sleep(7000);

		a.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div[2]/div/p/a/span")).click();
		Thread.sleep(3000);

		a.findElement(By.xpath("/html/body/div/section/main/div/div/div/div/form/div[3]/div/label/input"))
				.sendKeys("akash@gmail.com");
		
		a.findElement(By.xpath("/html/body/div/section/main/div/div/div/div/form/div[4]/div/label/input")).sendKeys("akash");
		Thread.sleep(3000);
		
		TakesScreenshot s= (TakesScreenshot) a;
		File sc = s.getScreenshotAs(OutputType.FILE);
		
	File m=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Screenshots\\pic2.png");
		FileHandler.copy(sc, m);
		
a.quit();
	}

}

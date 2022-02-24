package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts  {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver a=new ChromeDriver();
		a.get("http://www.leafground.com/pages/Alert.html");
		a.manage().window().maximize();
		
		
		//single alert
	a.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	
		
		//  Alert b = a.switchTo().alert(); Thread.sleep(3000); b.accept();
		 
		
		
		
		  //confirm alert
		  a.findElement(By.xpath("//button[text()='Confirm Box']")).click(); Alert c =
		  a.switchTo().alert(); Thread.sleep(3000); String text = c.getText();
		  System.out.println(text); c.dismiss();
		  
		  
		  a.findElement(By.xpath("//button[text()='Prompt Box']")).click(); Alert d =
		  a.switchTo().alert(); Thread.sleep(3000); d.sendKeys("akash"); d.accept();
		  
		  a.close();
		  
		  
		 
		
		
		
		
		
	}

}

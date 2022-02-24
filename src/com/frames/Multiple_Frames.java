package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiple frames handling
		
		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("http://www.leafground.com/pages/frame.html");
		wd.manage().window().maximize();
		
		Actions ac=new Actions(wd);
		
		  WebElement outer = wd.findElement(By.xpath("//iframe[@src='page.html']"));
		  
		  wd.switchTo().frame(outer);
		 
		WebElement inner = wd.findElement(By.xpath("(//iframe[@width='210'])[1]"));
		wd.switchTo().frame(inner);
		wd.findElement(By.id("Click1")).click();
		
		wd.switchTo().defaultContent();
		

		
		
	}

}

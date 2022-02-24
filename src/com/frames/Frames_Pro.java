package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single frame handling....
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("http://www.leafground.com/pages/frame.html");
		wd.manage().window().maximize();
		
		WebElement ck = wd.findElement(By.xpath("//iframe[@src='default.html']"));
		
		wd.switchTo().frame(ck);
		
		wd.findElement(By.id("Click")).click();
		wd.switchTo().defaultContent();
		
		Actions a=new Actions(wd);
		
		WebElement db = wd.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']"));
		
		a.doubleClick(db).build().perform();

	}

}

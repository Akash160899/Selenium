package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("http://www.leafground.com/pages/frame.html");
		wd.manage().window().maximize();
		
		Actions a=new Actions(wd);
		
		WebElement one = wd.findElement(By.xpath("//iframe[@src='countframes.html']"));
		wd.switchTo().frame(one);
		
		WebElement two = wd.findElement(By.name("frame2"));
		wd.switchTo().frame(two);
		
		wd.switchTo().defaultContent();
		
WebElement db = wd.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']"));
		
		a.doubleClick(db).build().perform();

		
		
	}

}

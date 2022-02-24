package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {

		// map concept
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		// interface refrname=new calss

		ChromeDriver dd = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)dd;
		dd.get("https://www.facebook.com/");
		dd.manage().window().maximize();
		System.out.println();

		String c = dd.getTitle();
		System.out.println("page tittle:" + c);

		String c1 = dd.getCurrentUrl();
		System.out.println("current url:" + c1);

		Thread.sleep(5000);
		
		dd.navigate().to("http://automationpractice.com/index.php");
		
		dd.findElement(By.xpath("//a[@class='login']")).click();
		dd.findElementById("email").sendKeys("akash1608@gmail.com");
		dd.findElementById("passwd").sendKeys("Ak9087@123");
		dd.findElementById("SubmitLogin").click();
		
		WebElement nb = dd.findElementByName("submitNewsletter");
		js.executeScript("arguments[0].scrollIntoView(true)", nb);
		dd.close();
		
	//	WebElement gg = dd.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[7]"));
		//js.executeScript("arguments[0].scrollIntoView(true)", gg);
		

		/*
		 * dd.navigate().to("https://www.amazon.in/"); System.out.println(); String
		 * e=dd.getTitle(); System.out.println("page tittle:" +e); String f=
		 * dd.getCurrentUrl(); System.out.println("page url:" +f ); Thread.sleep(3000);
		 * 
		 * dd.navigate().back(); Thread.sleep(10000);
		 * 
		 * dd.navigate().refresh(); Thread.sleep(10000);
		 * 
		 * dd.close();
		 * 
		 */

	}
}

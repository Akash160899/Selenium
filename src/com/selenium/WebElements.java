package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    
	WebDriver a=new ChromeDriver();
	a.get("https://www.instagram.com/");
	a.manage().window().maximize();
	System.out.println();
	
	String tittle =a.getTitle();
	System.out.println("page tittle:" +tittle);
	
String url=	a.getCurrentUrl();
System.out.println("current url:" +url);

Thread.sleep(3000);

JavascriptExecutor js=(JavascriptExecutor)a;




WebElement user=a.findElement(By.name("username"));

//js.executeScript("arguments[0].scrollIntoView(true)", user);


Thread.sleep(3000);
user.sendKeys("akash@7867");

WebElement find = a.findElement(By.name("password"));
find.sendKeys("ak_2_9898ak..");
Thread.sleep(3000);
find.clear();

WebElement fd = a.findElement(By.xpath("(//div[contains(@class,'jKUp7 ')])[1]"));
boolean enabled = fd.isEnabled();
System.out.println("yes or np:" +enabled);
fd.click();





}
}

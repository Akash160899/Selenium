package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Types {
public static void main(String[] args) {
	

	//Tag name[@attribute name='attribute value']\
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver a=new ChromeDriver();
	
	a.findElement(By.xpath("//input[@maxlength='75']"));
	a.findElement(By.xpath("//input[@type='password']"));
	a.findElement(By.xpath("//button[@class='sqdOP yWX7d    y3zKF     ']"));
	a.findElement(By.xpath("//form[@class='HmktE']"));
	a.findElement(By.xpath("//span[@class='KPnG0']"));
	
	//Tag name [contains(@attribute name,'attribute value')]
	
	a.findElement(By.xpath("//input[contains(@aria-label,'number')]"));
	a.findElement(By.xpath("//input[contains(@aria-label,'w')]"));
	a.findElement(By.xpath("//span[contains(@class,'KP')]"));
	a.findElement(By.xpath("//span[contains(@class,'7U')]"));
	a.findElement(By.xpath(""));
	
	//Tag name[Text()='full Text']
	
	a.findElement(By.xpath("//a[text()='Forgot password?']"));
	a.findElement(By.xpath("//div[text()='About']"));
	a.findElement(By.xpath("//p[text()='Get the app.']"));
	a.findElement(By.xpath("//div[text()='Help']"));
	a.findElement(By.xpath("//div[text()='Instagram Lite']"));
	
	//Tag name[contains(Text(),'half of the text')]
	a.findElement(By.xpath("//a[contains(text(),'For')]"));
	a.findElement(By.xpath("//p[contains(text(),'G')]"));
	a.findElement(By.xpath("//div[contains(text(),'Ab')]"));
	a.findElement(By.xpath("//a[contains(text(),'Si')]"));
	a.findElement(By.xpath("//div[contains(text(),'Comp')]"));
	
              //(Tag name[contains(@1/2/3/4,)[]
	a.findElement(By.xpath("(//div[contains(@class,'DhRcB')][1])"));
	a.findElement(By.xpath("(//div[contains(@class,'K')][3])"));
	a.findElement(By.xpath("(//a[contains(@role,'b')])[2]"));
	a.findElement(By.xpath("(//input[contains(@type,'d')])[3]"));
	a.findElement(By.xpath("(//input[contains(@type,'e')])[3]"));
	
	//.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();

	
}
}

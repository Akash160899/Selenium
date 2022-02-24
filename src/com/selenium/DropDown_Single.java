package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Single {
	
	public static void main (String[]args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver b=new ChromeDriver();
		
		b.get("https://www.facebook.com/");
		b.manage().window().maximize();
		String c = b.getTitle();
		System.out.println(c);
		
		String d = b.getCurrentUrl();
		System.out.println(d);
		
	b.findElement(By.xpath("(//a[@rel='async'])")).click();
	Thread.sleep(8000);
	
	
	   b.findElement(By.name("firstname")).sendKeys("akash");
	 b.findElement(By.name("lastname")).sendKeys("N");
	 
	 b.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("akash20988@");
	 b.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("ka23,mmn");
	 
		/*
		 * b.findElement(By.id("day")).sendKeys("16");
		 * b.findElement(By.id("month")).sendKeys("AUGUST");
		 * b.findElement(By.id("year")).sendKeys("1999");
		 * b.findElement(By.xpath("(//label[@class='_58mt'])[2]"))
		 */
		
 WebElement g = b.findElement(By.id("day")); 
	Select m=new Select(g);
m.selectByValue("16");

WebElement k = b.findElement(By.id("month"));
Select m1=new Select(k);
m1.selectByIndex(7);

WebElement n = b.findElement(By.id("year"));
Select m2=new Select(n);
m2.selectByVisibleText("1999");

List<WebElement> oj = m1.getOptions();

for (WebElement web : oj) {
	
	System.out.println(web.getText());
	
}
System.out.println("---------------------------");
	boolean bb = m.isMultiple();
	System.out.println(bb);
	
	WebElement hh = m2.getFirstSelectedOption();
	System.out.println("frist selected is:"+hh.getText());
	
b.close();

		
		
	}
	

}

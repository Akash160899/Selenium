package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnts_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();
		a.get("https://accounts.snapchat.com/accounts/login?client_id=geo");
		a.manage().window().maximize();
		System.out.println();

		String tittle = a.getTitle();
		System.out.println("page tittle:" + tittle);

		String url = a.getCurrentUrl();
		System.out.println("current url:" + url);
		System.out.println("*-*-*-*-*-*-*-*-*-*-");

		WebElement findElement2 = a.findElement(By.xpath("//label[@for='username']"));
		String vv = findElement2.getText();
		System.out.println(vv);

		WebElement user = a.findElement(By.name("username"));
		user.sendKeys("ak22@123");

		String cc = user.getAttribute("value");
		System.out.println(cc);

		boolean d = user.isDisplayed();
		System.out.println("displayed or not:" + d);
		System.out.println("**/*/*/*/*/*/**///*/*");
		System.out.println();

		WebElement findElement = a.findElement(By.xpath("//input[@name='password']"));
		findElement.sendKeys("vnghghgghghgjg");
		Thread.sleep(3000);
		findElement.clear();
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
		

		/*
		 * boolean selected = findElement.isSelected();
		 * System.out.println("is selsected or not:"+selected);
		 * 
		 * 
		 * 
		 * WebElement findElement2 =
		 * a.findElement(By.xpath("//button[@type='submit']")); boolean e=
		 * findElement2.isEnabled(); System.out.println("iruka ilaiya:" +e);
		 * 
		 * // findElement2 .click();
		 * 
		 * Thread.sleep(50000); a.navigate().refresh();
		 * 
		 * Thread.sleep(5000); a.navigate().back();;;;;;;;;
		 * 
		 * 
		 * 
		 * a.close();
		 */

	}

}

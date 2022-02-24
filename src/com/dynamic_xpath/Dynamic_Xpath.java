package com.dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.amazon.in/");
		wd.manage().window().maximize();

		wd.findElement(By.xpath(// following relationship............
				"(//a[text()='Customer Service'])[1]//following::a[text()=' Electronics ']")).click();

		/*
		 * wd.findElement(By.xpath(// parent /child relationship..........
		 * "(//div[@class='a-cardui-body'])[2]//child::div[@class='a-section a-spacing-small grid-row-1']"
		 * ));
		 * 
		 * wd.findElement(By.xpath(//preceding relationship...............
		 * "(//h2[@class='a-color-base headline truncate-2line'])[2]//preceding::h2[text()='Upgrade your home | Amazon Brands & more']"
		 * ));
		 */
	}

}

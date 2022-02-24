package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//Chromedriver.exe");
                     
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	}

}

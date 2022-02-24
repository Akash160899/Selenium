package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();
		a.get("http://www.leafground.com/pages/Dropdown.html");
		a.manage().window().maximize();
		String t = a.getTitle();
		System.out.println(t);
		System.out.println("******************");

		WebElement c = a.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(c);
		s.selectByIndex(2);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		s.deselectByIndex(3);

		List<WebElement> l = s.getOptions();
		for (WebElement u : l) {

			System.out.println(u.getText());

		}
		System.out.println("-----------------------");

		boolean y = s.isMultiple();
		System.out.println("multiple r not: " + y);

		List<WebElement> asl = s.getAllSelectedOptions();
		for (WebElement jj : asl) {

			System.out.println(jj.getText());

		}

		System.out.println("++++++++++++++++++++++++");

		WebElement cc = s.getFirstSelectedOption();
		System.out.println(cc.getText());
           
		s.deselectAll();
		a.close();
		
	}

}

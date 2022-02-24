package com.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		wd.manage().window().maximize();

		System.out.println("*******all data**********");

		List<WebElement> all_data = wd.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement wb : all_data) {
			System.out.println(wb.getText());
		}

		System.out.println("**********row data**************");

		List<WebElement> row = wd.findElements(By.xpath("//table/tbody/tr[1]/td"));

		for (WebElement web : row) {

			System.out.println(web.getText());

		}
		System.out.println("**********couloum data*********");

		List<WebElement> col = wd.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement we : col) {

			System.out.println(we.getText());

		}

		System.out.println("********particular data***********");

		WebElement pa = wd.findElement(By.xpath("//table/tbody/tr[4]/td[5]"));
		System.out.println(pa.getText());

	}

}

package com.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ac {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.get("http://automationpractice.com/index.php?id_category=11&controller=category");
		a.manage().window().maximize();

		a.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement move = a.findElement(By.xpath("(//a[text()='Dresses'])[2]"));

		Actions b = new Actions(a);
		b.moveToElement(move).build().perform();

		WebElement casual_dress = a.findElement(By.xpath("(//a[text()='Casual Dresses'])[2]"));
		b.click(casual_dress).build().perform();
		Thread.sleep(3000);

		WebElement scrollinto = a.findElement(By.xpath("//h4[text()='Follow us']"));
		JavascriptExecutor j = (JavascriptExecutor) a;
		j.executeScript("arguments[0].scrollIntoView();", scrollinto);
		b.doubleClick(scrollinto).build().perform();

		a.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement drag = a.findElement(By.id("draggable"));
		WebElement drop = a.findElement(By.id("droppable"));
		b.dragAndDrop(drag, drop).build().perform();

		a.navigate().to("https://www.google.co.in/");
		WebElement keyboard = a.findElement(By.xpath("//a[text()='Gmail']"));
		b.contextClick(keyboard).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

package com.window_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.amazon.in/");

		wd.manage().window().maximize();
		// wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(3000);
		WebElement c = wd.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a = new Actions(wd);
		a.contextClick(c).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement grocery = wd.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		a.contextClick(grocery).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement travel = wd.findElement(By.xpath("//a[text()=' Electronics ']"));
		a.contextClick(travel).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> windowHandles = wd.getWindowHandles();

		for (String cc : windowHandles) {

			String sr = wd.switchTo().window(cc).getTitle();
			System.out.println(sr);

		}

		String s = "Amazon.in Bestsellers: The most popular items on Amazon";

		for (String title2 : windowHandles) {

			if (wd.switchTo().window(title2).getTitle().equals(s)) {

				continue;
			} else {
				//wd.close();
			}
		}

	}

}

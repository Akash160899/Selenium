package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Automation_Runner {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\Driver\\Chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wd.get("http://automationpractice.com/index.php");

		WebElement ak = wd.findElement(By.xpath("//a[@class='login']"));
		ak.click();
		JavascriptExecutor jj = (JavascriptExecutor) wd;
		jj.executeScript("window.scrollBy(0,200)");

		WebElement email = wd.findElement(By.name("email"));// sendKeys("akash1608@gmail.com");
		email.sendKeys("akash1608@gmail.com");

		WebElement cb = wd.findElement(By.name("passwd"));// sendKeys("Ak9087@123");
		cb.sendKeys("Ak9087@123");
		WebElement sl = wd.findElement(By.id("SubmitLogin"));// click();
		sl.click();

		WebElement jr = wd.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		jr.click();

		jj.executeScript("window.scrollBy(0,300)");

		Thread.sleep(5000);

		WebElement vv = wd.findElement(By.xpath("//div[@class='product-image-container']"));
		Actions cc = new Actions(wd);
		cc.moveToElement(vv).build().perform();

		Thread.sleep(3000);

		WebElement ff = wd.findElement(By.xpath("//a[@class='quick-view']"));
		ff.click();
		Thread.sleep(5000);

		WebElement frame = wd.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		wd.switchTo().frame(frame);

		WebElement ac = wd.findElement(By.name("qty"));

		ac.clear();
		ac.sendKeys("2");

		WebElement yy = wd.findElement(By.xpath("//select[@name='group_1']"));
		cc.click(yy).build().perform();


		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement btn = wd.findElement(By.xpath("//button[@class='exclusive']"));// click();
		btn.click();
		wd.switchTo().defaultContent();
		Thread.sleep(3000);

		WebElement cli = wd.findElement(By.xpath("//a[@title='Proceed to checkout']"));// .click();
		cli.click();

		jj.executeScript("window.scrollBy(0,900)");
		WebElement prcd = wd.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));// .click();
		prcd.click();
		Thread.sleep(3000);

		jj.executeScript("window.scrollBy(0,1000)");
		WebElement gh = wd.findElement(By.name("processAddress"));// .click();
		gh.click();
		Thread.sleep(3000);

		jj.executeScript("window.scrollBy(0,700)");
		WebElement ty = wd.findElement(By.name("cgv"));// .click();
		ty.click();
		WebElement bn = wd.findElement(By.name("processCarrier"));// .click();
		bn.click();
		Thread.sleep(3000);

		jj.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		WebElement jk = wd.findElement(By.xpath("//a[@class='cheque']"));// .click();
		jk.click();

		jj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		WebElement kj = wd.findElement(By.xpath("(//button[@type='submit'])[2]"));// .click();
		kj.click();
		jj.executeScript("window.scrollBy(0,400)");

		TakesScreenshot ts = (TakesScreenshot) wd;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Screenshots\\pic3.png");
		FileHandler.copy(start, end);

	}

}

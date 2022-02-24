package com.adc_prjt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Runner {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Akash8072");
		driver.findElement(By.id("password")).sendKeys("Q89MK8");
		driver.findElement(By.name("login")).click();

		WebElement a = driver.findElement(By.name("location"));
		Select s = new Select(a);
		s.selectByIndex(2);

		WebElement b = driver.findElement(By.name("hotels"));
		Select c = new Select(b);
		c.selectByVisibleText("Hotel Hervey");
		Thread.sleep(2000);

		WebElement j = driver.findElement(By.name("room_type"));
		Select n = new Select(j);
		n.selectByIndex(2);

		WebElement v = driver.findElement(By.name("room_nos"));
		Select x = new Select(v);
		x.selectByIndex(1);

		WebElement g = driver.findElement(By.name("datepick_in"));
		g.clear();
		g.sendKeys("22/01/2022");

		WebElement n1 = driver.findElement(By.name("datepick_out"));
		n1.clear();
		n1.sendKeys("24/01/2022");

		WebElement l = driver.findElement(By.name("adult_room"));
		Select f = new Select(l);
		f.selectByIndex(2);

		WebElement p = driver.findElement(By.name("child_room"));
		Select z = new Select(p);
		z.selectByIndex(1);

		WebElement lk = driver.findElement(By.name("Submit"));
		lk.click();

		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.name("first_name")).sendKeys("AKASH");
		driver.findElement(By.name("last_name")).sendKeys("N");
		driver.findElement(By.name("address")).sendKeys("no.224,hhgddhhdgg");
		driver.findElement(By.name("cc_num")).sendKeys("7878657653339878");
		driver.findElement(By.name("cc_type")).sendKeys("VISA");
		driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("August");
		driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("875");

		WebElement gh = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		gh.click();

		Thread.sleep(4000);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("my_itinerary")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Screenshots\\ak1.png");

		FileHandler.copy(start, end);

	}

}

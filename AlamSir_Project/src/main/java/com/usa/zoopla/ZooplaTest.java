package com.usa.zoopla;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ZooplaTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.id("signin_email")).sendKeys("johnshujon@gmail.com");
		driver.findElement(By.id("signin_password")).sendKeys("shujon979");
		driver.findElement(By.xpath("//*[@ type='submit']")).click();

		System.out.println("Page Title is = " + driver.getTitle());

		System.out.println("Page URL is = " + driver.getCurrentUrl());

		if (driver.getPageSource().contains("We know what a home is really worth")) {

			System.out.println("Joopla TITLE validation is pass");
		}

		else {

			System.out.println("Joopla TITLE validation is fail");

		}

		driver.quit();

	}

}

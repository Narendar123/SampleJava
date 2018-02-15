package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.way2social.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='popupContainer']/div[1]/div[8]/div/div[1]/button")).click();
		
           String wh=driver.getWindowHandle();
		driver.switchTo().window(wh);
				
	     Thread.sleep(2000);
	
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/form/div[1]/input[2]")).sendKeys("rabbanimohammad70@gmail.com");
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/form/div[2]/input")).sendKeys("way2online");
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/form/button")).click();
	}

}

package com.explara.automation.Explara_event;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginExplaraTest {
	WebDriver driver;
	public static void main(String[] args)
	{
		LoginExplaraTest lg  = new LoginExplaraTest();
		lg.loginSteps();
		
	}

	@Test
	public void loginSteps()
	{
	driver  = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://instaging.explara.com");
	driver.manage().window().maximize();
	driver.findElement(By.className("loginid")).click();
	driver.findElement(By.name("email")).sendKeys("rachna.raghuwanshi@signure.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.cssSelector("button.facebook:nth-child(6)")).click();
	//driver.findElement(By.xpath("html/body/div[10]/div[3]/button")).click();
	driver.findElement(By.cssSelector(".popover-navigation > button:nth-child(2)")).click();
	driver.findElement(By.xpath("html/body/div[2]/div[1]/div[3]/div[1]/a/div/div/div")).click();
	driver.findElement(By.linkText("create event")).click();
	event();
	//driver.close();
	}
	public void event()
	{
		
			//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts()
		driver.findElement(By.id("eventTitle")).sendKeys("SeleniumEvent");
		driver.findElement(By.id("eventDescription")).sendKeys("Some descrpton about the event");
	    driver.findElement(By.id("emailUserDefined")).click();
	    driver.findElement(By.className("hideCoverPicture")).click();
	    driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/div[1]/div/div/div[2]/div[5]/a/img[1]")).click();
	    driver.findElement(By.id("saveGalleryImage")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/div[3]/div[2]/div[7]/div[1]/div/div[1]/section/div/span")).click();
	    driver.findElement(By.xpath("form[@id='segment-info-from']/div[3]/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//form[@id='segment-info-from']/div[3]/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id='category']")).click();
	
	    

	}

}


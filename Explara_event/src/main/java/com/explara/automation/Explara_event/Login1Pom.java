package com.explara.automation.Explara_event;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login1Pom {
	public static void main(String[] args)
	{
		Login1Pom obj = new Login1Pom();
		obj.verifyvalidlogin();
	}
	public void verifyvalidlogin()
	{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://instaging.explara.com");
	LoginPom login = new LoginPom(driver);
	login.loginbutton();
	login.email("rachna.raghuwanshi@signure.com");
	login.passwod("123456");
	login.submitbutton();
	}

}

package com.explara.automation.Explara_event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {
	WebDriver driver;
	By loginbutton = By.className("loginid");
	By email = By.name("email");
	By pass = By.name("password");
	By submitbutton = By.cssSelector("button.facebook:nth-child(6)");
	
	public LoginPom(WebDriver driver)
	{
		this.driver = driver;
	}
	public void loginbutton()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void email(String emailId)
	{
		driver.findElement(email).sendKeys(emailId);
	}
	public void passwod(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	public void submitbutton()
	{
		driver.findElement(submitbutton).click();
	}

}

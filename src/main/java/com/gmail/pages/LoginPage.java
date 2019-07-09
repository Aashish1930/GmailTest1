package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.base.Testbase;

public class LoginPage extends Testbase {

	@FindBy(xpath = "//*[@name='identifier']")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]")
	WebElement nextbtn;

	@FindBy(xpath = "//*[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"passwordNext\"]")
	WebElement btnlogin;

	@FindBy(xpath = "//*[@id=\"logo\"]")
	WebElement gmaillogo;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public boolean validateLogo() {
		return gmaillogo.isDisplayed();
	}

	public HomePage login(String user,String pass){
		
		username.sendKeys(user);
		nextbtn.click();
		password.sendKeys(pass);
		btnlogin.click();
		return new HomePage(); 
		
		}
}
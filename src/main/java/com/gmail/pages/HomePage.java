package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.base.Testbase;

public class HomePage extends Testbase {

	@FindBy(xpath = "//*[@class=\"gb_la\"]")
	WebElement homelogo;

	
	

	@FindBy(xpath = "//*[@class=\"gb_xa gbii\"]")
	WebElement Abtn;

	@FindBy(xpath = "//*[contains(text(),'Aashish Mehta') and @class='gb_ab gb_bb']")
	WebElement usernamelabel;

	@FindBy(xpath = "//*[@id=\"gb_71\"]")
	WebElement signoutbtn;

	@FindBy(xpath = "//*[@class=\"T-I J-J5-Ji T-I-KE L3\"]")
	WebElement compose;

	@FindBy(className = "vO")
	WebElement SendTo;

	@FindBy(className = "aoT")
	WebElement Subject;

	@FindBy(className = "Am")
	WebElement MassageBody;

	@FindBy(className = "aoO")
	WebElement sendbtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		LoginPage lp = new LoginPage();

		return driver.getTitle();
	}

	public boolean verifyuser() {
		Abtn.click();
		return usernamelabel.isDisplayed();
	}

	public boolean validatehomeLogo() {
		return homelogo.isDisplayed();
	}

	public LoginPage signout() {
		Abtn.click();
		signoutbtn.click();
		return new LoginPage();
	}

	public void sendmail(String sendTo,String subject,String msgBody) {
		compose.click();
		SendTo.sendKeys(sendTo);
		Subject.sendKeys(subject);
		MassageBody.sendKeys(msgBody);
		sendbtn.click();

	}

}

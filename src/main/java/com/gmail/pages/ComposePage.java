package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.base.Testbase;

public class ComposePage extends Testbase {

	HomePage homepage;
	ComposePage composepage;

	@FindBy(xpath = "//*[@id=\":qq\"]")
	WebElement SendTo;

	@FindBy(xpath = "//*[@name=\"subjectbox\" and @id=\":wt\"]")
	WebElement Subject;

	@FindBy(xpath = "//*[@id=\":x3\"]")
	WebElement sendbtn;

	public ComposePage() {
		PageFactory.initElements(driver, this);
	}

	public ComposePage sending(String sendto, String Sub) {
		SendTo.sendKeys(sendto);
		Subject.sendKeys(Sub);
		sendbtn.click();
		return null;
	}

}

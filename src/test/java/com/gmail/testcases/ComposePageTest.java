package com.gmail.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.base.Testbase;
import com.gmail.pages.ComposePage;
import com.gmail.pages.HomePage;
import com.gmail.pages.LoginPage;

public class ComposePageTest  extends Testbase{

	LoginPage loginpage;
	HomePage homepage;
	ComposePage composepage;



	public ComposePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void sendmails()
	{
		composepage.sending(prop.getProperty("sendto"),prop.getProperty("subject"));
	}
	

}

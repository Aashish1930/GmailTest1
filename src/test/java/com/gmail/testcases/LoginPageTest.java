package com.gmail.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmail.base.Testbase;
import com.gmail.pages.HomePage;
import com.gmail.pages.LoginPage;
import com.gmail.utils.TestUtil;

public  class LoginPageTest extends Testbase {

	LoginPage LOGINPAGE;
	HomePage homepage;
	String sheetName = "Sheet1";

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		LOGINPAGE = new LoginPage();
	}

	/*
	 * @Test(priority = 1) public void LoginPageTitleTest() { String title =
	 * loginpage.validateTitle(); Assert.assertEquals(title, "Gmail");
	 * System.out.println("title validate"); driver.quit(); }
	 * 
	 * @Test(priority = 2) public void validatelogo() { boolean flag =
	 * loginpage.validateLogo(); Assert.assertTrue(flag); System.out.println(
	 * "logo validate "); driver.quit(); }
	 * 
	 * @Test(priority = 3) public void LoginTest() { homepage =
	 * loginpage.login(prop.getProperty("username"),
	 * prop.getProperty("password"));
	 * 
	 * }
	 */
/*	@Test(priority = 1, dataProvider = "Testdata")//,groups={"LoginPageTest.logintest"})
	public void logintest(String email, String pass) {
		// homepage = LOGINPAGE.login("aashishm431@gmail.com", "aashish@123");

		homepage = LOGINPAGE.login(email, pass);
	
		Assert.assertTrue(homepage.validatehomeLogo());
		System.out.println("logo verify");

		//LOGINPAGE = homepage.signout();
		System.out.println(email + " _" + pass);

	}

	@DataProvider
	public Object[][] Testdata() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;

	}*/

	
	@Test(groups={"LoginPageTest.logintest"}) 
	public void LoginTest() { homepage =
		LOGINPAGE.login(prop.getProperty("username"),
			  prop.getProperty("password"));
	}
	
	@AfterMethod
	public void stop() throws InterruptedException {
		/*Thread.sleep(5000);
		driver.quit();*/
	}
}
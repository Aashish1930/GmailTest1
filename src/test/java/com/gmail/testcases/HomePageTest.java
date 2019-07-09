package com.gmail.testcases;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmail.base.Testbase;
import com.gmail.pages.ComposePage;
import com.gmail.pages.HomePage;
import com.gmail.pages.LoginPage;
import com.gmail.utils.TestUtil;

public class HomePageTest extends Testbase {

	LoginPage loginpage;
	HomePage homepage;
	ComposePage composepage;
	String sheetName = "EMAIL_DATA";

	public HomePageTest() {
		super();
	}

	/*@BeforeMethod
	public void setup() {
		initilization();
		loginpage = new LoginPage();
		// homepage = loginpage.login(prop.getProperty("username"),
		// prop.getProperty("password"));

		System.out.println("Initilization Done ");(dependsOnGroups={"LoginPageTest.logintest"})

	}
	*/

/*	@Test(priority=1,dependsOnGroups={"LoginPageTest.logintest"})
	public void verifyhomelogo() {
		Assert.assertTrue(homepage.validatehomeLogo());
		System.out.println("logo verify");
	}
*/
/*	@Test()
	public void verifyUser() {
		Assert.assertTrue(homepage.verifyuser());
		System.out.println("user verify");
	}

	// @Test(priority = 1,dataProvider="getGmailData")
	@Test(dataProvider = "getGmailData")
	public void sendingmail(String send_to, String subject, String massage_body) {
		homepage.sendmail(send_to, subject, massage_body);
		System.out.println("sending mail Done");
	}

	@DataProvider
	public Object[][] getGmailData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		System.out.println(data);
		return data;
	}
*/
	@Test(priority=1,dependsOnGroups={"LoginPageTest.logintest"})
	public LoginPage signout() {
		homepage.signout();
		System.out.println("signout Done ");
		return loginpage;
	}

	@AfterClass
	public void stop() throws InterruptedException {
		//Thread.sleep(5000);
		driver.quit();
	}
}
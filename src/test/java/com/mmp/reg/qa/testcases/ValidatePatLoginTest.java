package com.mmp.reg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mmp.reg.qa.base.TestBase;
import com.mmp.reg.qa.pages.HomePage;
import com.mmp.reg.qa.pages.PatientLoginPage;
import com.mmp.reg.qa.pages.PatientHomePage;

public class ValidatePatLoginTest extends TestBase{
	PatientLoginPage plp;
	HomePage homepage;
	PatientHomePage pathomepage;

	public ValidatePatLoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		//plp = new PatientLoginPage();
		//pathomepage = new PatientHomePage();
	}

	//Test cases should be independent
	//before each testcse launch the browser and login
	//@Test --Execute the testcase
	//after each testcase -- close the browser 
	@Test(priority=1)
	public void validateHomePageTest() throws  InterruptedException {

		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"NAMTG","Home page title not matched");
	}

	@Test(priority=2)
	public void validatePatLoginTest() throws InterruptedException {		

		plp = homepage.navigateToPatLoginPage();
		pathomepage = plp.login(prop.getProperty("patUsername"),prop.getProperty("patPassword"));
		Boolean PatUN = pathomepage.verifyPatientUserName();
		Assert.assertTrue(PatUN);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}


}

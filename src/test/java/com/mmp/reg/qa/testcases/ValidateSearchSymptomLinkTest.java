package com.mmp.reg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mmp.reg.qa.base.TestBase;
import com.mmp.reg.qa.pages.HomePage;
import com.mmp.reg.qa.pages.PatientLoginPage;
import com.mmp.reg.qa.pages.SearchSymptomsPage;
import com.mmp.reg.qa.pages.PatientHomePage;

public class ValidateSearchSymptomLinkTest extends TestBase {
	
	
	PatientLoginPage plp;
	HomePage homepage;
	PatientHomePage pathomepage;
	SearchSymptomsPage symptompage;
	
	public ValidateSearchSymptomLinkTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homepage = new HomePage();
		plp = new PatientLoginPage();
		pathomepage = new PatientHomePage();
		symptompage = new SearchSymptomsPage();
		homepage.verifyHomePageTitle();
		homepage.navigateToPatLoginPage();
		plp.login(prop.getProperty("patUsername"),prop.getProperty("patPassword"));
						
	}
	
	/*@Test(priority=1)
	public void validateSearchSympomsLableTest() {
		Assert.assertTrue(symptompage.verifySymptomsLable(),"The Search Symptom Label is not Displayed");
	}*/
	
	@Test(priority=1)
	public void validateSearchSymptomsTest() throws InterruptedException {
		
		symptompage = pathomepage.clickOnSearchSymptomsLink();
		//Assert.assertEquals(symptompage.verifyDisplaySymptoms(),true);
		
		Assert.assertTrue(symptompage.verifyDisplaySymptoms(prop.getProperty("searchSymptom")), "This symptom is not available in the database");
	}
	
		
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}

	
	
	
	
	
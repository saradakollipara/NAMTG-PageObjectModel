package com.mmp.reg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.reg.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[text()='Patient Login']")
	WebElement patientLogin;
	@FindBy(css="div>a[href='portal/login.php']")
	WebElement patlogin;
	@FindBy(xpath="//a[text()='Register']")
	WebElement patregister;
	
	@FindBy(xpath="//a[text()='Office Login']")
	WebElement officeLogin;
	@FindBy(xpath="//a[text()='Login']")
	WebElement admLogin;
		
	
	//Initializing Page Objects
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public PatientLoginPage navigateToPatLoginPage() throws InterruptedException {

		patientLogin.click();
		Thread.sleep(5000);
		patlogin.click();
		return new PatientLoginPage();
	}
	
	public AdminLoginPage navigateToAdminLogin() {
		officeLogin.click();
		admLogin.click();		
		return new AdminLoginPage();
	}
	

}

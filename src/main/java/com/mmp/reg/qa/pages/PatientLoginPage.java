package com.mmp.reg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mmp.reg.qa.base.TestBase;

public class PatientLoginPage extends TestBase{

	//Page factory /Object Repository
	@FindBy(xpath="//a[text()='Patient Login']")
	WebElement patientLogin;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;

	//Constructor to initialize the Page Factory  
	public PatientLoginPage() {
		PageFactory.initElements(driver, this);

	}	
	
	public void navigateToPatientRegPage() throws InterruptedException 
	{
		patientLogin.click();
		Thread.sleep(3000);
		register.click();
	}
	public PatientHomePage login(String Uname, String pwd) {

		username.sendKeys(Uname);
		password.sendKeys(pwd);		
		WebDriverWait wait  = new WebDriverWait(driver,30);
		WebElement submitWE= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		submitWE.sendKeys(Keys.ENTER);

		return new PatientHomePage(); // returns HomePage class object
	}
}


package com.mmp.reg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.reg.qa.base.TestBase;

public class PatRagistrationPage extends TestBase{
	
	@FindBy(id="firstname")
	WebElement fname;
	@FindBy(id="lastname")
	WebElement lname;
	@FindBy(id="datepicker")
	WebElement dob;
	@FindBy(id="license")
	WebElement license;
	@FindBy(id="ssn")
	WebElement ssn;
	@FindBy(id="state")
	WebElement state;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="address")
	WebElement address;
	@FindBy(id="zipcode")
	WebElement zip;
	@FindBy(id="age")
	WebElement age;
	@FindBy(id="height")
	WebElement height;
	@FindBy(id="weight")
	WebElement weight;
	
	
	public PatRagistrationPage() {		
		PageFactory.initElements(driver,this);		
	}
	


}

package com.mmp.reg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.reg.qa.base.TestBase;

public class PatientHomePage extends TestBase{
	
	
	//Page Objects
	@FindBy(xpath="//span[contains(text(),'buildtest')]")
	WebElement patUserName;
	@FindBy(xpath="//span[contains(text(),'Profile')]")
	WebElement profileLink;
	@FindBy(xpath="//span[contains(text(),'Schedule Appointment')]")
	WebElement scheduleAppLink;
	@FindBy(xpath="//span[contains(text(),'Information')]")
	WebElement informationLink;
	@FindBy(xpath="//span[contains(text(),'Fees')]")
	WebElement feesLink;
	@FindBy(xpath="//span[contains(text(),'Search Symptoms')]")
	WebElement searchsmsptomsLink;
	@FindBy(xpath="//span[contains(text(),'Messages')]")
	WebElement messagesLink;
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logoutLink;
		
	
	
	public PatientHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//To verify Patient home page after login	
	public boolean verifyPatientUserName() {
		return patUserName.isDisplayed();
				
	}	
	
	
	//Page Factory
	public PersonalDetailsPage clickOnProfileLink() {
		profileLink.click();
		return new PersonalDetailsPage();
	}	
	public CurrentAppointmentsPage clickOnScheduleAppLink() {
		scheduleAppLink.click();
		return new CurrentAppointmentsPage();
		
	}	
	public InformationPage clickOnInformationLink() {
		informationLink.click();
		return new InformationPage();
		
	}	
	public FeesPage clickOnFeesLink() {
		feesLink.click();
		return new FeesPage();
	}	
	public SearchSymptomsPage clickOnSearchSymptomsLink() {
		searchsmsptomsLink.click();
		return new SearchSymptomsPage();
	}	
	public MessagesPage clickOnMessagesLink() {
		messagesLink.click();
		return new MessagesPage();
	}
	public HomePage clickOnLogoutLink() {
		logoutLink.click();
		return new HomePage();
	}
	
	
	

}

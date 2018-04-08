package com.mmp.reg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.reg.qa.base.TestBase;

public class SearchSymptomsPage extends TestBase{

	//WebDriver driver ;

	@FindBy(xpath="//div[contains(text(),'Search Symptoms')]")
	WebElement symptomsLabel;
	@FindBy(id="search")
	WebElement searchTxtBox;
	@FindBy(name="submit")
	WebElement submitButton;
	@FindBy(xpath="//*[@id=\"show\"]/table/thead/tr[1]/th[1]")
	WebElement tableHeading1;
	@FindBy(xpath="//*[@id=\"show\"]/table/tbody/tr[1]/td[1]")
	WebElement tablerow;


	public SearchSymptomsPage() {
		//this.driver = driver ; 
		PageFactory.initElements(driver, this);
	}

	public boolean verifySymptomsLable() {
		return symptomsLabel.isDisplayed();

	}

	public boolean verifyDisplaySymptoms(String symptom) {
		Boolean status = false;
		try {			
			searchTxtBox.sendKeys(symptom);
			submitButton.click();

			String heading = tableHeading1.getText();
			System.out.println("Table heading " + heading);	
			
			if(symptom.equals(tablerow.getText()) )  {
				System.out.println("*** Symptom in Database ***");	
				status = true;
				return status;
			} 
		}
		catch (Exception e) {
			System.out.println("*** Symptom Not available in the Database ***" + e.getMessage());	
		}	
		return status;	
	}
	
}







package com.pageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.ProfilePageInterfaceElements;
import com.reusableMethosd.BaseClass;

public class ProfilePageModel extends BaseClass implements ProfilePageInterfaceElements{
	@FindBy(xpath = threeLines_xpath)
	private WebElement threeLine;
	
	@FindBy(xpath =viewProfile_xpath)
	private WebElement viewProfile;
	
	@FindBy(xpath=validate_xpath )
	private WebElement validateText;
	
	

	
	public ProfilePageModel() {
		PageFactory.initElements(driver, this );
	}

	public void getThreeLines() {
		implicitlyWait("seconds", 10);
		elementClick(threeLine);
		
	}

   public void getViewPage() {
		implicitlyWait("seconds", 10);
		elementClick(viewProfile);
	}
   
   public void getValidate(String expectedText) {
	   Validation(validateText, expectedText);
	   
   }
}

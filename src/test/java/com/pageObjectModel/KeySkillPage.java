package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.KeySkillsInterface;
import com.reusableMethosd.BaseClass;
import com.utility.FileReadManager;

public class KeySkillPage extends BaseClass implements KeySkillsInterface{
	
	@FindBy(xpath =keySkillsButton_xpath)
	private WebElement skillButton;
	
	@FindBy(id = skillField_id)
	private WebElement skillField;
	
	@FindBy(id =saveSkills_id)
	private WebElement saveButton;
	
	FileReadManager reader= new FileReadManager();
	
	public KeySkillPage () {
		PageFactory.initElements(driver, this);
	}
    public void getSkillButton() {
     explicitlyWait(skillButton, "element", 10);
    	elementClick(skillButton);
    }
    
    public void getSkillField() {
    	
    	sendKeys(skillField,reader.getProperty("keyskills"));
    }
    
    public void getsaveButton() {
    	implicitlyWait("seconds", 10);
    	elementClick(saveButton);
    }
}

package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.ResumeUploadInterface;
import com.reusableMethosd.BaseClass;

public class ResumeUploadModel extends BaseClass implements ResumeUploadInterface {
	@FindBy(xpath = uplode_xpath)
	private WebElement upload;
	
	
	public ResumeUploadModel() {
		PageFactory.initElements(driver, this);
	}
	
	public void getUplod() {
		scrollDown(400);
		elementClick(upload);
		fileUpload("C:\\Users\\HP\\Desktop\\doc\\Vasanth Automation cv.pdf");
	}
	

}

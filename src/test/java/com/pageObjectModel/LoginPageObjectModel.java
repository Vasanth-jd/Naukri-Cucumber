package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.NaukriLoginInterface;
import com.reusableMethosd.BaseClass;

public class LoginPageObjectModel extends BaseClass implements NaukriLoginInterface {
	
	@FindBy(xpath=loginHomepage_xpath)
	private WebElement loginButton;
	
	@FindBy(xpath = email_xpath)
	private WebElement email;
	
	@FindBy(xpath = pass_xpath)
	private WebElement password;
	
	@FindBy(xpath = login_xpath)
	private WebElement login;
	
	@FindBy(xpath = validation_xpath)
	private WebElement title;
	

	
	public LoginPageObjectModel() {
		PageFactory.initElements(driver, this);
	}

  public void getHomePageLogin() {
	  elementClick(loginButton);
	  
  }
  public void getEmail(String userName) {
	  implicitlyWait("seconds", 5);
	  sendKeys(email, userName);
  }
  
  public void getPassword(String pass) {
	  implicitlyWait("seconds", 5);
  sendKeys(password, pass);
 }
  public void getLogin() {
	  implicitlyWait("seconds", 5);
	  elementClick(login);
  }
  public void getTitle(String expectedText) {
	explicitlyWait(title, "visibilty", 10);
       Validation(title, expectedText);  
  }
  
 
  }

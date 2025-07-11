package com.pageObjectManager;

import com.pageObjectModel.EducationPageModel;
import com.pageObjectModel.KeySkillPage;
import com.pageObjectModel.LoginPageObjectModel;
import com.pageObjectModel.ProfilePageModel;
import com.pageObjectModel.ResumeUploadModel;
import com.utility.ExcelUtility;
import com.utility.FileReadManager;


public class PageObjectManager {
	
	
	private FileReadManager fileData;
	public  FileReadManager getFileReader() {
		if(fileData==null) {
			fileData=new  FileReadManager();
			
		}
		return fileData;
		
	}
	
	private ExcelUtility excelData;
	public ExcelUtility getExcelData() {
		if(excelData==null) {
			excelData= new ExcelUtility();
		}
		return excelData;
		
	}
	
	
	private LoginPageObjectModel loginPage;
	public LoginPageObjectModel getLoginPage() {
		if(loginPage==null) {
			loginPage= new LoginPageObjectModel();
			}
		return loginPage;
		
	}
	
	private ProfilePageModel profilePage;
	public ProfilePageModel getProfilePage() {
		if(profilePage==null) {
			profilePage= new ProfilePageModel();
		}
		return profilePage;
		
	}
	
	private  EducationPageModel educationPage;
	
	public  EducationPageModel getEducationPage() {
		
		if (educationPage==null) {
			educationPage= new  EducationPageModel();
		}
		return educationPage;
		
	}
	
	private KeySkillPage keySkill;
	public KeySkillPage getKeySkillPage() {
		if(keySkill==null) {
			keySkill= new KeySkillPage();
		}
		return keySkill;
		
	}
	private ResumeUploadModel resumeUpload;
	public ResumeUploadModel getResumeUpload() {
		if(resumeUpload==null) {
			resumeUpload= new ResumeUploadModel();
		}
		return resumeUpload;
		
	}
	

}

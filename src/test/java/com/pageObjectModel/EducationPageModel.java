package com.pageObjectModel;

import java.awt.AWTException;
import java.io.FileReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceElements.EducationInterfaceElements;
import com.reusableMethosd.BaseClass;
import com.utility.FileReadManager;

public class EducationPageModel extends BaseClass implements EducationInterfaceElements {
	
	@FindBy(xpath = addEducation_xpath)
	private WebElement addEducation;
	
	@FindBy(id = education_id)
	private WebElement education;
	
	@FindBy(xpath = graduation_xpath)
	private WebElement graduation;
	
	@FindBy(id = university_id)
	private WebElement institute;
	
//	@FindBy(xpath = college_xpath)
//	private WebElement college;
//	
	
	@FindBy(xpath = course_xpath)
	private WebElement course;
	
	@FindBy(xpath =bE_xpath )
	private WebElement be;
	
	@FindBy(id =specialization_id)
	private WebElement special;
	
	@FindBy(xpath = iT_xpath)
	private WebElement it;
	
	@FindBy(id = startingYear_id)
	private WebElement startYear;
	
	@FindBy(xpath =Year_xpath)
	private WebElement sYear;
	
	@FindBy(id = endingYear_id)
	private WebElement endYear;
	
	@FindBy(xpath = year1_xpath)
	private WebElement eYear;
	
	@FindBy(id = grade_id)
	private WebElement grade;
	
	@FindBy(xpath = gradeSystem_xpath)
	private WebElement gradeSystem;
	
	@FindBy(id = save_id)
	private WebElement saveEducation;
	
	public EducationPageModel() {
		PageFactory.initElements(driver, this);
	}
	
	FileReadManager reader = new FileReadManager();
	
	public void getAddEducation() {
		
		scrollDown(500);
		//explicitlyWait(addEducation, "visiblity", 10);
		elementClick(addEducation);
	}
	
	public void getEducation() {
		implicitlyWait("seconds", 10);
		elementClick(education);
		
	}
	public void  getGraduation() {
		implicitlyWait("seconds", 10);
		elementClick(graduation);
	}
	
	public void getUniversity() {
		implicitlyWait("seconds", 10);
		sendKeys(institute, reader.getProperty("universityname"));
		explicitlyWait(institute, "element", 10);
		try {
			robot_Class("enter");
		} catch (AWTException e) {
		
		}	
	}
	
//	public void getCollege() {
//		try {
//			robot_Class("Enter");
//		} catch (AWTException e) {
//			
//		}
		
	
	
	public void getCourse() {
		explicitlyWait(course, "element", 10);
		elementClick(course);
		
	}
	public void  getBE() {
		implicitlyWait("seconds", 10);
		elementClick(be);
	}
	
	public void getSpecial() {
		implicitlyWait("seconds", 10);
		elementClick(special);
	}
	
	public void getIt() {
		implicitlyWait("seconds", 10);
		elementClick(it);
	}
	
	public void getStartingYear() {
		implicitlyWait("seconds", 10);
		elementClick(startYear);
	}
	
	public void getSYear() {
		implicitlyWait("seconds", 10);
		 elementClick(sYear);
	}
	
	public void getEndYear() {
		implicitlyWait("seconds", 10);
		elementClick(endYear);
		
	}
	
	public void getEYear() {
		implicitlyWait("seconds", 10);
		elementClick(eYear);
	}
	
	public void getGrade() {
		implicitlyWait("seconds", 10);
		elementClick(grade);
		
		
	}
	
	public void getGradeSystem() {
		implicitlyWait("seconds", 10);
		elementClick(gradeSystem);
	}
	
	public void getSaveEducation() {
		implicitlyWait("seconds", 10);
		elementClick(saveEducation);
	}
	

}

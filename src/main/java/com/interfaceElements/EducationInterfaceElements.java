package com.interfaceElements;

public interface EducationInterfaceElements {
	String addEducation_xpath="(//span[@class='add no-outline'])[1]";
	String education_id="highEduFor";
	String graduation_xpath="//a[text()=' Graduation/Diploma ']";
	String university_id="institute";
	//String college_xpath="//div[text()='Jeppiaar Engineering College, Chenna']";
	String course_xpath="//input[@placeholder='Select course']";
	String bE_xpath="//a[@data-id='crs_12']";
	String specialization_id="specializationFor";
	String iT_xpath="//a[text()=' Information Technology ']";
	String startingYear_id="yosFieldFor";
	String Year_xpath="(//a[text()=' 2015 '])[1]";
	String endingYear_id="yopFieldFor";
	String year1_xpath="(//a[text()=' 2019 '])[2]";
	String grade_id="gradeFieldFor";
	String gradeSystem_xpath="//a[text()=' Course Requires a Pass ']";
    String save_id="saveEducation";
}

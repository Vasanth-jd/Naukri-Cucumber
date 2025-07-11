package com.stepDefinition;
import java.io.IOException;

import com.pageObjectManager.PageObjectManager;
import com.reusableMethosd.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriStepDefinition extends BaseClass {
	
    PageObjectManager pageobjectmanager = new PageObjectManager();
	
    @Given("User launch the Browser and NaukriUrl")
	public void user_launch_the_browser_and_naukri_url() {
    	launchBrowser(pageobjectmanager.getFileReader().getProperty("browser")); 
    	launchUrl(pageobjectmanager.getFileReader().getProperty("url"));
	   
	}
	@When("User clicks the  login button on homepage")
	public void user_clicks_the_login_button_on_homepage() {
		pageobjectmanager.getLoginPage().getHomePageLogin();
	  
	   
	}
	@When("User enters   email {string} in to email field")
	public void user_enters_email_in_to_email_field(String email) {
		 pageobjectmanager.getLoginPage().getEmail(email);
	   
	}
	@When("User enters  password {string} in to password field")
	public void user_enters_password_in_to_password_field(String pass) {
	     pageobjectmanager.getLoginPage().getPassword(pass);
	}

	@Then("User clicks login button and should be navigated to profile page {string}")
	public void user_clicks_login_button_and_should_be_navigated_to_profile_page(String title) {
		 pageobjectmanager.getLoginPage().getLogin();
		 pageobjectmanager.getLoginPage().getTitle(title);
	}
	

    @Given("User landed on Naukuri profile page")
	public void user_landed_on_naukuri_profile_page() {
	     
	   
	} 
	@When("User clicks the three code symbol")
	public void user_clicks_the_three_code_symbol() {
		pageobjectmanager.getProfilePage().getThreeLines();
	     
	   
	}
	
	@Then("User should view new pop up page and click")
	public void user_should_view_new_pop_up_page_and_click() {
		pageobjectmanager.getProfilePage().getViewPage();
	}

	  
	@Then("User landed in to profile details page {string}")
	public void user_landed_in_to_profile_details_page(String text) {
		pageobjectmanager.getProfilePage().getValidate(text);
	}


    @Given("User should be on  Naukri Profile details page")
    public void user_should_be_on_naukri_profile_details_page() {
      
    }

    @When("User clicks the add education link")
    public void user_clicks_the_add_education_link() {
    	pageobjectmanager.getEducationPage().getAddEducation();
    	
        
      
    }
    @When("User select graduation\\/diplomo from education")
    public void user_select_graduation_diplomo_from_education() {
    	pageobjectmanager.getEducationPage().getEducation();
    	pageobjectmanager.getEducationPage().getGraduation();
        
      
    }
    @When("User enters university name")
    public void user_enters_university_name() {
    	pageobjectmanager.getEducationPage().getUniversity();
    
      
    }
    @When("User select BE\\/B.Tech from course")
    public void user_select_be_b_tech_from_course() {
    	pageobjectmanager.getEducationPage().getCourse();
    	pageobjectmanager.getEducationPage().getBE();
      
    }
    @When("User select Information Technology from specialization")
    public void user_select_information_technology_from_specialization() {
    	pageobjectmanager.getEducationPage().getSpecial();
    	pageobjectmanager.getEducationPage().getIt();
    	
        
      
    }
    @When("User select starting year from course detail")
    public void user_select_starting_year_from_course_detail() {
    	pageobjectmanager.getEducationPage().getStartingYear();
    	pageobjectmanager.getEducationPage().getSYear();
        
      
    }
    @When("User select ending year from course detail")
    public void user_select_ending_year_from_course_detail() {
    	pageobjectmanager.getEducationPage().getEndYear();
    	pageobjectmanager.getEducationPage().getEYear();
        
      
    }
    @When("User select course requires a pass from grading system")
    public void user_select_course_requires_a_pass_from_grading_system() {
    	pageobjectmanager.getEducationPage().getGrade();
 	pageobjectmanager.getEducationPage().getGradeSystem();
        
     }
    @When("User clicks save button")
    public void user_clicks_save_button() {
    	pageobjectmanager.getEducationPage().getSaveEducation();
    	
    }

    @Then("User successfully entered education details")
    public void user_suceesfully_entered_education_details() {
       try {
		screenshotMethod("C:\\Users\\HP\\eclipse-workspace\\Naukri_Cucumber_Framework\\Screenshots.png");
	} catch (IOException e) {
		
	}
    }
    @When("User clicks key skills button")
    public void user_clicks_key_skills_button() {
    	pageobjectmanager.getKeySkillPage().getSkillButton();
         
        
    }
    @When("User enters Key  skills")
    public void user_enters_key_skills() {
    	pageobjectmanager.getKeySkillPage().getSkillField();
         
        
    }
    @When("User clicks  key skill save  button")
    public void user_clicks_key_skill_save_button() {
    	pageobjectmanager.getKeySkillPage().getsaveButton();
    }
    @Then("User successfully entered key skills")
    public void user_successfully_entered_key_skills() {
         try {
			screenshotMethod("C:\\Users\\HP\\eclipse-workspace\\Naukri_Cucumber_Framework\\Screenshots.png");
		} catch (IOException e) {
			
		}
  }


    @When("User clicks upload resume")
    public void user_clicks_upload_resume() {
    	pageobjectmanager.getResumeUpload().getUplod();
   
    
}
    @Then("User successfully uploded resume in resume field")
    public void user_successfully_uploded_resume_in_resume_field() {
   
    
}












	





}

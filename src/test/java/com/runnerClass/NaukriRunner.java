package com.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\featurefile\\Naukri.feature",},
		glue = {"com.stepDefinition",
				"com.hooks"},
		plugin = {"html:Reports/NaukriHtml.html",
				"json:JasonReports/NaukriJason.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
	    tags="@smoke"
		
	    
		
		
		
		
		
		)


public class NaukriRunner {
	    
	     
	
	


}

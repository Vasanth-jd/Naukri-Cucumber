Feature: Naukri Application Testing


@smoke
Scenario: User Enters Valid Username and Password

Given User launch the Browser and NaukriUrl
When User clicks the  login button on homepage
And User enters   email "vasanth12345@gmail.com" in to email field
And User enters  password "Vasu@123" in to password field
Then User clicks login button and should be navigated to profile page "VASANTH"
@smoke
Scenario: User Enter to Profile Details Page

Given User landed on Naukuri profile page
When User clicks the three code symbol
And User should view new pop up page and click 
Then User landed in to profile details page "Add 12 missing details"



@reg
Scenario: User Enters Education Details

Given User should be on  Naukri Profile details page
When  User clicks the add education link
And   User select graduation/diplomo from education 
And   User enters university name 
And   User select BE/B.Tech from course 
And   User select Information Technology from specialization 
And   User select starting year from course detail 
And   User select ending year from course detail 
And   User select course requires a pass from grading system 
And   User clicks save button
Then  User successfully entered education details
@sanity
Scenario: User Enters Key Skills

Given User should be on  Naukri Profile details page
When User clicks key skills button
And User enters Key  skills
And User clicks  key skill save  button
Then User successfully entered key skills

@smoke
Scenario: User Upload Resume

Given User should be on  Naukri Profile details page
When User clicks upload resume
Then User successfully uploded resume in resume field








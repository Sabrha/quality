Feature:  This is a Login feature Sprint 1


@Jahan1
Scenario: Verify user can signup    
Given     Open "<URL>"  application  
Then      Click signup link
Then 	    Enter Username and Password
Then 	    Click Signup button




@Jahan2
Scenario: Verify user can Login with valid credential
Given     Open "<URL>"  application 
Then      Click Login link 
Then 	    Enter Username Password
Then      Verify user can login with valid credential 

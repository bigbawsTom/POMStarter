@tag
Feature: Update Personal Information (First Name) in My Account
 
  @tag1
  Scenario: Order T-Shirt
  Given a user has navigated to the landing page
  When User enters Credentials to LogIn
		| Username   | Password |
    | someone@example.com| Password123 |
   	And user clicks button "my personal information" on the my account page
  	And user enters "first name" as "frodo" on the personal information page
  	And user enters "password" as "Password123" on the personal information page
  	And user clicks button "save" on the personal information page
  	Then verify message "Your personal information has been successfully updated."
  	Then verify header "first name" matches "frodo"
   	
  

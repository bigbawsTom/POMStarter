@Test
Feature: Update Personal Information (First Name) in My Account
 
  Scenario: Order T-Shirt
  Given a user has navigated to the landing page using "firefox" browser on "mac"
  And user clicks on "log in" navigation bar option
  When User enters Credentials to LogIn
    | someone@example.com| Password123 |
   	And user clicks button "my personal information" on the my account page
  	And user enters "first name" as "Todayis" on the personal information page
  	And user enters "current password" as "Password123" on the personal information page
  	And user clicks button "save" on the personal information page
  	Then verify message "Your personal information has been successfully updated."
  	Then verify header "user info" matches "Todayis LastName"
   	
  

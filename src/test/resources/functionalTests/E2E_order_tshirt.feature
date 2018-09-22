@tag
Feature: Order T-Shirt (and Verify in Order History)

  @tag1
  Scenario: Order T-Shirt
  Given a user has navigated to the landing page
  When User enters Credentials to LogIn
		| Username   | Password |
    | someone@example.com| Password123 |
    And user clicks on "t-shirt" menu
    And user selects size "medium"
    And user selects color "orange"
   	And user clicks button "add to cart"
   	And user clicks button "proceed to checkout"
   	And user clicks button "proceed to checkout"
		And user clicks button "proceed to checkout"
   	And user selects checkbox "terms of service"
   	And user clicks button "proceed to checkout"
   	And user clicks button "pay by check"
   	And user clicks button "i confirm my order"
   	And user selects link "back to orders"
   	Then verify order history contains order
   	
  

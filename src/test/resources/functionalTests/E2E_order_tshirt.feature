@Test
Feature: Order T-Shirt (and Verify in Order History)

  Scenario: Order T-Shirt
  Given a user has navigated to the landing page using "firefox" browser on "mac"
  And user clicks on "log in" navigation bar option
  When User enters Credentials to LogIn
    | someone@example.com| Password123 |
    And user clicks on "t-shirts" menu from account page
    And user clicks button "list" on the t-shirt page
    And user selects size "medium" on the t-shirt page
    And user selects color "orange" on the t-shirt page
    And user clicks button "add to cart" on the t-shirt page
    And user clicks button "proceed to checkout" on the t-shirt page
    And user clicks button "proceed to checkout" on the shopping cart page
		And user clicks button "proceed to checkout" on the addresses page
    And user selects checkbox "terms of service" on the shipping page
   	And user clicks button "proceed to checkout" on the shipping page
    And user clicks button "pay by check" on the payment method page
   	And user clicks button "I confirm my order" on the check payment page
    And user selects link "back to orders" on the order confirmation page
    Then verify order history contains order on the order history page
   	
  

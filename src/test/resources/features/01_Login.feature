Feature: Test the Login module

  Scenario: validate the Login page
    When I go to the Demo page
    And look for UserId and Password label
    Then I should view the UserId and password label

  Scenario: test the reset button
    When I keep the userid and password field empty
    And click the login button
    Then I should receive the invalid login Alert


  Scenario: test the invalid login credentials
    When I input invalid userid and password
    And I click the login button again
    Then I should receive invalid login Alert


  Scenario: test the valid login credentials
    When I input the valid userid and password
    And I click the login button after input
    Then I should be navigated to Home page

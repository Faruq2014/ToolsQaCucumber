@system
Feature: Login
Background: open toolsQA
    Given user open browser
    When user enter url
    Then user should open landing page
    
    Scenario: valid login
    When user enter valid username
    And user enter valid  password
    And click on submit button
    Then user should have home page
    
    
    Scenario Outline: Invalid login
    When user enter invalid "<username>"
    And user enter invalid  "<password>"
    And click on submit button for negative test
    Then user should have landing page
    Examples:
    |username|password|
    |mmmmmmmm|llllllll|
    |kkkkkkkk|oooooooo|
    
    
    
    
    
    
    
    
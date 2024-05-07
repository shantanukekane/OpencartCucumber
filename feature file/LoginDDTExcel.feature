Feature: Login with Valid Credentials

  Scenario Outline: Login Data Driven
    Given the user navingates to login Page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page

    Examples: 
      | email                    | password |
      | kekaneshantanu@gmail.com | test123  |
      | test@gmail.com           | test@123 |

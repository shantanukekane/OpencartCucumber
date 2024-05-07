Feature: user registration

  Scenario:Successful register
    Given the user should open the application
    And the user should be on register page
    When the user should click on male radio button
    And the user enter valid first name (first name = "Shantanu")
    And the user enter valid last name (last name = "kekane")
    And the user select the valid date of dateofbirth (date = "12")
    And the user select the valid month of dateofbirth (month = "September")
    And the user select the valid year of the dateofbirth ( year = "1993")
    And the user enter the valid email (email = "kekaneshantanu@gmail.com")
    And the user enter the company name (company name = "penta software")
    And the user should enter valid password (password = "test@123")
    And the user should enter valid confirm password ( password = "test@123")
    And the user should click on register button
    Then the user should redirected to the My Account page
    And the user should see the Register name

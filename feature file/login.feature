Feature: user login
  
    Scenario:Successful login
      Given the user should open the application
      And the user is on the NopCommerce login page
      When the user enter the valid credentials (username: "test@gmail.com" , password: "test@123")
      And the user clicked on Login button
      Then the user should be redirected to the My Account Page
      And the user should see the Welcome message

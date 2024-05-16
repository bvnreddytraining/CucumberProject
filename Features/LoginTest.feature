Feature: Login to Opencart

  Scenario: Loging with Valid Credentials
    Given Launch the browser
    And Navigate to Opencart URL
    When enter user name and Password
    And Click on Login button
    Then Validate login is successful
    And Logout from OpenCart application
    
  Scenario: Loging with InValid Credentials
    Given Launch the browser
    And Navigate to Opencart URL
    When enter user name and Password
    And Click on Login button
    Then Validate login is successful
    And Logout from OpenCart application

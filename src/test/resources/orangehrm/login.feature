Feature: Login feature for OrangeHRM site
  As a Admin
  I want to see login page
  So that I can login successfully

  #happy path scenario
  @login
  Scenario: Admin can able to login successfully with valid credentials
    Given Admin is on login page
    When Admin enters username as "admin" and password as "password"
    And Admin selects login
    Then Admin should login successfully
    And Admin should see welcome message as "Welcome Admin"

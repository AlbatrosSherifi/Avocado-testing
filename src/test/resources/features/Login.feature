Feature: Login

  Scenario: Login with valid credentials
    Given user with email "as37481@ubt-uni.net" and password "albatros97" is logged in
    Then user should see dashboard
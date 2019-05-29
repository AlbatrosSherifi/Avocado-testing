Feature: logout

  Scenario: Logout when user is logged in
    Given user with email "as37481@ubt-uni.net" and password "albatros97" is logged in
    When user logs out
    Then user should be logged out
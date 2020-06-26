Feature: FB Login Test Cases

  Scenario: User login works with Valid credentials
    Given User is on FB Home Page
    When User enters username as "munkmunk@gmail.com" and password as "junkjunk"
    And User clicks on login button
    Then user is able to login
    And FB Home page is displayed

  Scenario Outline: User login examples with Valid credentials
    Given User is on some Home Page
    When User enters "<username>" and "<password>"
    Then system prints out the credentials

    Examples:
      | username | password |
      | uname1   | pass1    |
      | uname1   | pass2    |

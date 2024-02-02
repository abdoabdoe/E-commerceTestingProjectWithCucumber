Feature: Test the login functionality
  Scenario: To login with vaild Email and vaild password
    Given User open website and go to login page
    When user fill email as "<email>" and "<password>" and click on login
    Then user should navigate to home page

    Examples:
    | email                | password |
    | Test19999@gmail.com  | 123456   |
    | Test1998@gmail.com   | 12345    |
    | Test199@gmail.com    | 1234     |
    | Test19999@gmail.com  | 12345    |


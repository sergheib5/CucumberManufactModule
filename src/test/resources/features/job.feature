Feature: Post my resume
@postjob
  Scenario: As a user i want to post my resume
    Given user open the dice website "https://www.dice.com/"
    And user put credentials "username" and "password"
    And user open the profile
    And user clicks on edit resume
    Then user upload nee resume
    And user saved the profile

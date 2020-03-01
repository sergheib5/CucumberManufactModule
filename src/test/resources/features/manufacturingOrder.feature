@ManufacturingOrder_Module
Feature: ManufacturingOrder

  Background:
    Given user login as "associate"



  @smokeTest@ManufacturingOrder_Module
    #Manufacturing module Reporting Data



@Raghdah
  Scenario: Create a new manufacturing order Validation
    Given User is on manufacturing order page
    When User clicks on Create Button
    Then User will see a small window
    When User clicks on Product Box
    Then User will send keys 'Book'
    And  User will see'[E-COM05] Book2' on the Product Box
    When User clicks on save Button
    Then User Will see Warning Alert Window
    And User will clicks on X Button
    Then The warning Alret window will close

  @Raghdah
    Scenario: Import a new manufacturing order Validation
      Given User is on manufacturing order page
      When User clicks on Import Button
      Then A small window from the user computer will display on the page
      And User will clicks on Load File Button
      Then User will clicks on the Cancel Button
      Then A small window from the user computer should be canceled

  @Raghdah
      Scenario:  Reference Check Box Validation
        Given User is on manufacturing order page
        When User clicks on Reference check Box
        Then User will see a check mark on all manufacturing orders check Boxes
        When User clicks on Reference Check Box
        Then All check marks should be removed from all manufacturing orders














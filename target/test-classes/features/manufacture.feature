@Manufacturing_module_Test
Feature: ManufactureModule
  Agile Story: CN-169


  Background:
    Given user login as manager
    Given user click manufacturing module


  Scenario:
    When user clicks the Bills of Materials
    Then Create button is displayed and enabled
    When user clicks on Create button
    Then Quantity button,save button and discard button are displayed and enabled
    And reference button is displayed, and Bom type radio buttons are displayed and by default manufacture this product is selected
    When user clicks Product Dropdown Button and choose first product
    And user clears and provides quantity information
    And user provides reference information
    And user clicks to the Save button

  Scenario:
    When user clicks the Bills of Materials
    Then import button is displayed and enabled
    When user clicks on import button on the bills of materials page
    Then import button, reload and test import button are displayed but not enabled
    And  load file button and cancel button are displayed and enabled

  Scenario:
    When user clicks the Bills of Materials
    Then all checkboxes are enabled
    When user clicks one of the check boxes
    Then action dropdown is displayed and enabled
    When user clicks action button
    Then  Export, Archive, Unarchive, Delete options appear respectively
    And user clicks delete button
    Then confirmation alert is displayed
    And user clicks ok on the alert




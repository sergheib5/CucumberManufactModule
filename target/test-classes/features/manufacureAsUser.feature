@Manufactoring_Module_Test_User
Feature: ManufactureModule
  Agile Story: CN-169

  Background:
    Given user login as "associate"
    Given user click manufacturing module
@printLabel
  Scenario: Products print labels as an associate
    Given user is on the manufacturing module
    When user clicks on products tab
    Then user is being navigated to products page
    When user is clicking on product
    Then the product page is being displayed
    And user clicks on print button
    Then print label is downloaded to local machine

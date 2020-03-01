@Manufactoring_Module_Test_User
Feature: ManufactureModule
  Agile Story: CN-169

  Background:
    Given user login as "associate"


@printLabel
  Scenario: Products print labels as an associate
    Given user is on the manufacturing module
    When user clicks on products tab
    Then user is being navigated to products page
    When user is clicking on product
    Then the product page is being displayed
    And user clicks on print button
    Then print label is downloaded to local machine

   # Validating the search box in bills of material page
  @Ulku
  Scenario: Validation of Search Button in Bills of Material
    When User is on bills of material page
    Then User should see bills of material page



    #Sending valid keys
  @Ulku
  Scenario: Send Valid Keys
    When User is on bills of material page
    And User clicks on search box
    And User send valid credentials
    Then User should be able to see related search
  @Ulku
  Scenario: Print Bills of Materials for Product
    When User is on bills of material page
    And User clicks on search box
    And User send valid credentials
    And User choose any item
    And User clicks on print button
    Then  User should be able to see print of materials

  @Raghdah
  Scenario: Create a new manufacturing order Validation
    Given User is on manufacturing order page
    When User clicks on Create Button
    Then User will see a small window
    When User clicks on Product Box
    Then User will send keys Book
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


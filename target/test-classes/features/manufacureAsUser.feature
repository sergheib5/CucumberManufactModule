@Manufactoring_Module_Test_User
Feature: ManufactureModule
  Agile Story: CN-169

  Background:
    Given user login as "assgiociate"
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



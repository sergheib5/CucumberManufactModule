@Manufacturing_module_Test
Feature: ManufactureModule
  Agile Story: CN-169


  Background:
    Given user login as "manager"
    Given user click manufacturing module

  @smokeTest@Manufacturing_module_Reporting
      #Manufacturing module Reporting Data
  Scenario: Validation manufacturing orders tab under reporting
    Given user is on the manufacturing module
    When user clicks on reporting
    Then the default report will be displayed on the page
    When user clicks on line type chart
    Then the same data is being displayed on the linear chart
    When user clicks on the pie chart
    Then the data is displayed on a pie chart

       # imp btn validation
  @importButton
  Scenario: Validation of import button
    When user clicks on products tab
    Then user is being navigated to products page
    And user clicks on import button
    Then Products import a File page is displayed
    And load button is displayed
    And user can see allowing file format
    And user is choosing a file to upload
    Then file is uploaded the name is displayed

  @smokeTest@Manufacturing_module_Products1
  Scenario: As a user I should be able to see product page with details
#    Given user is on the manufacturing module page
    When user clicks on product tab
    Then user is being navigated to products page and should be see all products with details


  Scenario: As a manager I should be able to create product
#    Given user is on the manufacturing module
    When user clicks on product tab
    Then user is being navigated to products page and should be see all products with details
    And user able to see create button
    When user click create button
    Then it should navigate to new page
    And user should be able to see checkbox can be sold, can be purchased are selected by default
    And user should be able to see dropdown Product Type is on option Stockable Product
    And user should be able to see dropdown Category is on option All
    When user click button save
    Then user click products tab and able to search created product

  Scenario: Validation of edit button
#    Given user is on the manufacturing module
    When user clicks on product tab
    Then user is being navigated to products page and should be see all products with details
    When user select any product
    And user click edit button
    Then user  should be able edit and save product information

  @UnbuilIvan
    #Unbuild Orders Ivan
  Scenario: Check Save button in Unbuild Order module
    Given user is on the manufacturing module page
    When user click Unbuild Orders
    Then user is being navigated to Unbuild Orders page
    When user click Create button
    Then user is being navigated to New Unbuild Orders page
    When user chose any product from Product dropdown list
    And user put number in Quantity field
    And user click Save button
    Then the message Unbuild Order Created is displayed
  @UnbuilIvan
  Scenario: Check Discard button in Unbuild Order module
    Given user is on the manufacturing module page
    When user click Unbuild Orders
    Then user is being navigated to Unbuild Orders page
    When user click Create button
    Then user is being navigated to New Unbuild Orders page
    When user chose any product from Product dropdown list
    And user put number in Quantity field
    And user click Discard button
    Then user will see Warning message with Ok and Cancel buttons
    When user clicks on Ok button
    Then user will be return on Unbuild Orders page
  @UnbuilIvan
  Scenario: Check Unbuild button in Unbuild Order module
    Given user is on the manufacturing module page
    When user click Unbuild Orders
    Then user is being navigated to Unbuild Orders page
    When user click Create button
    Then user is being navigated to New Unbuild Orders page
    When user chose any product from Product dropdown list
    And user put number in Quantity field
    And user click Unbuild button
    Then the message Unbuild Order Created is displayed










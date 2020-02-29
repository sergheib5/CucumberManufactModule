@Manufacturing_module_Test
Feature: ManufactureModule
  Agile Story: CN-169


  Background:
    Given user login as manager
    Given user click manufacturing module

#  @smokeTest@Manufacturing_module_Reporting
#      #Manufacturing module Reporting Data
#  Scenario: Validation manufacturing orders tab under reporting
#    Given user is on the manufacturing module
#    When user clicks on reporting
#    Then the default report will be displayed on the page
#    When user clicks on line type chart
#    Then the same data is being displayed on the linear chart
#    When user clicks on the pie chart
#    Then the data is displayed on a pie chart
#    #print label as associate
#  Scenario: Products print labels as an associate
#    Given user is on the manufacturing module
#    When user clicks on products tab
#    Then user is being navigated to products page
#    And user see all products with details
#    When user is clicking on product
#    Then the product page is being displayed
#    And user clicks on print button
#    Then print label is downloaded to local machine
#       # imp btn validation
#  Scenario: Validation of import button
#    Given user is on the manufacturing module
#    When user clicks on products tab
#    Then user is being navigated to products page
#    And user clicks on import button
#    Then Products import a File page is displayed
#    And load button is displayed
#    And user can see allowing file format
#    And user is choosing a file to upload
#    Then file is uploaded the name is displayed

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


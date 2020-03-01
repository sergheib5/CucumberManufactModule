$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/manufacture.feature");
formatter.feature({
  "name": "ManufactureModule",
  "description": "  Agile Story: CN-169",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Manufacturing_module_Test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login as \"manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefn.userLoginAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click manufacturing module",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validation of import button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Manufacturing_module_Test"
    },
    {
      "name": "@importButton"
    }
  ]
});
formatter.step({
  "name": "user clicks on products tab",
  "keyword": "When "
});
formatter.match({
  "location": "Reports_Step_Def.user_clicks_on_products_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is being navigated to products page",
  "keyword": "Then "
});
formatter.match({
  "location": "Reports_Step_Def.user_is_being_navigated_to_products_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on import button",
  "keyword": "And "
});
formatter.match({
  "location": "Reports_Step_Def.user_clicks_on_import_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Products import a File page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Reports_Step_Def.products_import_a_File_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "load button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Reports_Step_Def.load_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can see allowing file format",
  "keyword": "And "
});
formatter.match({
  "location": "Reports_Step_Def.user_can_see_allowing_file_format()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is choosing a file to upload",
  "keyword": "And "
});
formatter.match({
  "location": "Reports_Step_Def.user_is_choosing_a_file_to_upload()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "file is uploaded the name is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Reports_Step_Def.file_is_uploaded_the_name_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
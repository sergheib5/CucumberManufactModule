$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/oytun.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@deneme"
    }
  ]
});
formatter.scenario({
  "name": "Validation manufacturing orders tab under reporting",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deneme"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to google",
  "keyword": "Given "
});
formatter.match({
  "location": "oytun_step.go_to_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get title",
  "keyword": "When "
});
formatter.match({
  "location": "oytun_step.get_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TesteSicredi.feature");
formatter.feature({
  "line": 1,
  "name": "Simular investimento",
  "description": "",
  "id": "simular-investimento",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Simulação com valores válidos",
  "description": "",
  "id": "simular-investimento;simulação-com-valores-válidos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "That I want to simulate a savings investment",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access the simulation form as an associate",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I fill the form with valid values",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click to simulate",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the simulation result form",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.loadPage()"
});
formatter.result({
  "duration": 9678033700,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.associateScroll()"
});
formatter.result({
  "duration": 439920500,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.fillValidForm()"
});
formatter.result({
  "duration": 924807100,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.simulateClick()"
});
formatter.result({
  "duration": 410875900,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.resultForm()"
});
formatter.result({
  "duration": 961074200,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.browser_closure()"
});
formatter.result({
  "duration": 747286400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Simulação com valores inválidos",
  "description": "",
  "id": "simular-investimento;simulação-com-valores-inválidos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "That I want to simulate a savings investment",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I access the simulation form as an associate",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I fill the form with invalid values",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see the invalid values message",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.loadPage()"
});
formatter.result({
  "duration": 9791428300,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.associateScroll()"
});
formatter.result({
  "duration": 224655300,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.fillInvalidForm()"
});
formatter.result({
  "duration": 520889000,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.invalidValuesMessage()"
});
formatter.result({
  "duration": 109868000,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.browser_closure()"
});
formatter.result({
  "duration": 758587600,
  "status": "passed"
});
});
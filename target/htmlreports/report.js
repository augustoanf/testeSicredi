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
  "name": "Quero simular um investimento na poupança",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Acesso o formulário de simulação como associado",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Preencho o formulário com valor válido para o campo \"valorAplicar\" de \"200000\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Preencho o formulário com valor válido para o campo \"valorInvestir\" de \"10000\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Preencho o formulário com valor válido para o campo \"tempo\" de \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Clico para simular",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Vejo a tabela com resultados da simulação",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Fecho o browser",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.loadPage()"
});
formatter.result({
  "duration": 10628034300,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.associateScroll()"
});
formatter.result({
  "duration": 391659600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valorAplicar",
      "offset": 53
    },
    {
      "val": "200000",
      "offset": 71
    }
  ],
  "location": "step_definitions.fillValidForm(String,String)"
});
formatter.result({
  "duration": 217291200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valorInvestir",
      "offset": 53
    },
    {
      "val": "10000",
      "offset": 72
    }
  ],
  "location": "step_definitions.fillValidForm(String,String)"
});
formatter.result({
  "duration": 202266000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tempo",
      "offset": 53
    },
    {
      "val": "100",
      "offset": 64
    }
  ],
  "location": "step_definitions.fillValidForm(String,String)"
});
formatter.result({
  "duration": 179202900,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.simulateClick()"
});
formatter.result({
  "duration": 224857300,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.resultForm()"
});
formatter.result({
  "duration": 983248400,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.browser_closure()"
});
formatter.result({
  "duration": 802942400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Simulação com valores inválidos",
  "description": "",
  "id": "simular-investimento;simulação-com-valores-inválidos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Quero simular um investimento na poupança",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Acesso o formulário de simulação como associado",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Preencho o formulário com valor inválido para o campo \"valorAplicar\" de \"1000\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Preencho o formulário com valor inválido para o campo \"valorInvestir\" de \"1000\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Preencho o formulário com valor inválido para o campo \"tempo\" de \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Vejo as mensagens que pedem valor válido",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Fecho o browser",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.loadPage()"
});
formatter.result({
  "duration": 7043716700,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.associateScroll()"
});
formatter.result({
  "duration": 341318200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valorAplicar",
      "offset": 55
    },
    {
      "val": "1000",
      "offset": 73
    }
  ],
  "location": "step_definitions.fillInvalidForm(String,String)"
});
formatter.result({
  "duration": 277298700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valorInvestir",
      "offset": 55
    },
    {
      "val": "1000",
      "offset": 74
    }
  ],
  "location": "step_definitions.fillInvalidForm(String,String)"
});
formatter.result({
  "duration": 217827100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tempo",
      "offset": 55
    },
    {
      "val": "100",
      "offset": 66
    }
  ],
  "location": "step_definitions.fillInvalidForm(String,String)"
});
formatter.result({
  "duration": 121897700,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.invalidValuesMessage()"
});
formatter.result({
  "duration": 106069100,
  "status": "passed"
});
formatter.match({
  "location": "step_definitions.browser_closure()"
});
formatter.result({
  "duration": 783597100,
  "status": "passed"
});
});
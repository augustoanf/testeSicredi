Feature: Simular investimento

   Scenario: Simulação com valores válidos
      Given Quero simular um investimento na poupança no portal do Sicredi
      Then Acesso o formulário de simulação como associado
      When Preencho o formulário com valor válido para o campo "valorAplicar" de "200000"
      And Preencho o formulário com valor válido para o campo "valorInvestir" de "10000"
      And Preencho o formulário com valor válido para o campo "tempo" de "100"
      And Clico para simular
      Then Vejo a tabela com resultados da simulação para "100" meses
   
   Scenario: Simulação com valores inválidos
      Given Quero simular um investimento na poupança no portal do Sicredi
      Then Acesso o formulário de simulação como associado
      When Preencho o formulário com valor inválido para o campo "valorAplicar" de "1000"
      And Preencho o formulário com valor inválido para o campo "valorInvestir" de "1000"
      And Preencho o formulário com valor inválido para o campo "tempo" de "100"
      Then Vejo a mensagen que solicita valor válido para aplicação
      Then Vejo a mensagen que solicita valor válido para investimento
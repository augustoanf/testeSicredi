Feature: Simular investimento

   Scenario: Simulação com valores válidos
      Given Quero simular um investimento na poupança
      Then Acesso o formulário de simulação como associado
      When Preencho o formulário com valor válido para o campo "valorAplicar" de "200000"
      And Preencho o formulário com valor válido para o campo "valorInvestir" de "10000"
      And Preencho o formulário com valor válido para o campo "tempo" de "100"
      And Clico para simular
      Then Vejo a tabela com resultados da simulação
      Then Fecho o browser
   
    

   Scenario: Simulação com valores inválidos
      Given Quero simular um investimento na poupança
      Then Acesso o formulário de simulação como associado
      When Preencho o formulário com valor inválido para o campo "valorAplicar" de "1000"
      And Preencho o formulário com valor inválido para o campo "valorInvestir" de "1000"
      And Preencho o formulário com valor inválido para o campo "tempo" de "100"
      Then Vejo as mensagens que pedem valor válido
      Then Fecho o browser
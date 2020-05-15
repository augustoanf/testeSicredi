Feature: Simular investimento

   Scenario: Simulação com valores válidos
      Given That I want to simulate a savings investment
      Then I access the simulation form as an associate
      When I fill the form with valid values
      And I click to simulate
      Then I see the simulation result form
      Then I close the browser
   
    

   Scenario: Simulação com valores inválidos
      Given That I want to simulate a savings investment
      Then I access the simulation form as an associate
      When I fill the form with invalid values
      Then I see the invalid values message
      Then I close the browser
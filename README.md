# Teste de Automação
Este projeto foi desenvolvido para atender ao teste de automação proposto pelo Sicredi.

Teste da API
O script com os cenários de teste da API foi desenvolvido em Rest Assured e está disponível em src/test/java/runner/TesteAPI.java
Neste script, a execução realiza os seguintes testes:
- Valida se o código retornado da chamada HTTP é 200;
- Valida se o retorno da chamada está em formato JSON;
- Valida se o retorno da chamada ocorre em menos de 5000ms;
- Valida se o retorno da chamada não apresenta erros;
- Valida os valores da chamada são os mesmos apresentados na descrição do teste;
- Valida se o JSON retornado da chamada atende aos requisitos do schema disponível em src/test/resources/schema.json.

# Teste da UI
O BDD foi desenvolvido em Cucumber e o framework utilizado para execução foi o Selenium Webdriver.
O arquivo que contém o BDD está em src/test/java/features/TesteSicredi.feature e o
arquivo que contém as funções está em src/test/java/seleniumgluecode/step_definitions.java.
Caso seja necessária a substituição do chromedriver, o mesmo está disponível em src/webdriver/chromedriver.exe.
A execução foi feita no Google Chrome e os seguintes cenários são executados:
- Cenário onde o associado preenche com valores válidos e o simulador retorna a tabela com os investimentos;
- Cenário onde o associado preenche com valores inválidos e o simulador apresenta o aviso em cada campo.

Este projeto foi desenvolvido por:

Antonio Augusto Fornari
anf.augusto@gmail.com
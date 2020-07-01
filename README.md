# Teste de Automação
Este projeto foi desenvolvido para atender ao teste de automação proposto pelo Sicredi. <br/>
O desenvolvimento foi feito em um projeto Maven (Versão 3.6.3) em Java (Versão 1.8.0).

# Teste da API
O script com os cenários de teste da API foi desenvolvido em Rest Assured (Versão 3.3.0) e está disponível no caminho: <br/>
src/test/java/runners/Teste_API.java. <br/>
Neste script, a execução realiza os seguintes testes:
- Valida se o código retornado da chamada HTTP é 200;
- Valida se o retorno da chamada está em formato JSON;
- Valida se o retorno da chamada ocorre em menos de 5000ms;
- Valida se o retorno da chamada não apresenta erros;
- Valida se os valores da chamada são os mesmos apresentados na descrição do teste;
- Valida se o JSON retornado da chamada atende aos requisitos do schema disponível em src/test/resources/schema.json.

# Teste da UI
O BDD foi desenvolvido em Cucumber (Versão 1.2.5) e o framework utilizado para execução foi o Selenium (Versão 3.7.1). <br/>
O arquivo que contém o BDD está em src/test/java/features/scenarios.feature. <br/>
O arquivo que contém as funções está em src/test/java/glue_code/step_definitions.java. <br/>
O arquivo que executa os cenários está em src/test/java/runners/Teste_GUI.java. <br/>
Caso seja necessária a substituição do ch romedriver, o mesmo está disponível em src/webdriver/chromedriver.exe. <br/>
A execução foi feita no Google Chrome (Versão 81.0.4044.138) e os seguintes cenários foram executados:
- Cenário onde o associado preenche com valores válidos e o simulador retorna a tabela com os investimentos;
- Cenário onde o associado preenche com valores inválidos e o simulador apresenta o aviso em cada campo.

Este projeto foi desenvolvido por: <br/>
Antonio Augusto Fornari <br/>
anf.augusto@gmail.com

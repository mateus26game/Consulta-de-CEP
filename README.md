# Projeto de Consulta de Endereço por CEP

Este projeto é uma aplicação Java que permite ao usuário buscar informações de endereço a partir de um CEP (Código de Endereçamento Postal) brasileiro. A aplicação utiliza a biblioteca Gson para manipulação de JSON e o JOptionPane para interações com o usuário.

Funcionalidades
--

* Entrada de CEP: O usuário é solicitado a inserir um CEP de 8 dígitos através de uma interface gráfica simples. A aplicação valida a entrada, garantindo que o formato esteja correto.

* Consulta de Endereço: Após a entrada do CEP, a aplicação faz uma requisição HTTP para a API de consulta de CEP, cep.republicavirtual.com.br, para obter os dados relacionados ao endereço.

* Exibição dos Resultados: As informações do endereço, como Unidade Federativa (UF), cidade, bairro e logradouro, são exibidas em uma janela de diálogo, permitindo fácil visualização das informações.

Estrutura do Código
--

* lasse Buscar: Contém o método main, que gerencia a entrada do usuário, a validação do CEP e a comunicação com a API para buscar as informações do endereço.

* Classe Endereco: Modela as informações do endereço obtidas da API. Contém atributos como uf, cidade, bairro, logradouro e tipo_logradouro, junto com métodos getters e setters para manipulação dos dados.


Tecnologias Utilizadas
--

* Java 11 ou superior
  
* JOptionPane para interface gráfica
  
* HttpClient para requisições HTTP
  
* Gson para conversão de JSON para objetos Java


Exemplo de Uso
--

Ao iniciar a aplicação, o usuário verá uma janela solicitando a entrada do CEP. Após digitar um CEP válido e pressionar "OK", o programa buscará os dados e exibirá as informações em uma nova janela.


link da ->[ API](https://www.republicavirtual.com.br/cep/exemplos.php)

link do -> [ GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)

link do -> [ Interface HttpResponse](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpResponse.html)

link do -> [ Class HttpRequest](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html)

  

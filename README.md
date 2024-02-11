
# Backend-Challenge

Um microsserviço em Java 21+ com Spring boot 3+ que vai expor um endpoint GET que será chamado por uma tela do projeto do item 2. Este backEnd vai receber neste GET o CEP que será digitado na tela do front, passará pelo backend, será validado (com tratamento de erro), e na sequência será chamado o serviço de CEP da https://viacep.com.br/, ex: https://viacep.com.br/ws/01001000/json/  aonde 01001000 é o CEP em questão. A chamada para o viacep deverá ficar na camada Service. Precisa implementar tratamento de erro e Log da aprovação. Deverá ser preenchido um DTO com o resultado do ViaCep para ser exposto na Api via GET. 


## Demonstração

https://front-challenge.netlify.app

(Como o backend nao possui um certificado SSL, é necessário habilitar requisicões não seguras no navegador)
## Rodando o projeto com docker

Clone o projeto na sua máquina e execute os seguintes comandos dentro do diretório:

```bash
  docker build -t giovanacarvalhodev/challenge-backend .   
  docker run -p 8080:8080 giovanacarvalhodev/challenge-backend
```
    
## Rodando os testes

Para rodar os testes, rode o seguinte comando

```bash
  mvn test
```

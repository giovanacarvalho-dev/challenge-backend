
# Backend-Challenge

Um microsserviço em Java 21+ com Spring boot 3+ que vai expor um endpoint GET que será chamado por uma tela do projeto do item 2. Este backEnd vai receber neste GET o CEP que será digitado na tela do front, passará pelo backend, será validado (com tratamento de erro), e na sequência será chamado o serviço de CEP da https://viacep.com.br/, ex: https://viacep.com.br/ws/01001000/json/  aonde 01001000 é o CEP em questão. A chamada para o viacep deverá ficar na camada Service. Precisa implementar tratamento de erro e Log da aprovação. Deverá ser preenchido um DTO com o resultado do ViaCep para ser exposto na Api via GET. 



## Demonstração

http://3.93.70.125:8080/api/cep/30494390

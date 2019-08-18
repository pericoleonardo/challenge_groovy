# "Lista de Exercícios"

Problema:

  - Criar um programa simples, sem interface gráfica, que execute operações de CRUD utilizando-se arquivos do formato .json;
  - Será permitido o uso de bibliotecas que facilitem a resolução do problema, porém deverá ser necessário informa o local da documentação da lib, 
  e o porque do seu uso em um comentário simples no método e/ou função que a esteja utilizando;
  - O programa deve executar as operações de CRUD utilizando o modelo de Pessoa e Usuario;
  
Critérios obrigatórios:

  - Os arquivos deverão ser salvos em um diretório de escolha, mas seguindo o seguinte padrão: MODELO/ARQUIVO.json;  
  - O modelo de Pessoa precisa ter as seguintes características:
  
    - atributo nome do tipo string e obrigatório;
    - atributo email do tipo string;
    
  - O modelo de Usuário precisa ter as seguintes características:
   
    - relacionamento com o modelo de Pessoa;
    - o usuário só poderá existir, se houve o relacionamento com o modelo de Pessoa;
    - atributo login do tipo string, se Pessoa tiver o atributo email usá-lo como parâmetro, e obrigatório;
    - atributo senha do tipo string e obrigatório;
    
  - Utilizar o modelo de POGOs;
  - Utilizar boas práticas do Java em todo o projeto;

Critérios adicionais e pontos extras:
  
  - Colocar as modificações feitas em um branch especifica;
  - Criptografar o atributo senha em AES 256bits;
  - Criar os scripts de execução seguindo o modelo de projeto gradle;
  - Descrição dos itens feitos nos commits;
  

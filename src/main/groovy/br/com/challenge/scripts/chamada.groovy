package br.com.challenge.scripts
import br.com.challenge.model.Pessoa
import br.com.challenge.service.PessoaService


def pessoa = new Pessoa(nome: "Teste", email: "teste@teste")

PessoaService.create(pessoa)

PessoaService.delete("Teste")
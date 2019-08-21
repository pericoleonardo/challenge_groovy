package br.com.challenge.service
import br.com.challenge.model.Pessoa
import groovy.json.JsonOutput

class PessoaService {
    static void create(Pessoa pessoa){

        try{
            if (!pessoa){
                throw new Exception("Pessoa está nulo!")
            }
            if (!pessoa.nome){
                throw new Exception("Nome deve ser preenchido!")
            }
            def file = new File("/tmp/${pessoa.nome}.json")
            if (file.exists())
                throw new Exception("Pessoa já existe!")

            def json = JsonOutput.toJson(pessoa)
            def json_pretty = JsonOutput.prettyPrint(json)
            file.write(json_pretty)
        } catch(Exception e) {
            e.printStackTrace()
        }
    }

    def update(id, params){

    }

    static void delete(nome){
        new File("/tmp/${nome}.json").delete()
    }

    def listalone(id){

    }

    def listall(){

    }
}

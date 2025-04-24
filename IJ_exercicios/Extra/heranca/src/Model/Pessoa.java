package Model;

public class Pessoa {
    String nome;
    String telefone;

    //metodo construtor padrão (vazio e sem parámetros)
    public Pessoa() {

    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void mudarTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void mudarNome(String nome) {
        this.nome = nome;
    }
}

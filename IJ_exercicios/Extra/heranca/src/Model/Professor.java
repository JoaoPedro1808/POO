package Model;

public class Professor extends Pessoa {
    String titulacao;

    public Professor() {

    }

    public Professor(String nome, String telefone, String titulacao) {
        super(nome, telefone);
        this.titulacao = titulacao;
    }
}

package Model;

public class Professor extends Pessoa {
    private String titulacao;
    private String nome;
    private String telefone;

    public Professor() {

    }

    public Professor(String nome, String telefone, String titulacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.titulacao = titulacao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}

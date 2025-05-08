package Model;

public class Aluno extends Pessoa {
    private String matricula;
    private String nome;
    private String telefone;

    public Aluno() {

    }

    public Aluno(String nome, String telefone, String matricula){
        this.nome = nome;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

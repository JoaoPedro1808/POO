package Model;

public class Monitor extends Aluno {
    private double percentualdebolsa;
    private String nome;
    private String telefone;
    private String matricula;

    public Monitor() {

    }

    public Monitor(String nome, String telefone, String matricula, double bolsa) {
        this.nome = nome;
        this.telefone = telefone;
        this.matricula = matricula;
        this.percentualdebolsa = bolsa;
    }

    public double getPercentualdebolsa() {
        return percentualdebolsa;
    }

    public void setPercentualdebolsa(double percentualdebolsa) {
        this.percentualdebolsa = percentualdebolsa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

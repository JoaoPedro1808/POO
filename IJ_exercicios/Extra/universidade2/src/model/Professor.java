package model;

public class Professor {
        private String nome;
        private String matri;
        private String titulacao;
        private Disciplina disciplina;

    public Professor(String nome, String matri, String titulacao, Disciplina disciplina) {
        this.nome = nome;
        this.matri = matri;
        this.titulacao = titulacao;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}

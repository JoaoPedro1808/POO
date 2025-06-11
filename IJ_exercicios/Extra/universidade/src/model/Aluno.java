package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private String matricula;
    private String nome;
    private Set<Turma> turmas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new HashSet<Turma>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addturma(Turma turma) {
        this.turmas.add(turma);
    }

    public void returma(Turma turma) {
        this.turmas.remove(turma);
    }

}

package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private String nome;
    private String telefone;
    private Set<Turma> turmas;

    public Aluno(String nome, String telefone, Disciplina disciplina) {
        this.turmas = new HashSet<Turma>();
        this.nome = nome;
        this.telefone = telefone;
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

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addturma (Turma turma) {
        this.turmas.add(turma);
    }

    public void removeturma (Turma turma) {
        this.turmas.remove(turma);
    }
}

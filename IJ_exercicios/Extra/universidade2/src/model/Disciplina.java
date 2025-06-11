package model;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String cod;
    private int cargahoraria;
    private String nome;
    private Set<Professor> professores;
    private Set<Turma> turmas;

    public Disciplina(String cod, int cargahoraria, String nome) {
        this.professores = new HashSet<Professor>();
        this.turmas = new HashSet<Turma>();
        this.cod = cod;
        this.cargahoraria = cargahoraria;
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Set<Professor> professores) {
        this.professores = professores;
    }

    public void addprof(Professor professor) {
        this.professores.add(professor);
    }

    public void removeprof(Professor professor) {
        this.professores.remove(professor);
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

    public void removeturma(Turma turma) {
        this.turmas.remove(turma);
    }
}

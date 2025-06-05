package model;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private Set<Turma> turmas;
    private Cursos cursos;

    public Disciplina(String codigo, String nome, int cargaHoraria,  Cursos cursos) {
        this.turmas = new HashSet<Turma>();
        this.cursos = cursos;
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public void addturma(Turma turma) {
        this.turmas.add(turma);
    }

    public void returma(Turma turma) {
        this.turmas.remove(turma);
    }
}


package model;

import java.util.HashSet;
import java.util.Set;

public class Cursos {
    private String codigo;
    private String nome;
    private Set<Disciplina> disciplinas;

    public Cursos(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new HashSet<Disciplina>();

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

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adddisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removedisc(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
}

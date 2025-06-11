package model;

public class Turma {
    private String cod;
    private String diadasemana;
    private int cargahoraria;
    private String horario;
    private String sala;
    private Disciplina disciplina;

    public Turma(String cod, String diadasemana, int cargahoraria, String horario, String sala, Disciplina disciplina) {
        this.cod = cod;
        this.diadasemana = diadasemana;
        this.cargahoraria = cargahoraria;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDiadasemana() {
        return diadasemana;
    }

    public void setDiadasemana(String diadasemana) {
        this.diadasemana = diadasemana;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}

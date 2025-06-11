package control;

import model.Aluno;
import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("IBM5132", 80, "POO");
        Professor profjuan = new Professor("Juan Lopéz da Silva","38456873945","Doutor",poo);
        Turma poojuan = new Turma("8003","Segunda-feira",80,"M1 a M4","302",poo);

        poo.addprof(profjuan);
        poo.addturma(poojuan);

        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getDisciplina().getNome());
        }

        for (Professor professor : poo.getProfessores()) {
            System.out.println(professor.getNome());
        }
    }
}

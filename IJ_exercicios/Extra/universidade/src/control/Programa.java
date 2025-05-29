package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("IBM513", "Programação OO", 80);
        Disciplina engdados = new Disciplina("IBM123", "Engenharia de dados", 90);
        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("678910", "Anderson Silva", "Mestre");
        Professor profTalita = new Professor("234234", "Talita Viera", "M1 a M4");
        Turma pooSemProf = new Turma("CDIA8001", "Quinta-feira", "M1 a M4", "207", poo);
        Turma pooThiago = new Turma("CDIA8002", "Quarta-feira", "T1 a T4", "312", profThiago, poo);
        Turma engAnderson = new Turma("CDIA3456", "Terça-feira", "M1 a M4", "209", profAnderson, engdados);

        profThiago.addturma(pooThiago);
        profAnderson.addturma(engAnderson);
        profTalita.addturma(pooSemProf);
        pooSemProf.setProfessor(profTalita);

        poo.addturma(pooThiago);
        poo.addturma(pooSemProf);

        // Quais as disciplinas de um determinado professor?
        for (Turma turma : profThiago.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
            System.out.println(turma.getDisciplina().getNome());
            System.out.println(turma.getProfessor().getMatricula());
        }

        // Quais professores ministram a disciplina POO?
        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }
    }
}

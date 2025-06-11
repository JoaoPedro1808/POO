package control;

import model.*;

public class Programa {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos("IBM5363", "curso1");
        Cursos curso2 = new Cursos("IBM5364", "curso2");
        Cursos curso3 = new Cursos("IBM5365", "curso3");
        Cursos curso4 = new Cursos("IBM5366", "curso4");

        Disciplina poo = new Disciplina("IBM513", "Programação OO", 80, curso1);
        Disciplina engdados = new Disciplina("IBM123", "Engenharia de dados", 90, curso2);
        Disciplina arcomp = new Disciplina("IBM 234", "Arquitetura de computadores", 90, curso3);

        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("678910", "Anderson Silva", "Mestre");
        Professor profTalita = new Professor("234234", "Talita Viera", "Doutor");
        Professor profClayton = new Professor("27895", "Clayton Jones", "Mestre");

        Turma pooSemProf = new Turma("CDIA8001", "Quinta-feira", "M1 a M4", "207", poo);
        Turma pooThiago = new Turma("CDIA8002", "Quarta-feira", "T1 a T4", "312", profThiago, poo);
        Turma engAnderson = new Turma("CDIA3456", "Terça-feira", "T1 a T4", "209", profAnderson, engdados);
        Turma arqClayton = new Turma("ENGC73974", "Terça-feira", "M1 a M4", "102", profClayton, arcomp);

        Aluno joazinho = new Aluno("21356645", "Joãozinho");

        profThiago.addturma(pooThiago);
        profAnderson.addturma(engAnderson);
        profTalita.addturma(pooSemProf);
        pooSemProf.setProfessor(profTalita);
        joazinho.addturma(pooThiago);


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

        for (Turma turma : joazinho.getTurmas()) {
            System.out.println(turma.getDisciplina().getNome());
        }


        for (Turma turma : arcomp.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }
    }



}

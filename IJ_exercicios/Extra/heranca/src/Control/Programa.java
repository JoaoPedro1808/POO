package Control;

import Model.Aluno;
import Model.Monitor;
import Model.Pessoa;
import Model.Professor;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "2349249824";
        System.out.println("Telefone: " + aluno1.telefone);
        aluno1.mudarTelefone("98234923469");
        System.out.println("Telefone: " + aluno1.telefone);

        System.out.println("-------------------------------------------------------------");

        Aluno aluno2 = new Aluno("Luffy", "394593459", "924329845");
        System.out.println("Nome: " + aluno2.nome + "\n" + "Telefone: " + aluno2.telefone + "\n" + "Matricula: " + aluno2.matricula);

        System.out.println("-------------------------------------------------------------");

        Pessoa pessoa2 = new Pessoa("Miguel", "45454574747");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Telefone: " + pessoa2.telefone);

        System.out.println("-------------------------------------------------------------");


        Pessoa pessoa1 = new Pessoa("John Doe");
        System.out.println("Nome: " + pessoa1.nome);

        System.out.println("-------------------------------------------------------------");

        Monitor monitor1 = new Monitor();
        monitor1.nome = "John";
        monitor1.matricula = "34593475857859";
        //monitor1.percentualdebolsa = 50.0;
        monitor1.setPercentualdebolsa(30.0);
        System.out.println("Nome: " + monitor1.nome + "\n" + "Matricula: " + monitor1.matricula + "\n" + "Percentual de bolsa: " + monitor1.getPercentualdebolsa());

        System.out.println("-------------------------------------------------------------");

        Monitor monitor2 = new Monitor("Daniel", "49574938579", "9345785759735", 50);

        System.out.println("Nome: " + monitor2.nome + "\n" + "Telefone: " + monitor2.telefone + "\n" + "Matricula: " + monitor2.matricula + "\n" + "Porcentagem de bolsa: " + monitor2.getPercentualdebolsa());

        System.out.println("-------------------------------------------------------------");

        Professor professor1 = new Professor();
        professor1.nome = "Martins";
        professor1.telefone = "98457937578357";
        professor1.titulacao = "Doutor";
        System.out.println("Nome: " + professor1.nome + "\n" +"Titulação: " + professor1.titulacao);

        System.out.println("-------------------------------------------------------------");

        Professor professor2 = new Professor("Rafael", "7834563457", "Mestre");
        System.out.println("Nome: " + professor2.nome + "\n" +"Titulação: " + professor2.titulacao);
    }
}

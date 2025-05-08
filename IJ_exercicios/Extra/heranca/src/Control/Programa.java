package Control;

import Model.Aluno;
import Model.Monitor;
import Model.Pessoa;
import Model.Professor;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        aluno1.setTelefone("2349249824");
        System.out.println("Telefone: " + aluno1.getTelefone());

        System.out.println("-------------------------------------------------------------");

        Aluno aluno2 = new Aluno("Luffy", "394593459", "924329845");
        System.out.println("Nome: " + aluno2.getNome() + "\n" + "Telefone: " + aluno2.getTelefone() + "\n" + "Matricula: " + aluno2.getMatricula());

        System.out.println("-------------------------------------------------------------");

        Pessoa pessoa2 = new Pessoa("Miguel", "45454574747");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Telefone: " + pessoa2.getTelefone());

        System.out.println("-------------------------------------------------------------");


        Pessoa pessoa1 = new Pessoa("John Doe");
        System.out.println("Nome: " + pessoa1.getNome());

        System.out.println("-------------------------------------------------------------");

        Monitor monitor1 = new Monitor();
        monitor1.setNome("John");
        monitor1.setMatricula("34593475857859");
        //monitor1.percentualdebolsa = 50.0;
        monitor1.setPercentualdebolsa(30.0);
        monitor1.setTelefone("93475684735");
        System.out.println("Nome: " + monitor1.getNome() + "\n" + "Matricula: " + monitor1.getMatricula() + "\n" + "Percentual de bolsa: " + monitor1.getPercentualdebolsa() + "\n" + "Telefone: " + monitor1.getTelefone());

        System.out.println("-------------------------------------------------------------");

        Monitor monitor2 = new Monitor("Daniel", "49574938579", "9345785759735", 50);

        System.out.println("Nome: " + monitor2.getNome() + "\n" + "Telefone: " + monitor2.getTelefone() + "\n" + "Matricula: " + monitor2.getMatricula() + "\n" + "Porcentagem de bolsa: " + monitor2.getPercentualdebolsa());

        System.out.println("-------------------------------------------------------------");

        Professor professor1 = new Professor();
        professor1.setNome("Martins");
        professor1.setTelefone("98457937578357");
        professor1.setTitulacao("Doutor");
        System.out.println("Nome: " + professor1.getNome() + "\n" +"Titulação: " + professor1.getTitulacao() + "\n" + "Telefone: " + professor1.getTelefone());

        System.out.println("-------------------------------------------------------------");

        Professor professor2 = new Professor("Rafael", "7834563457", "Mestre");
        System.out.println("Nome: " + professor2.getNome() + "\n" +"Titulação: " + professor2.getTitulacao()+ "\n" + "Telefone: " + professor1.getTelefone());
    }
}

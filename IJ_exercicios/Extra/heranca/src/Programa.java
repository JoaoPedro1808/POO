import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "2349249824";
        System.out.println("Telefone: " + aluno1.telefone);
        aluno1.mudarTelefone("98234923469");
        System.out.println("Telefone: " + aluno1.telefone);

        System.out.println("-------------------------------------------------------------");

        Monitor monitor1 = new Monitor();
        monitor1.nome = "John";
        monitor1.matricula = "34593475857859";
        monitor1.percentualdebolsa = 50.0;
        System.out.println("Nome: " + monitor1.nome + "\n" + "Matricula: " + monitor1.matricula + "\n" + "Percentual de bolsa: " + monitor1.percentualdebolsa);

        System.out.println("-------------------------------------------------------------");

        Professor professor1 = new Professor();
        professor1.nome = "Martins";
        professor1.cod = "98457937578357";
        professor1.titulacao = "Doutor";
        System.out.println("Nome: " + professor1.nome + "\n" + "Código: " + professor1.cod + "\n" + "Titulação: " + professor1.titulacao);

        System.out.println("-------------------------------------------------------------");

        professor1.mudarNomeP("Lucas");
        professor1.mudarCod("2572057275850943");
        professor1.mudarTitulacao("Mestre");
        System.out.println("Nome: " + professor1.nome + "\n" + "Código: " + professor1.cod + "\n" + "Titulação: " + professor1.titulacao);
    }
}

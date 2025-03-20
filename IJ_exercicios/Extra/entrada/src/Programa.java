import javax.swing.*;

public class Programa {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String idade = JOptionPane.showInputDialog("Qual é a sua idade");
        int idade1 = Integer.parseInt(idade);

        System.out.println(nome);
        System.out.println(idade1);

        if(idade1 >= 18) {
            System.out.println("Você está habilitado para se matricular no curso");
        }
        else {
            System.out.println("Você NÃO está habilitado para se matricular no curso");
        }
    }
}

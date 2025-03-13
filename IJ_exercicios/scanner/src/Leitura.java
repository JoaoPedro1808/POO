import java.util.Arrays;
import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        int idade;
        float peso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        System.out.println("Qual é o seu peso?");
        peso = teclado.nextFloat();
        System.out.println("Idade: " + idade + " anos" + "\n" + "Peso: " + peso + " kilos");
    }
}

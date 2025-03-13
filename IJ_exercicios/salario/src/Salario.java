import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");
        float paga = teclado.nextFloat();
        System.out.println("Informe o percentual de aumento: ");
        float percentual = teclado.nextFloat();
        System.out.println("Salário: " + paga + "\n" + "Salário com aumento: " + (paga +(paga*percentual/100)));
    }
}

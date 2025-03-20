import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        float var1 = teclado.nextFloat();
        System.out.println("Segundo valor: ");
        float var2 = teclado.nextFloat();
        System.out.println("Soma: " + (var1 + var2) + "\n" + "Substração: " + (var1 - var2) + "\n" + "Multiplicação: " + (var1 * var2) + "\n" + "divisão: " + (var1 / var2) + "\n");
    }
}

import javax.swing.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        float paga = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu salario"));
        float percentual = Float.parseFloat(JOptionPane.showInputDialog("Informe a porcentagem do seu aumento"));

        float aumento = (paga * (percentual/100));
        float novosalario = paga + percentual;

        JOptionPane.showMessageDialog(null, "Aumento de " + aumento + " R$");
        JOptionPane.showMessageDialog(null, "O novo salario é " + novosalario + " R$");

    }
}

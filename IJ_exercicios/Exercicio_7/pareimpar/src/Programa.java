import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));

        if(n%2 == 0) {
            System.out.println("È par");
        }
        else {
            System.out.println("È impar");
        }
    }
}

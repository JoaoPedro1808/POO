import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog("Inserir o valor: "));

        double x1 = Math.round(x);

        JOptionPane.showMessageDialog(null, "Valor final: " + x1);
    }
}

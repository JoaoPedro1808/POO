import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String op = JOptionPane.showInputDialog("Digite a operação");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

        if (op.equals("+")){
            JOptionPane.showMessageDialog(null, "Resultado: " + (a + b));
        } 
        else if (op.equals("-")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (a - b));
        }
        else if (op.equals("*")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (a * b));
        } else if (op.equals("/")) {
            JOptionPane.showMessageDialog(null, "Resultado: " + (a / b));
        }
    }
}

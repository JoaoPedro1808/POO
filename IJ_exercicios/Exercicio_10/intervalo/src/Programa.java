import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int inf = Integer.parseInt(JOptionPane.showInputDialog("Digite o menor valor"));
        int sup = Integer.parseInt(JOptionPane.showInputDialog("Digite o maior valor"));
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));

        if(inf <= num && num <= sup) {
            JOptionPane.showMessageDialog(null, "O valor esta dentro do intervalo");
        }
        else if (num > sup) {
            JOptionPane.showMessageDialog(null, "O valor esta depois do intervalo");
        }
        else {
            JOptionPane.showMessageDialog(null,"O valor esta antes do intervalo");
        }
    }
}

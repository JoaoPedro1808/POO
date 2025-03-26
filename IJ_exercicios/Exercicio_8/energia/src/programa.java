import javax.swing.*;

public class programa {
    public static void main(String[] args) {
        int kilo = Integer.parseInt(JOptionPane.showInputDialog("Consumo total en kilowats "));

        int kilo1 = Integer.parseInt((JOptionPane.showInputDialog("Valor do kilowats em R$")));

        if(kilo < 150) {
            JOptionPane.showMessageDialog(null, "Valor a ser pago: " + ((kilo1 - (kilo1 * 0.1)) * kilo));
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor a se pago: " + (kilo1 * kilo));
        }
    }
}

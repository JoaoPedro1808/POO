import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int dis = Integer.parseInt(JOptionPane.showInputDialog("Distancia percorrida: "));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo gasto: "));
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de gasolina consumida: "));

        int kmh = dis / tempo;
        int kml = dis / quant;

        JOptionPane.showMessageDialog(null, kmh + "KM/h" + "\n" + kml + " KM/l");
    }
}

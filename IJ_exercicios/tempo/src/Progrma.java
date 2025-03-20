import javax.swing.*;

public class Progrma {
    public static void main(String[] args) {
        int t = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo em segundos: "));

        int segundos = t / 60;
        int minutos = (segundos % 3600) / 60;
        int horas = (minutos % 3600) % 60;

        JOptionPane.showMessageDialog(null,  "Segundos: " + segundos + "\n" + "Minutos: " + minutos + "\n" + "Horas: " + horas);
    }
}

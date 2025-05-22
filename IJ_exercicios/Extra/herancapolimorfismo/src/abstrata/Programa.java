package abstrata;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Carro: ");
        Veiculo carro1 = new Carro();
        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());
        System.out.println(carro1.numerosRodasminimo);

        System.out.println("------------------------------------------");

        System.out.println("Moto: ");
        Veiculo moto1 = new Moto();
        System.out.println(moto1.acelerar());
        System.out.println(moto1.frear());
        System.out.println(moto1.numerosRodasminimo);
    }
}

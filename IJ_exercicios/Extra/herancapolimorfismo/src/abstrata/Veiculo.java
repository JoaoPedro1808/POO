package abstrata;

public abstract class Veiculo {
    final int numerosRodasminimo = 2;
    String placa;
    String chassi;

    abstract public String acelerar();

    public String frear() {
        return "Freando";
    }
}

package abstrata;

public class Moto extends Veiculo{
    public String acelerar() {
        return "Acelerando a moto";
    }

    @Override
    public String frear() {
        return "Freando a moto";
    }
}

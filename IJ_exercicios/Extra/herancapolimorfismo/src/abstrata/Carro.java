package abstrata;

public class Carro extends Veiculo{
    public String acelerar() {
        return "Acelerando o carro";
    }

    @Override
    public String frear() {
        return "Freando o carro";
    }
}

package Model;

public class Monitor extends Aluno {
    private double percentualdebolsa;

    public Monitor() {

    }

    public Monitor(String nome, String telefone, String matricula, double bolsa) {
        super(nome, telefone, matricula);
        this.percentualdebolsa = bolsa;
    }

    public double getPercentualdebolsa() {
        return percentualdebolsa;
    }

    public void setPercentualdebolsa(double percentualdebolsa) {
        this.percentualdebolsa = percentualdebolsa;
    }
}

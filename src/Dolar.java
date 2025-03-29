public class Dolar extends Moeda {
    private double cotacao = 6.0;

    public Dolar(double valor) {
        super("Dólar", valor); 
    }

    @Override
    public double converter() {
        return getValor() * cotacao;
    }
}

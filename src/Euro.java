public class Euro extends Moeda {
    private double cotacao = 7.0;

    public Euro(double valor) {
        super("Euro", valor); 
    }

    @Override
    public double converter() {
        return getValor() * cotacao;
    }
}

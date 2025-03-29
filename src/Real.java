public class Real extends Moeda {

    public Real(double valor) {
        super("Real", valor);
    }

    @Override
    public double converter() {
        return getValor(); 
    }
}

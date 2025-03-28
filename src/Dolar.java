public class Dolar extends Moeda{
	
	private double cotacao = 6.0;
	
	
	@Override
	public double converter(double valorMoeda) {
		return valorMoeda * cotacao;
	}

	@Override
	public void info(double valorConvertido) {
		System.out.println("Dolar: " + valorConvertido);
	}
}

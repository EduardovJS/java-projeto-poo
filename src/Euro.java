public class Euro extends Moeda {
	private double cotacao = 7.0;

	@Override
	public double converter(double valorMoeda) {
		return valorMoeda * cotacao;
	}

	@Override
	public void info(double valorConvertido) {
		System.out.println("Euro: " + valorConvertido);
	}

}

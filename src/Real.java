public class Real extends Moeda {


	@Override
	public double converter(double valorMoeda) {
		return valorMoeda;
	}

	@Override
	public void info(double valorConvertido) {
		System.out.println("Real: " + valorConvertido);
	}
}

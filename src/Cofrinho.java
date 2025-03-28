import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Double> listaMoedas = new ArrayList<>();

	public void add(Moeda moeda, double valor) {
		double convertido  = moeda.converter(valor);
		listaMoedas.add(convertido);	
		moeda.info(convertido);
	}

	public void removerMoeda(Moeda moeda, double valor) {
		double convertido = moeda.converter(valor);
		if(listaMoedas.contains(convertido)) {
			listaMoedas.remove(convertido);
		}
	}

	public void listagemMoedas() {
		for(double valor : listaMoedas) {
			System.out.println("Valor:" + valor);
		}
	}

	public void totalConvertido() {
		double total = 0.0;
		for(double valor: listaMoedas) {
			total += valor;
		}
		
	}

}

import java.util.ArrayList;

public class Cofrinho extends Moeda {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
     
    public void add(Moeda moeda) {
    	listaMoedas.add(moeda);
    }	
    public void removerMoeda(Moeda moeda) {
    	listaMoedas.remove(moeda);
    }
    
    public void listagemMoedas(Moeda moeda) {
    	
    }
    
    public void totalConvertido() {
    	
    }
    
		
}

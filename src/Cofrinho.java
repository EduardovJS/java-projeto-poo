import java.util.ArrayList;

public class Cofrinho {

    // Lista para armazenar as moedas
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    private double totalEmReal = 0.0;

    // Método para adicionar moeda e valor convertido
    public void add(Moeda moeda) {
        double convertido = moeda.converter(); // Converte o valor da moeda
        moeda.setValor(convertido); // Atualiza o valor convertido
        listaMoedas.add(moeda); // Adiciona a moeda na lista
        totalEmReal += convertido; // Atualiza o total
        moeda.info(); // Exibe as informações da moeda
    }

    // Método para remover a moeda
    public void removerMoeda(Moeda moeda) {
        for (int i = 0; i < listaMoedas.size(); i++) {
            if (listaMoedas.get(i).getValor() == moeda.getValor()) { // Compara o valor
                totalEmReal -= listaMoedas.get(i).getValor(); // Subtrai o valor do total
                listaMoedas.remove(i); // Remove a moeda
                System.out.println("Moeda removida: " + moeda.getNome() + " | Valor: " + moeda.getValor());
                break; 
            }
        }
    }

    // Método para listar todas as moedas
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Nenhuma moeda no cofrinho.");
        } else {
            for (Moeda moeda : listaMoedas) {
                moeda.info(); // Exibe nome e valor
            }
        }
    }

    // Método para mostrar o total em Real
    public void totalConvertido() {
        System.out.println("Total em Real: R$ " + totalEmReal);
    }
}

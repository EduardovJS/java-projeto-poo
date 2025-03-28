import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Cofrinho cofre = new Cofrinho();
		
		Moeda real = new Real();
		Moeda euro = new Euro();
		Moeda dolar = new Dolar();
		
	
		int opcao;
		double valor;
		int moeda;

		System.out.println("Cofrinho");
		System.out.println("Cotação Dolar: R$ 6,00");
		System.out.println("Cotação Euro: R$ 7,00");

		do {
			System.out.println();
			System.out.println("1 - Adicionar Moedas");
			System.out.println("2 - Remover Moedas");
			System.out.println("3 - Listar todas as Moeda");
			System.out.println("4 - Valor total em Real");
			System.out.println("5 - Encerrar");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				// Adicionar Moedas
				System.out.println("Escolha a moeda que queria adicionar: ");
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				moeda = scanner.nextInt();
				System.out.println("Digite o valor da moeda:");
				valor = scanner.nextDouble();			
				 
                if (moeda == 1) {
                    cofre.add(dolar, valor);
                } else if (moeda == 2) {
                    cofre.add(euro, valor);
                } else if (moeda == 3) {
                    cofre.add(real, valor);
                }
                break;
			case 2:
				// Remover Moedas
                System.out.println("Escolha a moeda que queira remover:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                moeda = scanner.nextInt();
                System.out.println("Digite o valor da moeda:");
                valor = scanner.nextDouble();
                
                if (moeda == 1) {
                    cofre.removerMoeda(dolar, valor);
                } else if (moeda == 2) {
                    cofre.removerMoeda(euro, valor);
                } else if (moeda == 3) {
                    cofre.removerMoeda(real, valor);
                }
                break;
			case 3:
				// Listar todas as Moedas
				System.out.println("Lista: ");
                cofre.listagemMoedas();
				break;
			case 4: 
				// Valor total em Real
				cofre.totalConvertido();
				break;
			case 5:
				// Encerrar
				System.out.println();
				System.out.println("Programa Encerrado.");	
			}
			
		} while (opcao != 5);
	}
}

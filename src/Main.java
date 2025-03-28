import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao;
		double valor;
		int moeda;

		System.out.println("Cofrinho");

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
				break;
			case 2:
				// Remover Moedas
				System.out.println("Escolha a moeda que queira remover:");
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				moeda = scanner.nextInt();
				System.out.println("Digite o valor da moeda:");
				valor = scanner.nextDouble();
				break;
			case 3:
				// Listar todas as Moedas
				System.out.println("Lista: ");
				break;
			case 4: 
				// Valor total em Real
				System.out.println("Valor total em real de todas as moedas: ");
				break;
			case 5:
				// Encerrar
				System.out.println();
				System.out.println("Programa Encerrado.");	
			}
			
		} while (opcao != 5);
	}
}

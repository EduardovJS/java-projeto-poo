import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        int opcao;
        double valor;
        int moeda;

        System.out.println("Cofrinho");
        System.out.println("Cotação Dólar: R$ 6,00");
        System.out.println("Cotação Euro: R$ 7,00");

        do {
            System.out.println();
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar todas as Moedas");
            System.out.println("4 - Valor total em Real");
            System.out.println("5 - Encerrar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Moeda
                    System.out.println("Escolha a moeda que quer adicionar: ");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    moeda = scanner.nextInt();
                    System.out.println("Digite o valor da moeda:");
                    valor = scanner.nextDouble();

                    if (moeda == 1) {
                        cofre.add(new Dolar(valor)); // Adiciona Dólar
                    } else if (moeda == 2) {
                        cofre.add(new Euro(valor)); // Adiciona Euro
                    } else if (moeda == 3) {
                        cofre.add(new Real(valor)); // Adiciona Real
                    }
                    break;

                case 2:
                    // Remover Moeda
                    System.out.println("Escolha a moeda que deseja remover:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    moeda = scanner.nextInt();
                    System.out.println("Digite o valor da moeda:");
                    valor = scanner.nextDouble();

                    if (moeda == 1) {
                        cofre.removerMoeda(new Dolar(valor)); // Remove Dólar
                    } else if (moeda == 2) {
                        cofre.removerMoeda(new Euro(valor)); // Remove Euro
                    } else if (moeda == 3) {
                        cofre.removerMoeda(new Real(valor)); // Remove Real
                    }
                    break;

                case 3:
                    // Listar todas as Moedas
                    System.out.println("Lista de Moedas:");
                    cofre.listagemMoedas(); // Lista as moedas
                    break;

                case 4:
                    // Valor total em Real
                    cofre.totalConvertido(); // Exibe o total em Real
                    break;

                case 5:
                    // Encerrar
                    System.out.println("Programa Encerrado.");
                    break;
            }
        } while (opcao != 5);
    }
}

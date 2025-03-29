public abstract class Moeda {
    private String nome;
    private double valor;

    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double converter();  // Método abstrato para conversão de moeda

    public void info() {
        System.out.println("Moeda: " + nome + " | Valor: " + valor);
    }
}

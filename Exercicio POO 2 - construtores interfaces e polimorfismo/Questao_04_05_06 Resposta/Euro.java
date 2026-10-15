public class Euro implements Moeda {
    public double getValor() {
        return 1.0;
    }

    public String getNome() {
        return "Euro";
    }

    public double getValorEmDolar() {
        return 1.08; // Cotação fictícia
    }
}
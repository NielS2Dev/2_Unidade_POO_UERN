public class Real implements Moeda {
    public double getValor() {
        return 1.0;
    }

    public String getNome() {
        return "Real Brasileiro";
    }

    public double getValorEmDolar() {
        return 0.20; // Cotação fictícia
    }
}
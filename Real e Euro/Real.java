// Classe Real
public class Real implements Moeda {
    private double valor;

    public Real(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return "Real";
    }

    public double getValorEmDolar() {
        return valor * 0.20; // Converte para dólar multiplicando pela cotação
    }
}

// Classe Euro
public class Euro implements Moeda {
    private double valor;

    public Euro(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return "Euro";
    }

    public double getValorEmDolar() {
        return valor * 1.08; // Converte para dólar multiplicando pela cotação
    }
}
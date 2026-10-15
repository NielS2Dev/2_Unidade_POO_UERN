public class Principal {
    public static void main(String[] args) {
        Moeda moedaNacional = new Real();
        Moeda moedaEstrangeira = new Euro();

        System.out.println("Moeda: " + moedaNacional.getNome() + " | Valor em Dólar: " + moedaNacional.getValorEmDolar());
        System.out.println("Moeda: " + moedaEstrangeira.getNome() + " | Valor em Dólar: " + moedaEstrangeira.getValorEmDolar());
    }
}
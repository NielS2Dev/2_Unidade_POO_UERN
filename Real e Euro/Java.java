public class Java {
    public static void main(String[] args) {
        Moeda r = new Real(100);
        Moeda e = new Euro(100);

        System.out.println(r.getNome() + " em dólar: " + r.getValorEmDolar());
        System.out.println(e.getNome() + " em dólar: " + e.getValorEmDolar());
    }
}
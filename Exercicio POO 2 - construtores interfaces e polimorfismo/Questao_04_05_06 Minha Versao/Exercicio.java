public class Exercicio{
    public static void main(String[] args){
        
        Moeda m1 = new Real();
        Moeda m2 = new Euro();

        System.out.println("Moeda: " + m1.getNome());
        System.out.println("Valor em Dolar: " + m1.getValorEmDolar());

        System.out.println("==========");

        System.out.println("Moeda: " + m2.getNome());
        System.out.println("Moeda: " + m2.getValorEmDolar());



    }

}

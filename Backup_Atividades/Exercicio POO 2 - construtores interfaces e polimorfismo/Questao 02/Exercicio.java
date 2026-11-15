public class Exercicio {
    public static void main(String args[]) {
        Filho a = new Filho("Joao");
        Filho b = new Filho("Joaquim");
        Pai c = new Pai("Francisco");
        
        c.setA("Maria");
        System.out.println(c.getA());
        
        a.setX(10);
        b.setX(5);
        a.setX(4);
        
        System.out.println(b.getX());
        
        Filho d = b;
        d.setA("Haroldo");
        b.setA("Mariano");
        
        System.out.println(b.getA());
        imprimeFilho(b);
    }
    
    public static void imprimeFilho(Filho a) {
        System.out.println(a);
    }
}
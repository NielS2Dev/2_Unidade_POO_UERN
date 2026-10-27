public class Exercicio2 {
    public static void main(String args[]) {
        Filho2 a = new Filho2("Joao");
        Filho2 b = new Filho2("Joaquim");
        Pai2 c = new Pai2("Francisco");
        
        c.setA("Maria");
        System.out.println(c.getA()); // Agora será "Maria"
        
        a.setX(10);
        b.setX(5);
        a.setX(4);
        
        System.out.println(b.getX()); // Agora será 5, pois o X de 'b' não é afetado pelo X de 'a'
        
        Filho2 d = b; // 'd' aponta para a mesma memória que 'b'
        d.setA("Haroldo");
        b.setA("Mariano"); 
        
        System.out.println(b.getA()); // Será "Mariano", a última alteração feita no objeto
        imprimeFilho(b);
    }

    public static void imprimeFilho(Filho2 a) {
        System.out.println(a);
    }
}

class Pai2 {
    private String a;

    public Pai2(String s) {
        a = s;
        System.out.println("Construtor Pai - 2");
    }

    public String getA() { return a; }

    public void setA(String a) {
        this.a = a; // CORREÇÃO: agora altera o atributo da classe
    }

    public String toString() { return a; }
}

class Filho2 extends Pai2 {
    private int x = 0; // CORREÇÃO: removido o "static" para ser individual por instância

    public Filho2(String a) {
        super(a);
        System.out.println("Construtor Filho - 2");
    }

    // CORREÇÃO: métodos de acesso perderam o "static"
    public void setX(int p) { x = p; }
    public int getX() { return x; }
}
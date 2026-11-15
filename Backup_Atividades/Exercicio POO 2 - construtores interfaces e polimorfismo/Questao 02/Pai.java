public class Pai {
    private String a;
    
    public Pai(String s) {
        System.out.println("Construtor Pai - 1");
        a = s;
    }
    
    public String getA() {
        return a;
    }
    
    public void setA(String a) {
        a = this.a; // O bug intencional do professor está aqui
    }
    
    public String toString() { 
        return a; 
    }
}
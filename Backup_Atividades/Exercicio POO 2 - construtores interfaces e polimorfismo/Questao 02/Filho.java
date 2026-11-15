public class Filho extends Pai {
    private static int x = 0;
    
    public Filho(String a) {
        super(a);
        System.out.println("Construtor Filho - 1");
    }
    
    public static void setX(int p) { x = p; }
    public static int getX() { return x; }
}
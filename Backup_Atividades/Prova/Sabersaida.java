public class ExercicioTreino2 {
    public static void main(String args[]) {
        Carro c1 = new Carro("Prata");
        Carro c2 = new Carro("Preto");
        Veiculo v1 = new Veiculo("Branco");
        
        v1.setCor("Azul");
        System.out.println(v1.getCor());
        
        c1.setLimiteVelocidade(80);
        c2.setLimiteVelocidade(100);
        c1.setLimiteVelocidade(120);
        
        System.out.println(c2.getLimiteVelocidade());
        
        Veiculo v2 = c1;
        v2.setCor("Vermelho");
        System.out.println(c1.getCor());
    }
}

class Veiculo {
    private String cor;

    public Veiculo(String cor) {
        this.cor = cor; // Aqui o this foi usado corretamente no construtor!
        System.out.println("Montou Veiculo");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        // Cuidado com a pegadinha aqui!
        cor = cor; 
    }
}

class Carro extends Veiculo {
    private static int limiteVelocidade = 0;

    public Carro(String cor) {
        super(cor);
        System.out.println("Montou Carro");
    }

    public static void setLimiteVelocidade(int limite) {
        limiteVelocidade = limite;
    }

    public static int getLimiteVelocidade() {
        return limiteVelocidade;
    }
}
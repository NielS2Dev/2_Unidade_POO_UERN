public class Real implements Moeda {
    
    @Override 
    public  double getValor(){
        return 1.0;
    }

    @Override 
    public String getNome(){
        return "Real";
    }

    @Override
    public double getValorEmDolar(){
        return 0.20;
    }
}

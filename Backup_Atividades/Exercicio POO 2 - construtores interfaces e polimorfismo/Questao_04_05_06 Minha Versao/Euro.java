public class Euro implements Moeda{

    @Override 
    public double getValor(){
        return 1.0
    }

    @Override
    public String getNome(){
        return "Euro";
    }

    @Override
    public double getValorEmDolar(){
        return 1.08;
    }
}
public interface Veiculo{
    String getMarca();
    int getAno();
}

public class Carro implements Veiculo{
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String getMarca(){return this.marca;}

    @Override
    public int getAno(){return this.ano;}

}

public class Moto implements Veiculo{
    private String marca;
    private int ano;

    public Moto(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String getMarca(){return this.marca;}

    @Override
    public int getAno(){return this.ano;}
}
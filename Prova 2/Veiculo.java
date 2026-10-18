public interface Veiculo {
    String getMarca();
    int getAno();
}

public class Carro implements Veiculo{
    private String marca;
    private int ano;

    public carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public int getAno() {
        return this.ano;
    }
}

public class Moto implements Veiculo{
    private String marca;
    private int ano;

    public moto(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String getMarca(){
        return this.marca;
    }

    @Override
    public int getAno(){
        return this.ano;
    }
}
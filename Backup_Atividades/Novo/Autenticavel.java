public interface Autenticavel {
    boolean autenticar(String senha);
}

public interface Bonificavel{
    double calcularBonificacao();
}

public interface Contratavel{
    void exibirContrato();
}

public class Funcionario{
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double Salario){
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

}

public class Gerente extends Funcionario implements Autenticavel, Bonificavel{

    private String senhaDoSistema = '12345';

    public Gerente(String nome, double salario){
        super(nome, salario, "Gerente")
    }

    @Override
    public boolean autenticar(String senha){
        this.senha = senha;
    }

}
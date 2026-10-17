public class Gerente extends Funcionario implements Autenticavel, Bonificavel, Contratavel{

    public Gerente(String nome, double salario){
        super(nome, salario, "Gerente");
    }

    @Override 
    public boolean autenticar(String senha){`
        return true;
    }

    @Override 
    public double calcularBonificacao(){
        return getSalario() * 0.15;
    }
}
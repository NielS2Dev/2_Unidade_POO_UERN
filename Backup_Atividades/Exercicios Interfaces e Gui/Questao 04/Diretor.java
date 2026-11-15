public class Diretor extends Funcionario implements Autenticavel, Contratavel, Bonificavel{
    
    public Diretor(String nome, double salario){
        super(nome, salario, "Diretor");
    }

    @Override
    public boolean autenticar(String senha){
        return true;
    }

    @Override
    public double calcularBonificacao(){
        return getSalario() * 0.20;
    }

    @Override
    public void exibirContrato(){
        System.out.println("O Seu contrato é: " + getNome());
    }
}
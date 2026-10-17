public class Desenvolvedor extends Funcionario implements  Autenticavel, Bonificavel, Contratavel{

    public Desenvolvedor(String nome, double salario){
        super(nome, salario. "Desenvolvedor");

    }

    @Override
    public double calcularBonificacao(){
        return getSalario() * 0.20;
    }

    @Override
    public void exibirContrato(){
        System.out.println("O Salário desse corno é " + getNome());
    }
}
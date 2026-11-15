public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos
        Gerente gerente = new Gerente("Carlos", 8000.0);
        Diretor diretor = new Diretor("Ana", 15000.0);
        Desenvolvedor dev = new Desenvolvedor("Lucas", 5000.0);

        // Criando o array do tipo Bonificavel (Polimorfismo!)
        Bonificavel[] funcionariosBonificaveis = new Bonificavel[3];
        funcionariosBonificaveis[0] = gerente;
        funcionariosBonificaveis[1] = diretor;
        funcionariosBonificaveis[2] = dev;

        double bonificacaoTotal = 0;

        // Percorrendo o array para calcular a bonificação total
        for (Bonificavel b : funcionariosBonificaveis) {
            bonificacaoTotal += b.calcularBonificacao();
        }

        System.out.println("Bonificação Total a ser paga: R$ " + bonificacaoTotal);
    }
}
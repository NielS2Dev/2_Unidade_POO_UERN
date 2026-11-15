public class Exercicio {
    public static void main(String args[]) {
        // Instanciando Publicacao (2 parâmetros)
        Publicacao a = new Publicacao("Revista Cientifica", "UERN");
        
        // Polimorfismo: Guarda um Livro numa referência de Publicacao
        Publicacao b = new Livro("Java Como Programar", "Deitel", 77.5);
        
        // Instanciando Livro normalmente
        Livro c = new Livro("Core Java", "Hostman", 123.2);
        
        // Testando os Getters
        System.out.println(a.getTitulo() + " " + a.getAutor());
        System.out.println(c.getTitulo() + " " + c.getAutor() + " " + c.getPreco());
        
        // Testando o toString() automático de cada objeto
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }
}
package Gabarito;
public class Exercicio {
    public static void main(String args[]) {
        // Dados informados: Titulo, Autor
        Publicacao a = new Publicacao("Revista Cientifica", "UERN");
        
        // Dados informados: Titulo, Autor, Preço;
        Publicacao b = new Livro("Java Como Programar", "Deitel", 77.5);
        
        // Dados informados: Titulo, Autor, Preço;
        Livro c = new Livro("Core Java", "Hostman", 123.2);
        
        System.out.println(a.getTitulo() + " " + a.getAutor());
        System.out.println(c.getTitulo() + " " + c.getAutor() + " " + c.getPreco());
        
        System.out.println(a); // Imprime o valor de todos os atributos de a
        System.out.println(b); // Idem para b
        System.out.println(c); // Idem para c
    }
}
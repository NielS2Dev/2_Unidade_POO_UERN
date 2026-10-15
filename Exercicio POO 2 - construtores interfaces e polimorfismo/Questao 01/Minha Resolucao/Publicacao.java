public class Publicacao{
    private String titulo;
    private String autor;

    public Publicacao(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    @Override 
    public String toString(){
        return "Título + " + titulo + ", Autor: " + autor;
    }
}
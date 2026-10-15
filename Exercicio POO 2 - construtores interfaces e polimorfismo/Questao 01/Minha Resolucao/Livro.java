public class Livro extends Publicacao {
    private double preco;

    public Livro(String titulo, String autor, double preco){
        super(titulo, autor);
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preço: R$ " + preco;
    }
}
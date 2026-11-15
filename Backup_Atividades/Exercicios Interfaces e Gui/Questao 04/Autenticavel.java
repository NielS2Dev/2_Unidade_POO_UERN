public interface Autenticavel {
// Somente diz: "Quem me implementar terá que ter um método chamado 'autenticar' que recebe uma String e retorna um boolean"
    boolean autenticar(String senha);

}
package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

/**
 * Controller TEMPORÁRIO compartilhado por todas as telas, só para testar a interface.
 * Depois será dividido em um controller por tela, com o banco de dados.
 */
public class TelaController {

    // ---------- Navegação ----------
    @FXML private void irCatalogo()         { Navegador.ir("Catalogo"); }
    @FXML private void irMinhasReviews()    { Navegador.ir("MinhasReviews"); }
    @FXML private void irMinhasAvaliacoes() { Navegador.ir("MinhasAvaliacoes"); }
    @FXML private void irCadastrarJogo()    { Navegador.ir("CadastrarJogo"); }
    @FXML private void irCadastro()         { Navegador.ir("Cadastro"); }
    @FXML private void irLogin()            { Navegador.ir("Login"); }
    @FXML private void sair()               { Navegador.ir("Login"); }
    @FXML private void abrirDetalhe(MouseEvent e) { Navegador.ir("DetalheJogo"); }

    // ---------- Ações (sem banco por enquanto) ----------
    @FXML private void entrar()        { Navegador.ir("Catalogo"); }   // depois: validar no banco
    @FXML private void criarConta()    { Navegador.ir("Login"); }      // depois: inserir USUARIO
    @FXML private void esqueciSenha()  { aviso("Recuperação de senha ainda não implementada."); }
    @FXML private void escolherFoto()  { aviso("Aqui abrirá o seletor de imagem (FileChooser)."); }
    @FXML private void escolherCapa()  { aviso("Aqui abrirá o seletor de imagem (FileChooser)."); }
    @FXML private void salvarJogo()    { aviso("Jogo salvo (simulação)."); Navegador.ir("Catalogo"); }
    @FXML private void avaliar()       { aviso("Avaliação registrada (simulação)."); }
    @FXML private void publicarReview(){ aviso("Review publicada (simulação)."); }
    @FXML private void editarReview()  { aviso("Editar review (simulação)."); }
    @FXML private void excluirReview() { aviso("Excluir review (simulação)."); }
    @FXML private void alterarNota()   { aviso("Alterar nota (simulação)."); }
    @FXML private void removerNota()   { aviso("Remover avaliação (simulação)."); }

    private void aviso(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
        a.setHeaderText(null);
        a.showAndWait();
    }
}

package app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navegador {
    private static Stage stage;

    public static void init(Stage s) {
        stage = s;
    }

    /** Troca de tela. Ex.: Navegador.ir("Login") abre /fxml/Login.fxml */
    public static void ir(String nomeFxml) {
        try {
            Parent root = FXMLLoader.load(Navegador.class.getResource("/fxml/" + nomeFxml + ".fxml"));
            stage.setScene(new Scene(root, 1280, 720));
            stage.centerOnScreen();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao abrir a tela " + nomeFxml, e);
        }
    }
}

package app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Navegador {
    // 1.25 -> 1600x900 | 1.5 -> 1920x1080 | 1.0 -> 1280x720
    private static final double LARGURA = 1280;
    private static final double ALTURA = 720;
    private static final double ZOOM = 1.4;

    private static Stage stage;

    public static void init(Stage s) { stage = s; }

    public static Stage getStage() { return stage; }

    public static void ir(String nomeFxml) {
        try {
            Parent root = FXMLLoader.load(Navegador.class.getResource("/fxml/" + nomeFxml + ".fxml"));
            root.getTransforms().add(new Scale(ZOOM, ZOOM, 0, 0));
            stage.setScene(new Scene(new Group(root), LARGURA * ZOOM, ALTURA * ZOOM));
            stage.centerOnScreen();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao abrir a tela " + nomeFxml, e);
        }
    }
}
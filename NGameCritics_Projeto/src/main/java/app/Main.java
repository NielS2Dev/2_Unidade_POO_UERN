package app;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("NGameCritics");
        stage.setResizable(false);          // janela fixa 1280x720
        Navegador.init(stage);
        Navegador.ir("Splash");
        stage.show();

        PauseTransition espera = new PauseTransition(Duration.seconds(5));
        espera.setOnFinished(e -> Navegador.ir("Login"));
        espera.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.stage.Stage;

import javafx.scene.control.Alert;

public class AlertTest extends Application {
    
    @Override
    public void start(final Stage stage){
        final Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure");
        alert.showAndWait();
    }

    public static void main(final String... args){
        Application.launch(args);
    }
}

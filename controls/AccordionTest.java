import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;

public class AccordionTest extends Application{

    @Override
    public void start(final Stage stage){
        final TitledPane tile1 = new TitledPane("Top", new Button("Button_Top"));
        final TitledPane tile2 = new TitledPane("Middle", new Button("Button_Middle"));
        final TitledPane tile3 = new TitledPane("Bottom", new Button("Button_Bottom"));

        final Accordion accordion = new Accordion();
        accordion.getPanes().addAll(tile1, tile2, tile3);

        stage.setScene(new Scene(accordion));
        stage.setTitle("Accordion Test");
        stage.setMaxWidth(500);
        stage.setMaxHeight(500);

        stage.setMinWidth(500);
        stage.setMinHeight(500);

        stage.show();
    }

    public static void main(final String... args){
        launch(args);
    }
}

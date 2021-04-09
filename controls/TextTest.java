import javafx.application.Application;

import javafx.geometry.Pos;

import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class TextTest extends Application{
    
    @Override
    public void start(final Stage stage){

        final TextField textField = new TextField("hello world");
        textField.setPrefColumnCount(10);
        textField.setAlignment(Pos.BOTTOM_RIGHT);

        final TextArea textArea = new TextArea( """
            Hey this is a multi line text 
            using java feature of multiline text
            I am very happy using multi line text
            """
        );
        final TextInputDialog textInputDialog = new TextInputDialog("defaultValue");
        textInputDialog.showAndWait();
        stage.setScene(new Scene(new Group(textField, textArea)));
        stage.setTitle("TextTest");
        stage.setMinWidth(700);
        stage.setMaxWidth(700);
        stage.setMinHeight(700);
        stage.setMaxHeight(700);
        stage.show();
    }
    public static void main(final String... args){
        launch(args);
    }
}

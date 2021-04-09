import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

import javafx.geometry.Orientation;

public class ToolBarTest extends Application{
    
    @Override
    public void start(final Stage stage){
        final ToolBar toolBar = 
        new ToolBar(
            new Button("New"),
            new Button("Open"),
            new Button("Save"),
            new Button("Clean")
        );
        toolBar.setOrientation(Orientation.VERTICAL);
        stage.setTitle("Toolbar Test");
        stage.setScene(new Scene(toolBar));
        stage.setMinWidth(500);
        stage.setMaxWidth(500);

        stage.setMinHeight(500);
        stage.setMaxHeight(500);
        stage.show();
    }
}

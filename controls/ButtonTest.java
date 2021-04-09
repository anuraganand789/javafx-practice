import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Tooltip;
import javafx.scene.text.TextAlignment;

import javafx.util.Duration;

public class ButtonTest extends Application {
    
    @Override
    public void start(final Stage stage){
        final ButtonBar buttonBar = new ButtonBar(ButtonBar.BUTTON_ORDER_LINUX);

        final Tooltip toolTip = new Tooltip();
        toolTip.setText("I am a tooltip");
        //toolTip.setShowDuration(Duration.millis(100));
        toolTip.setTextAlignment(TextAlignment.RIGHT);

        final Button button = new Button("Say Hello");
        button.setPrefSize(60, 60);
        button.setTooltip(toolTip);
        final Button buttonYes = new Button("Yes");
        buttonBar.setButtonData(buttonYes, ButtonBar.ButtonData.YES);

        buttonBar.getButtons().addAll(buttonYes, button);

        stage.setScene(new Scene(new Group(buttonBar)));
        stage.setTitle("Button Test");

        stage.setMinHeight(200);
        stage.setMinWidth(200);

        stage.setMaxHeight(200);
        stage.setMaxWidth(200);

        stage.show();
    }

    public static void main(final String... args){
        Application.launch(args);
    }
}

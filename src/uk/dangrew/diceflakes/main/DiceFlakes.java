package uk.dangrew.diceflakes.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import uk.dangrew.diceflakes.hexagon.Generator;
import uk.dangrew.diceflakes.hexagon.Hexagon;
import uk.dangrew.diceflakes.hexagon.Shape;
import uk.dangrew.diceflakes.ui.FlakeView;

/**
 * Entry point to the system for launching.
 */
public class DiceFlakes extends Application {

    static final String TITLE = "Dice Flakes!";

    public DiceFlakes() {
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle(TITLE);
        stage.setOnCloseRequest(event -> {
            System.exit(0);
        });

        BorderPane wrapper = new BorderPane();
        Scene scene = new Scene(wrapper);
        stage.setScene(scene);

        FlakeView flakeView = new FlakeView();
        wrapper.setCenter(flakeView);

        Shape shape = new Hexagon();
        flakeView.outlineShape(shape);
        new Generator(shape, flakeView).generate();

        stage.show();
        stage.setWidth(600);
        stage.setHeight(600);
    }//End Method

    public static void main(String[] args) {
        launch();
    }//End Method

}//End Class

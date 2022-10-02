package uk.dangrew.diceflakes.ui;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import uk.dangrew.diceflakes.hexagon.Hexagon;

import java.util.stream.IntStream;

public class FlakeView extends Group {

    public FlakeView(){
        IntStream.of(1, 2, 3, 4, 5, 6).forEach(diceRoll -> {
            getChildren().add(new Circle(Hexagon.xFor(diceRoll), Hexagon.yFor(diceRoll), 10));
        });
    }

    public void addPoint(int x, int y){
        getChildren().add(new Circle(x, y, 1));
    }
}

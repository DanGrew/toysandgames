package uk.dangrew.diceflakes.ui;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import uk.dangrew.diceflakes.hexagon.Shape;

import java.util.stream.IntStream;

public class FlakeView extends Group {

    public void outlineShape(Shape shape){
        IntStream.range(1, shape.edges() + 1).forEach(diceRoll -> {
            getChildren().add(new Circle(shape.xFor(diceRoll), shape.yFor(diceRoll), 10));
        });
    }

    public void addPoint(int x, int y){
        getChildren().add(new Circle(x, y, 1));
    }
}

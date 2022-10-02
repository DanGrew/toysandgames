package uk.dangrew.diceflakes.hexagon;

import uk.dangrew.diceflakes.ui.FlakeView;

import java.util.Random;

public class Generator {

    private static final int ITERATIONS = 100000;
    private static final double TRAVEL_PROGRESS = 2.0 / 3.0;

    private final Shape shape;
    private final Random random;
    private final FlakeView flakeView;

    public Generator(Shape shape, FlakeView flakeView) {
        this.shape = shape;
        this.flakeView = flakeView;
        this.random = new Random();
    }

    public void generate() {
        int currentX = shape.xFor(1);
        int currentY = shape.yFor(1);

        for (int i = 0; i < ITERATIONS; i++) {
            int diceRoll = random.nextInt(shape.edges()) + 1;
            System.out.println(String.format("Rolled a %d", diceRoll));

            int targetX = shape.xFor(diceRoll);
            int targetY = shape.yFor(diceRoll);

            int xDistance = targetX - currentX;
            int yDistance = targetY - currentY;

            int xTravel = (int)(xDistance * TRAVEL_PROGRESS);
            int yTravel = (int)(yDistance * TRAVEL_PROGRESS);
            System.out.println(String.format("Travelling [%d, %d]", xTravel, yTravel));

            currentX += xTravel;
            currentY += yTravel;
            System.out.println(String.format("Moved to [%d, %d]", currentX, currentY));

            flakeView.addPoint(currentX, currentY);
            System.out.println();
        }
    }
}

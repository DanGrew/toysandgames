package uk.dangrew.diceflakes.hexagon;

public class Triangle implements Shape {

    private static final double WIDTH = 250;
    private static final double HALF_WIDTH = WIDTH / 2;

    private static final double[][] coordinates = new double[][]{
            {0, 0},
            {-HALF_WIDTH, WIDTH},
            {HALF_WIDTH, WIDTH}
    };

    @Override
    public int edges() {
        return 3;
    }

    @Override
    public int xFor(int diceValue) {
        return (int) coordinates[diceValue - 1][0];
    }

    @Override
    public int yFor(int diceValue) {
        return (int) coordinates[diceValue - 1][1];
    }
}

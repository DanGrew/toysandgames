package uk.dangrew.diceflakes.hexagon;

public class TwentySidedThing implements Shape {

    private static final double SCALE = 3.0;

    private static final double[][] coordinates = new double[][]{
            {16 * SCALE, -99 * SCALE},
            {-16 * SCALE, -99 * SCALE},
            {-45 * SCALE, -89 * SCALE},
            {-71 * SCALE, -71 * SCALE},
            {-89 * SCALE, -45 * SCALE},
            {-99 * SCALE, -16 * SCALE},
            {-99 * SCALE, 16 * SCALE},
            {-89 * SCALE, 45 * SCALE},
            {-71 * SCALE, 71 * SCALE},
            {-45 * SCALE, 89 * SCALE},
            {-16 * SCALE, 99 * SCALE},
            {16 * SCALE, 99 * SCALE},
            {45 * SCALE, 89 * SCALE},
            {71 * SCALE, 71 * SCALE},
            {89 * SCALE, 45 * SCALE},
            {99 * SCALE, 16 * SCALE},
            {99 * SCALE, -16 * SCALE},
            {89 * SCALE, -45 * SCALE},
            {71 * SCALE, -71 * SCALE},
            {45 * SCALE, -89 * SCALE}
    };

    @Override
    public int edges() {
        return 20;
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
